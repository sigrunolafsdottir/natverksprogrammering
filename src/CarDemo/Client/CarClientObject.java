package CarDemo.Client;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import CarDemo.Server.*;


public class CarClientObject {

    CarClientObject() throws IOException {
        String hostName = "127.0.0.1";  //localhost
        int portNumber = 12345;


        try (
                Socket addressSocket = new Socket(hostName, portNumber);

                ObjectOutputStream oos = new ObjectOutputStream(addressSocket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(addressSocket.getInputStream())
        ) {
            //Car fromServer;
            String fromServer;
            String fromUser;
            Object objFromServer;
            BufferedReader stdIn =
                    new BufferedReader(new InputStreamReader(System.in));

            while ((objFromServer = ois.readObject()) != null) {
                if (objFromServer instanceof Car c){
                    System.out.println("Server: " + c.getData());
                }
                if (objFromServer instanceof String s){
                    System.out.println("Server: " + s);
                }

                fromUser = stdIn.readLine();
                if (fromUser != null) {
                    oos.writeObject(fromUser);
                }
            }


       /*     while ((fromServer = (String) ois.readObject()) != null) {
                //while ((fromServer = (Car)ois.readObject()) != null) {
                System.out.println("Server: " + fromServer);


                fromUser = stdIn.readLine();
                if (fromUser != null) {
                    oos.writeObject(fromUser);
                }
            }   */
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            e.printStackTrace();
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                    hostName);
            e.printStackTrace();
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Unknown error occurred " +
                    hostName);
            e.printStackTrace();
            System.exit(1);
        }

    }

    public static void main(String[] args) throws IOException {
        CarClientObject c = new CarClientObject();
    }

}

