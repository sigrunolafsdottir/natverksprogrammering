package GUIDemo;

import java.awt.FlowLayout;
import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class JPanelDemo extends JFrame {
    JPanel panel = new JPanel();

    JPanelDemo() {
        setLayout(new FlowLayout());
        add(panel);
        pack();
        setSize(300, 300);
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JPanelDemo());
    }

}
