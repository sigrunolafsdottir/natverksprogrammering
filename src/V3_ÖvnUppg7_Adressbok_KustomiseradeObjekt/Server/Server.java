package V3_ÖvnUppg7_Adressbok_KustomiseradeObjekt.Server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import V3_ÖvnUppg5_Adressbok_Basic.Server.Person;
import V3_ÖvnUppg5_Adressbok_Basic.Server.DAO;


public class Server {

    DAO d = new DAO();

    public Server() throws Exception {
        int portNumber = 12345;
        try (
                ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
                ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());) {
            Object inputLine;
            Person outputPerson;

            //initiaterar kommunikation med klienten
            oos.writeObject(new Initiator());

            //servar frågeloopen
            while ((inputLine = (String) ois.readObject()) != null) {

                outputPerson = d.getPersonByName(((String) inputLine).trim());
                if (outputPerson == null) {
                    oos.writeObject(new Response(false));
                } else {
                    oos.writeObject(new Response(true, outputPerson));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Server s = new Server();
    }
}
