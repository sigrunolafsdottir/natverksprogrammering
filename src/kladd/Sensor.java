package kladd;

import java.awt.FlowLayout;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Sensor extends JFrame {
    JFrame f = new JFrame("Weather Girl System");
    JPanel p = new JPanel();

    InetAddress toAdr = InetAddress.getLocalHost();
    int toPort = 13377;
    DatagramSocket socket = new DatagramSocket();
    DatagramPacket packet;
    byte[] data;
    String message;

    Sensor() throws IOException, NullPointerException {
        f.setLayout(new FlowLayout());
        f.setSize(300, 300);  //SIgrun
        f.add(p);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);

        String stad = JOptionPane.showInputDialog(null,"Var befinner du dig?");
        while(true){
            String temperatur = JOptionPane.showInputDialog(null,"Ange temperaturen i " + stad + ": ");
            
            if (temperatur == null || temperatur.length() == 0){  //tar hand om Cancel-tryck
                System.exit(0); 
            }
            
            message = stad + ": " + temperatur + "c";
            data = message.getBytes();
            packet = new DatagramPacket(data, data.length, toAdr, toPort);
            socket.send(packet);
        }
    }

    public static void main(String[] args)  throws IOException, NullPointerException{
        new Sensor();
    }
}