package LiveTCPDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    int port = 12345;

    public Client() throws Exception {

        try (Socket s = new Socket("127.0.0.1", port);
             PrintWriter p = new PrintWriter(s.getOutputStream(), true);
             BufferedReader buf = new BufferedReader(new InputStreamReader(s.getInputStream()));
        ) {

            while (true) {
                p.println("Hejsan Svejsan");
                Thread.sleep(3000);
            }

        }


    }

    public static void main(String[] args) throws Exception {
        Client s = new Client();
    }
}
