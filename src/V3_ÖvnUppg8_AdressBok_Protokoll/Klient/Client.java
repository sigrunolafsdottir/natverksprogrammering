package V3_ÖvnUppg8_AdressBok_Protokoll.Klient;

import V3_ÖvnUppg7_Adressbok_KustomiseradeObjekt.Server.Initiator;
import V3_ÖvnUppg7_Adressbok_KustomiseradeObjekt.Server.Response;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class Client {

    Client() throws Exception {
        String hostName = "127.0.0.1";  //localhost
        int portNumber = 12345;

        try (
                Socket addressSocket = new Socket(hostName, portNumber);
                ObjectOutputStream oos = new ObjectOutputStream(addressSocket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(addressSocket.getInputStream());) {

            Object fromServer;
            String fromUser;
            BufferedReader stdIn =
                    new BufferedReader(new InputStreamReader(System.in));

            while ((fromServer = ois.readObject()) != null) {

                if (fromServer instanceof Initiator) {
                    System.out.println("Connection setup complete");
                    System.out.println("What person would you like to look up?");
                } else if (fromServer instanceof Response) {
                    if (!((Response) fromServer).getSuccess()) {
                        System.out.println("Personen finns inte i databasen");
                    } else {
                        System.out.println(((Response) fromServer).getPerson().getAddress());
                    }
                }

                fromUser = stdIn.readLine();
                if (fromUser != null) {
                    System.out.println("Client: " + fromUser);
                    oos.writeObject(fromUser);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        Client c = new Client();
    }

}
