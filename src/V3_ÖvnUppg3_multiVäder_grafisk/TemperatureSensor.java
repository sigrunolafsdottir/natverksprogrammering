package V3_ÖvnUppg3_multiVäder_grafisk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;

public class TemperatureSensor extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JTextField text = new JTextField(10);
    JButton button = new JButton("rapportera");
    String city;
    String temperature = "";
    String dataToSend = "";
    String ip = "234.235.236.237";
    InetAddress iadr = InetAddress.getByName(ip);
    int port = 12540;
    MulticastSocket socket = new MulticastSocket();

    public TemperatureSensor() throws IOException{

        city = JOptionPane.showInputDialog(null, "Ange stad");
        if (city == null || city.length() == 0) {  //tar hand om Cancel-tryck
            System.exit(0);
        }

        this.setTitle(city);
        this.add(panel);
        panel.add(text);
        panel.add(button);
        button.addActionListener(this);
        text.addActionListener(this);
        this.pack();
        this.setLocation(800, 300);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent ae)  {

        temperature = text.getText();
        dataToSend = city + ", " + temperature;
        byte[] data = dataToSend.getBytes();

        DatagramPacket packet = new DatagramPacket(data, data.length, iadr, port);
        try {
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }

        text.setText("");
    }


    public static void main(String[] args) throws  IOException, InterruptedException {
        TemperatureSensor ts = new TemperatureSensor();
    }


}
