package V3_ÖvnUppg0b;


import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


//Server sending messages to client 

public class Server {
    
    public Server(){
        int portNumber = 12345;

        try ( 
            ServerSocket serverSocket = new ServerSocket(portNumber);
            Socket clientSocket = serverSocket.accept();
            PrintWriter out =
                new PrintWriter(clientSocket.getOutputStream(), true);
        ) {
            
            while (true) {
                out.println("message from server");
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Server s = new Server();
    }
}