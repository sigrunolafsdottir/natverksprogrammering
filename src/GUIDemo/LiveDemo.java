package GUIDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LiveDemo extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JPanel buttonPanel = new JPanel();
    JButton button = new JButton("tryck här");
    JButton button1 = new JButton("tryck här 1");
    JButton button2 = new JButton("tryck här 2");
    JButton button3 = new JButton("tryck här 3");
    JLabel label = new JLabel("meddelande");

    public LiveDemo(){
        panel.setLayout(new BorderLayout());
        add(panel);
        panel.add(buttonPanel, BorderLayout.NORTH);
        panel.add(label, BorderLayout.CENTER);
        panel.add(button, BorderLayout.SOUTH);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        //setSize(200, 300);
        pack();
        setVisible(true);
        setLocation(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        LiveDemo ld = new LiveDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText(((JButton) e.getSource()).getText());
    }
}
