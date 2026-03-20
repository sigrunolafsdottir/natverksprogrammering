package V3_ÖvnUppg2_vädersystem_grafiskt;

import V2_ÖvnUppg2_TextEditor.TextEditor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import javax.swing.*;

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

        int minPort = 55555;
        DatagramSocket socket = new DatagramSocket(minPort);
        byte[] data = new byte[256];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        while (true) {
            socket.receive(packet);
            String message = new String(packet.getData(), 0, packet.getLength());
            text.setText(text.getText() + " " + message + "\n");
            //System.out.println(message);
        }
    }

    //Här funkar inte SwingUtilities.invokeLater eftersom vi har ett blockerande call till receive
    public static void main(String[] args) throws IOException {
        TemperatureCollector tc = new TemperatureCollector();
    }


}
