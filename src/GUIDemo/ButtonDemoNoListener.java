package GUIDemo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonDemoNoListener extends JFrame {
    
    JLabel label = new JLabel("Hej");
    JPanel p = new JPanel();
    JPanel panel2 = new JPanel();
    JButton button = new JButton("Tryck här");
    JButton button1 = new JButton("Tryck här1");
    JButton button2 = new JButton("Tryck här2");
    JButton button3 = new JButton("Tryck här3");
    JButton button4 = new JButton("Tryck här4");
    JTextField text = new JTextField(30);
    JTextArea area = new JTextArea(20, 100);
    
    
    
    ButtonDemoNoListener(){
        //p.setLayout(new GridLayout(5,5));
        this.setLayout(new BorderLayout());
        this.add(panel2, BorderLayout.NORTH);
        panel2.setLayout(new FlowLayout());
        
        p.setLayout(new BorderLayout());
        this.add(p, BorderLayout.CENTER);
        panel2.add(label);
        panel2.add(button);
        panel2.add(button1);
        panel2.add(area);
        p.add(button2, BorderLayout.CENTER);
        p.add(button3, BorderLayout.EAST);
        p.add(button4, BorderLayout.SOUTH);
        
        //this.setSize(500, 500);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        ButtonDemoNoListener g = new ButtonDemoNoListener();
    }
    
    
    
}
