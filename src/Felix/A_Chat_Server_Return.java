package Felix;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class A_Chat_Server_Return implements Runnable {
    
    // globals
    Socket SOCK;
    private Scanner INPUT;
    private PrintWriter OUT;
    String MESSAGE = "";
    
    //----------------------------------------------------
    public A_Chat_Server_Return(Socket x){
        this.SOCK = x;
    }
    
    public void CheckConnection()throws IOException{
        
        if(!SOCK.isConnected()){
            for(int i= 1; i <= A_Chat_Server.ConnectionArray.size(); i++){
                if(A_Chat_Server.ConnectionArray.get(i) == SOCK){
                    A_Chat_Server.ConnectionArray.remove(i);
                }
            }
        }
        for(int i = 1; i <= A_Chat_Server.ConnectionArray.size(); i++){
            Socket TEMP_SOCK = (Socket) A_Chat_Server.ConnectionArray.get(i-1);
            PrintWriter TEMP_OUT = new PrintWriter(TEMP_SOCK.getOutputStream());
            TEMP_OUT.println(TEMP_SOCK.getLocalAddress().getHostName() + " disconnected!");
            TEMP_OUT.flush();
            //show disconnection at SERVEr
            System.out.println(TEMP_SOCK.getLocalAddress().getHostName() + " disconnected!");
        }
    }

//---------------------------------
    public void run(){
        try{
            try{
                INPUT = new Scanner(SOCK.getInputStream());
                OUT = new PrintWriter(SOCK.getOutputStream());

                while(true){
                    CheckConnection();
                
                    if(!INPUT.hasNext()){
                        return;
                    }
                    MESSAGE = INPUT.nextLine();

                    System.out.println("Client said: " + MESSAGE);
                    for(int i = 1; i <= A_Chat_Server.ConnectionArray.size(); i++){
                        //note if necessary take CAST below out. I added it to make it complite.
                        Socket TEMP_SOCK = (Socket) A_Chat_Server.ConnectionArray.get(i-1);
                        PrintWriter TEMP_OUT = new PrintWriter(TEMP_SOCK.getOutputStream());
                        TEMP_OUT.println(MESSAGE);
                        TEMP_OUT.flush();
                        System.out.println("Sent to: " + TEMP_SOCK.getLocalAddress().getHostName());

                    }// close for loop
                }// close while loop
            }// close inner try
            finally{
                SOCK.close();
            }
        }// close outer try
        catch(Exception X){
            System.out.println(X);
        }
    }  
}