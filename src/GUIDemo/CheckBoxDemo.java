package GUIDemo;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckBoxDemo extends JFrame implements ActionListener {

    private JPanel p = new JPanel();
    private JCheckBox red = new JCheckBox("Röd", false);
    private JCheckBox blue = new JCheckBox("Blå", false);
    private JCheckBox yellow = new JCheckBox("Yellow", false);
    private JLabel displayArea = new JLabel(" ");

    public CheckBoxDemo() {
        p.setLayout(new GridLayout(4, 1));
        p.add(red);
        p.add(blue);
        p.add(yellow);
        p.add(displayArea);
        add(p);

        red.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == red) {
            p.setBackground(Color.red);
            displayArea.setText("Du valde rött");
        } else if (e.getSource() == blue) {
            p.setBackground(Color.blue);
            displayArea.setText("Du valde blått");
        } else if (e.getSource() == yellow) {
            p.setBackground(Color.yellow);
            displayArea.setText("Du valde gult");
        }
    }


    public static void main(String[] arg) {
        CheckBoxDemo t = new CheckBoxDemo();
    }
}

