package V3_ÖvnUppg5_multiVäder_grafisk;


import javax.swing.*;
import java.io.IOException;
import java.net.*;

public class TemperatureCollector extends JFrame {

    JPanel panel = new JPanel();
    JTextArea text = new JTextArea(30, 20);

    public TemperatureCollector() throws IOException {
        this.add(panel);
        panel.add(text);
        this.pack();
        this.setLocation(500, 300);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String ip = "234.235.236.237";
        InetAddress iadr = InetAddress.getByName(ip);
        int port = 12540;

        MulticastSocket socket = new MulticastSocket(port);
        InetSocketAddress group = new InetSocketAddress(iadr, port);
        //got by running ListNetworkInterface-program, yours may be different
        NetworkInterface netIf = NetworkInterface.getByName("wlan3");

        socket.joinGroup(group, netIf);

        byte[] data = new byte[256];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        while (true) {
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            text.setText(text.getText() + " " + message + "\n");
            //System.out.println(message);
        }
    }



    public static void main(String[] args) throws  IOException {
        TemperatureCollector tc = new TemperatureCollector();
    }
}
