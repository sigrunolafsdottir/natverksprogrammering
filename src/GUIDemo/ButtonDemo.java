package GUIDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ButtonDemo extends JFrame implements ActionListener {

    JPanel p = new JPanel();
    JButton button1 = new JButton("Tryck här");
    JButton button2 = new JButton("Eller tryck här");
    JLabel label = new JLabel("Hej");

    ButtonDemo() {
        p.setLayout(new FlowLayout());
        button1.addActionListener(this);
        button2.addActionListener(this);
        this.add(p);
        p.add(label);
        p.add(button1);
        p.add(button2);
        this.pack();
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            label.setText("kanpp 1");

        } else {
            label.setText("kanpp 2");
        }
    }

    public static void main(String[] args) {
        ButtonDemo g = new ButtonDemo();
    }


}
