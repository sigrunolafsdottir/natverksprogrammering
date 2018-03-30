package GUIDemo;

import java.awt.*; 
import java.awt.event.*; 
import java.io.*; 
import java.util.Vector;
import javax.swing.*; 
import static javax.swing.JFrame.EXIT_ON_CLOSE;

 public class RadioButtonDemo extends JFrame implements ActionListener { 
   
   private final JPanel p = new JPanel(); 
   private final JRadioButton red = new JRadioButton("Röd", true);
   private final JRadioButton blue = new JRadioButton("Blå", false);
   private final JRadioButton yellow = new JRadioButton("Yellow", false);
   ButtonGroup bg = new ButtonGroup();
   private final JLabel displayArea = new JLabel("Du valde rött");

   public RadioButtonDemo() { 
     p.setLayout(new GridLayout(4,1)); 
     p.add(red); p.add(blue); p.add(yellow); 
     bg.add(red); bg.add(blue); bg.add(yellow); 
     p.add(displayArea);
     p.setBackground(Color.red);
     add(p);
 
     red.addActionListener(this);  
     blue.addActionListener(this);  
     yellow.addActionListener(this);  
     pack(); 
     setVisible(true); 
     setDefaultCloseOperation(EXIT_ON_CLOSE);  
   } 

   
   public void actionPerformed(ActionEvent e) { 
       
     if (e.getSource() == red){
         p.setBackground(Color.red);
         displayArea.setText("Du valde rött");
     }
     else if (e.getSource() == blue){
         p.setBackground(Color.blue);
         displayArea.setText("Du valde blått");
     }
     else if (e.getSource() == yellow){
         p.setBackground(Color.yellow);
         displayArea.setText("Du valde gult");
     }
    } 

 
   public static void main (String[] arg) { 
     RadioButtonDemo t = new RadioButtonDemo(); 
   }   
 }

