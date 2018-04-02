package V2_ÖvnUppg7_Chatt;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Client  extends JFrame implements ActionListener {
    
    JTextArea txt = new JTextArea();
    JScrollPane sp = new JScrollPane(txt);
    JTextField skriv = new JTextField();
    JButton sluta = new JButton("Koppla ner");
    private BufferedReader in;
    private PrintWriter out;
    String name = "";
    
    public Client (){
        name = JOptionPane.showInputDialog(null, "Ange ditt chatt-alias");
        setTitle("Chat "+name);
        txt.setEditable(false);
        add(sp, BorderLayout.CENTER);
        add(skriv, BorderLayout.SOUTH);
        skriv.addActionListener(this);
        setSize(400, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        String hostName = "127.0.0.1";  //localhost
        int portNumber = 12345;
 
        try{
            Socket socket = new Socket(hostName, portNumber);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            String fromServer;

            while ((fromServer = (String)in.readLine()) != null) {
                
                if (fromServer.startsWith("WAITING_FOR_NAME")){
                    out.println(name);
                }

                if (fromServer.startsWith("MESSAGE")){
                    txt.append(fromServer.substring(8) + "\n");
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public void actionPerformed(ActionEvent e) {
        try{
            System.out.println("in action Performed "+name +" : " + skriv.getText());
            out.println(name +" : " + skriv.getText());
            skriv.setText("");
        }
        catch (Exception e1){
            e1.printStackTrace();
        }
    }
    
    public static  void main(String[] args){
        Client c = new Client();
    }

}
