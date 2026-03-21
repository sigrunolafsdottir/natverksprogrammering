package GUIDemo;

import java.awt.FlowLayout;
import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class JLabelDemo extends JFrame {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hejfdsfsdfsfsds");

    JLabelDemo() {
        //setLayout(new FlowLayout());
        add(panel);
        panel.add(label);
        pack();
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(JLabelDemo::new);
    }

}
