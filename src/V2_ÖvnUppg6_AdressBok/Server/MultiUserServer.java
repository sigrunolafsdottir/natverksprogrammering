package V2_ÖvnUppg6_AdressBok.Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class MultiUserServer extends Thread{
    
    private Socket clientSocket;
    
     public MultiUserServer(Socket clientSocket) throws IOException {
        this.clientSocket = clientSocket;
    }
    
    public void run(){
        try(
            ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());)
        {                      
            String inputLine;           
            Protokoll protocol = new Protokoll();
            oos.writeObject(protocol.processInput(null));
                    
            //servar frågeloopen
           while ((inputLine = (String)ois.readObject()) != null) {              
               oos.writeObject(protocol.processInput(inputLine));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
