import java.io.*;
import java.net.*;

/**
 *
 * @author Felix
 */
public class SOK_1_SERVER {
    
    public static void main(String[] args) throws Exception{
        SOK_1_SERVER SERVER = new SOK_1_SERVER();
        SERVER.run();
    }
    
    public void run() throws Exception{
        
        ServerSocket SRVSOCK = new ServerSocket(444);
        Socket SOCK = SRVSOCK.accept();
        InputStreamReader IR = new InputStreamReader(SOCK.getInputStream());
        BufferedReader BR = new BufferedReader(IR);
        
        String MESSAGE = BR.readLine();
        System.out.println(MESSAGE);
        
        if(MESSAGE != null){
            PrintStream PS = new PrintStream(SOCK.getOutputStream());
            PS.println("MESSAGE recived!");
        }
        
    }
}
