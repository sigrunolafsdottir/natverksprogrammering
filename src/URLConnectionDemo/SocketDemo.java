package URLConnectionDemo;

import java.net.*;
import java.io.*;


public class SocketDemo {

    public static void main(String[] args) throws Exception {
            
            Socket s = new Socket(InetAddress.getByName("localhost"), 8080);
            PrintWriter pw = new PrintWriter(s.getOutputStream());
            pw.println("GET /WebApplicationDemo/rest/BookService/books HTTP/1.1");
            pw.println("Host: localhost");
            pw.println("");
            pw.flush();
            
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String t;
            while((t = br.readLine()) != null) System.out.println(t);
            br.close();
    }
}
