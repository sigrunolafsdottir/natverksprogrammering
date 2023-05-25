package V3_ÖvnUppg2_Adressbok.Klient;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import V3_ÖvnUppg1_Adressbok.Server.Person; //


public class ObjectClient {

    ObjectClient() throws Exception {
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

                if (fromServer instanceof Person p) {
                    System.out.println("Server: " + p.getAddress());
                }
                else if (fromServer instanceof String s) {
                    System.out.println("Server: " + s);
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
        ObjectClient c = new ObjectClient();
    }

}
