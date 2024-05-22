package LiveTCP2024;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//Sends data to server
public class Client {

    int port = 12345;

    public Client() throws IOException {
        try (Socket s = new Socket("127.0.0.1", port);
             PrintWriter out = new PrintWriter(s.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()))) {

            while(true){
                out.println("Hejsan från klienten 3");
                Thread.sleep(3000);
            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args)  throws IOException {
        Client c = new Client();

    }
}
