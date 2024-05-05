package V3_ÖvnUppg2_Adressbok.Server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.Month;

import V3_ÖvnUppg1_Adressbok.Server.Person;
import V3_ÖvnUppg1_Adressbok.Server.DAO;


public class ObjectServer {

    DAO d = new DAO();

    public ObjectServer() throws Exception {
        int portNumber = 12345;

        try (
                ServerSocket serverSocket = new ServerSocket(portNumber);
                Socket clientSocket = serverSocket.accept();
                ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());) {

            Object inputLine;
            Person outputPerson;

            oos.writeObject("Vems adress behöver du veta");

            while ((inputLine = ois.readObject()) != null) {
                //vi kan casta direkt eftersom vi vet att klienten alltid skickar String
                //om klienten skickar nåt annat kommer vi att få fel
                outputPerson = d.getPersonByName(((String) inputLine).trim());
                if (outputPerson == null) {
                    oos.writeObject("Denna person finns inte i databasen");
                } else {
                    oos.writeObject(outputPerson);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ObjectServer s = new ObjectServer();
    }
}
