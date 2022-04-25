package ExperimentDemo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;


public class ExperDemo extends JFrame implements ActionListener {

    String namn;
    InetAddress iadr;
    int myPort;
    int otherPort;
    DatagramSocket so;
    JTextArea txt = new JTextArea();
    JScrollPane sp = new JScrollPane(txt);
    JTextField skriv = new JTextField();
    JButton sluta = new JButton("Koppla ner");
    Timer timer = new Timer(10000, this);
    //InetSocketAddress group;
    NetworkInterface netIf = NetworkInterface.getByName("wlan2");

    public ExperDemo(String användarnamn,
                            String gruppadr, int myPort, int otherPort) throws IOException{
        namn = användarnamn;
        iadr = InetAddress.getByName(gruppadr);
        this.myPort = myPort;
        this.otherPort = otherPort;

        so = new DatagramSocket(myPort);


        sändMedd("UPPKOPPLAD");

        setTitle("Chat "+namn);
        txt.setEditable(false);
        add(sluta, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);
        add(skriv, BorderLayout.SOUTH);
        sluta.addActionListener(this);
        skriv.addActionListener(this);
        setSize(400, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        timer.start();

        byte[] data = new byte[1024];
        while(true){
            try{
                DatagramPacket packet = new DatagramPacket(data,
                        data.length);
                so.receive(packet);
                String medd = new String(data, 0,
                        packet.getLength());
                txt.append(medd +"\n");
            }
            catch (IOException e){
                break;
            }
        }
    }

    private void sändMedd(String s){

        byte[] data = (namn + ": " +s).getBytes();
        DatagramPacket packet= new DatagramPacket(data,
                data.length, iadr, otherPort);
        try{
            so.send(packet);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == skriv){
            sändMedd(skriv.getText());
            skriv.setText("");
        }
        else if(e.getSource() == sluta){
            sändMedd("NEDKOPPLAD");
            System.exit(0);
          /*  try {
                so.leaveGroup(group, netIf);
            }
            catch (IOException ie){
                so.close();
                dispose();
                System.exit(0);
            }*/
        }
        else {
            sändMedd("Hej allesammans");
        }
    }

    public static void main (String[] args) throws IOException{
        String namn = "Sigrun";
        ExperDemo c = new ExperDemo(namn,
                //        "234.235.236.237", 12540);
                "localhost", 12346, 12345);
    }
}

