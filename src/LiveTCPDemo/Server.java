package LiveTCPDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int port = 12345;

    public Server() throws Exception {

        try (ServerSocket serverS = new ServerSocket(port);
             Socket s = serverS.accept();
             PrintWriter p = new PrintWriter(s.getOutputStream(), true);
             BufferedReader buf = new BufferedReader(new InputStreamReader(s.getInputStream()));
        ) {
            String temp;
            while ((temp = buf.readLine()) != null) {
                System.out.println("Message from client" + temp);
            }

        }


    }

    public static void main(String[] args) throws Exception {
        Server s = new Server();
    }
}
