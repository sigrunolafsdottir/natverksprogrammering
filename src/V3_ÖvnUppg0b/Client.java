package V3_ÖvnUppg0b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;


//Client getting messages from server and printing 

public class Client {

    Client(){
        String hostName = "127.0.0.1";  //localhost
        int portNumber = 12345;

    try (
        Socket addressSocket = new Socket(hostName, portNumber);
        BufferedReader in = new BufferedReader(
            new InputStreamReader(addressSocket.getInputStream()));
    )
    {
        String fromServer;
            
        while ((fromServer = in.readLine()) != null) {
            if (fromServer != null) {
                System.out.println(fromServer);
            }
        }
    }
    catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
    } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                hostName);
            System.exit(1);
    }   
        
    }
    
    public static void main(String[] args){
        Client c = new Client();
    }
    
}