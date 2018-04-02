package V2_ÖvnUppg7_Chatt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Handler extends Thread{
    
    private String name;
    private Socket socket;
    private UserTracker userTracker;
    private PrintWriter out;
    private BufferedReader in;
    int id;
    
    public Handler (Socket socket, UserTracker userTracker, int id){
        this.socket = socket;
        this.userTracker = userTracker;
        this.id = id;
    }
    
    public void run(){
        
         try{
            out = new PrintWriter(socket.getOutputStream(), true);  //true for autoflush
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println("WAITING_FOR_NAME");
            name = in.readLine();
            
            //add name to userTracers list of klients
            synchronized (userTracker) {
                if (!userTracker.containsName(name)) {
                    userTracker.addName(name);
                }
            }
            userTracker.addWriter(out);
            
            while(true){
                String input = in.readLine();
                if (input == null) {
                    return;
                }
                for (PrintWriter writer : userTracker.getWriters()) {
                    writer.println("MESSAGE " + input);
                }
            }
            
        }
         catch (Exception e){
             e.printStackTrace();
         }
         finally {
            // Klienten har stängts ner. Vi behöver städa ur userTrackern
            if (name != null) {
                userTracker.removeName(name);
            }
            if (out != null) {
                userTracker.removeWriter(out);
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    


}
