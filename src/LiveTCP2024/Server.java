package LiveTCP2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {
    Socket socket;

    public Server(Socket socket){
        this.socket = socket;
    }

    public void run() {
        try(
            //PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))){

                String temp;
                while((temp = in.readLine())!= null){
                    System.out.println(temp);
                }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
