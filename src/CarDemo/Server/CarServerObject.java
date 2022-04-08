package CarDemo.Server;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class CarServerObject {

    Database d = new Database();

    public CarServerObject() {
        int portNumber = 12345;

        try (
                ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
                ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
        ) {
            String inputLine;
            String outputLine;

            oos.writeObject("Vilken bil vill du slå upp?");

            while ((inputLine = (String) ois.readObject()) != null) {
                outputLine = d.getCarData(inputLine.trim());
                if (outputLine == null) {
                    oos.writeObject("Denna bil finns inte i databasen");
                } else {
                    oos.writeObject(outputLine);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CarServerObject s = new CarServerObject();
    }
}
