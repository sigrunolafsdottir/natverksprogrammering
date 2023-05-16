package GUIDemo;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class JFrameDemo  {

    JFrame jframe = new JFrame();

    JPanel panel = new JPanel();
    JLabel label = new JLabel("hej");
    JButton button = new JButton("Press me");
    JButton button2 = new JButton("Press me again");
    JButton button3 = new JButton("gdfgddgd");
    JButton button4 = new JButton("jghjhgjg");

    JFrameDemo() {
        jframe.add(panel);
        panel.setLayout(new GridLayout(2,2));
        panel.add(label);
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        //jframe.setSize(200, 600);
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JFrameDemo g = new JFrameDemo();
    }

}
