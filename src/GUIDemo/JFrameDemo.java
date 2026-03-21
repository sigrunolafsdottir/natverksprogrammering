package GUIDemo;

import java.awt.*;
import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class JFrameDemo extends JFrame  {

    public JFrameDemo() {
        setSize(300, 300);
        //jframe.pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JFrameDemo::new);
    }

}
