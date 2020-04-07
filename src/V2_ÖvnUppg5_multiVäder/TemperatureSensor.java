package V2_ÖvnUppg5_multiVäder;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TemperatureSensor {
    
    public static void main(String[] args) throws UnknownHostException, SocketException, IOException, InterruptedException{
        
        String temperature = "";
        String dataToSend = "";
        String ip = "234.235.236.237";
        InetAddress iadr = InetAddress.getByName(ip);
        int port = 12540;
        
        InetSocketAddress group = new InetSocketAddress(iadr, port);
        //got by running ListNetworkInterface-program, yours may be different
        NetworkInterface netIf = NetworkInterface.getByName("wlan1"); 
        
        Scanner sc = new Scanner(System.in);
        String city = JOptionPane.showInputDialog(null, "Ange stad");
        if (city == null || city.length() == 0){  //tar hand om Cancel-tryck
            System.exit(0); 
        }
        
        MulticastSocket socket = new MulticastSocket();
        //socket.joinGroup(iadr);  //deprecated
        socket.joinGroup(group, netIf);   
        //socket.joinGroup(group, null);  //works for me
        
        while(sc.hasNext()){
            temperature = sc.next();
            dataToSend = city+","+temperature;
            byte[] data = dataToSend.getBytes();
            DatagramPacket packet= new DatagramPacket(data, data.length, iadr, port);
            socket.send(packet);
        } 
    }
}
