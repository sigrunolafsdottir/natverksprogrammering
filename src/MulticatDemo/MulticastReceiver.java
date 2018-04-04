package MulticatDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketException;
import java.time.LocalDateTime;

public class MulticastReceiver  {
    
     public static void main(String[] args) throws SocketException, IOException{
        int port = 55555;
        String ip = "234.235.236.237";
        InetAddress iadr = InetAddress.getByName(ip);
        MulticastSocket socket = new MulticastSocket(port);
        socket.joinGroup(iadr);
        byte[] data = new byte[256];
        while(true){
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            System.out.println("Meddelande från "+packet.getAddress().getHostAddress() + " " +LocalDateTime.now());
            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println(message);
        }
    }
}
