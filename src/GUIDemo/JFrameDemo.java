package GUIDemo;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class JFrameDemo extends JFrame {
    
    JFrameDemo(){
        setSize(300, 300);
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        JFrameDemo g = new JFrameDemo();
    }
    
}
