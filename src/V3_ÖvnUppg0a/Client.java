package V3_ÖvnUppg0a;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


//Client getting messages from user and sending to server 

public class Client {

    Client(){
        String hostName = "127.0.0.1";  //localhost
        int portNumber = 12345;

    try (
        Socket addressSocket = new Socket(hostName, portNumber);
        PrintWriter out = new PrintWriter(addressSocket.getOutputStream(), true);
    )
    {
        String fromUser;
        BufferedReader stdIn =
                new BufferedReader(new InputStreamReader(System.in));
            
        while ((fromUser = stdIn.readLine()) != null) {
            
           // fromUser = stdIn.readLine();
            if (fromUser != null) {
                System.out.println("Reporting to server ");
                out.println(fromUser);
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