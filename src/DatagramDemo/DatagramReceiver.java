package DatagramDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class DatagramReceiver  {
    
    public void DatagramReceiver() throws SocketException, IOException{
        int minPort = 55555;
        DatagramSocket socket = new DatagramSocket(minPort);
        byte[] data = new byte[256];
        while(true){
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            System.out.println("Meddelande från "+packet.getAddress().getHostAddress());
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println(message);
        }
    }
    
    public static void main(String[] args) throws SocketException, IOException{
        DatagramReceiver dr = new DatagramReceiver();
    }
}
