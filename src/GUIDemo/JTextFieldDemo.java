package GUIDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;


public class JTextFieldDemo extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Skriv nåt: ");
    JTextField tf = new JTextField(20);

    JTextFieldDemo() {
        setLayout(new FlowLayout());
        add(panel);
        // panel.add(label);
        panel.add(tf);
        tf.addActionListener(this);
        pack();
        setSize(300, 300);
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(tf.getText());
        tf.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JTextFieldDemo());
    }

}
