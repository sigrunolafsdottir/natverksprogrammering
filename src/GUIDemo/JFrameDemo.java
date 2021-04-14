package GUIDemo;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JFrameDemo extends JFrame {
    
    JPanel panel = new JPanel();
    JLabel label = new JLabel("hej");
    JButton button = new JButton("Press me");
    
    JFrameDemo(){
        this.add(panel);
        panel.add(label);
        panel.add(button);
        
        setSize(600, 600);
        setLocation(100, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        JFrameDemo g = new JFrameDemo();
    }
    
}
