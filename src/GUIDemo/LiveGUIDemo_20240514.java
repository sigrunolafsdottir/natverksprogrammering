package GUIDemo;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LiveGUIDemo_20240514 implements ActionListener {

    JFrame jframe = new JFrame();
    JPanel panel = new JPanel();
    JPanel southpanel = new JPanel();
    JButton button = new JButton("Knapp");
    JButton button2 = new JButton("Knapp2");
    JButton button3 = new JButton("Knapp3");
    JLabel label = new JLabel("Etikett");

    LiveGUIDemo_20240514() {
        panel.setLayout(new BorderLayout());

        jframe.add(panel);
        panel.add(label, BorderLayout.NORTH);
        panel.add(southpanel, BorderLayout.SOUTH);
        southpanel.add(button);
        southpanel.add(button2);
        panel.add(button3, BorderLayout.WEST);

        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        //jframe.setSize(50, 50);
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LiveGUIDemo_20240514 j = new LiveGUIDemo_20240514();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            System.out.println("knapp pressed");
        }
        else if (e.getSource()==button2)
            System.out.println("knapp2 pressed");
        else System.out.println("knapp3 pressed");
    }
}
