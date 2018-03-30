package DatagramDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class DatagramSender {
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        InetAddress toAdr = InetAddress.getLocalHost();
        int toPort = 55555;
        DatagramSocket socket = new DatagramSocket();
        String message;
        System.out.println("?: ");
        while((message = in.readLine()) != null){
            if (message.equals("bye"))  System.exit(0);
            byte[] data = message.getBytes();
            DatagramPacket packet = new DatagramPacket(data, data.length, toAdr, toPort);
            socket.send(packet);
            System.out.println("?: ");
        } System.exit(0);
    }
}
