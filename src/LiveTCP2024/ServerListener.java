package LiveTCP2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener {
    int port = 12345;

    public ServerListener() throws IOException {

        ServerSocket serverSocket = new ServerSocket(port);
        while(true) {
            Socket s = serverSocket.accept();
            Server server = new Server(s);
            server.start();
        }


    }

    public static void main(String[] args) throws IOException {
        ServerListener s = new ServerListener();
    }
}
