package V2_ÖvnUppg7_Chatt;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerListener {
    
    private static MultiWriter multiWriter = new MultiWriter();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
         while (true) {
            try {
                final Socket socketToClient = serverSocket.accept();
                Handler clientHandler = new Handler(socketToClient, multiWriter);
                clientHandler.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}