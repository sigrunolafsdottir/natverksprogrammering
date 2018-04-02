package V2_ÖvnUppg7_Chatt;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerListener {
    
    private static UserTracker userTracker = new UserTracker();

    public static void main(String[] args) throws IOException {
        int i = 0;
        ServerSocket serverSocket = new ServerSocket(12345);
         while (true) {
            try {
                final Socket socketToClient = serverSocket.accept();
                Handler clientHandler = new Handler(socketToClient, userTracker, i);
                i++;
                clientHandler.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}