package V2_ÖvnUppg2_TextEditor;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

//C:\Users\s_ola\Dropbox\Jobb\Nätverksprogrammering\kod\Natverksprogrammering_kopieratFrDocs\src\V2_ÖvnUppg2_TextEditor\example.txt
//C:\Users\s_ola\Dropbox\Jobb\Nätverksprogrammering\kod\Natverksprogrammering_kopieratFrDocs\src\V2_ÖvnUppg2_TextEditor\minText.txt

public class TextEditor extends JFrame implements ActionListener {
    private JPanel buttonPanel= new JPanel();
    private JTextField namn = new JTextField(20);
    private JButton öppna = new JButton("Öppna");
    private JButton spara = new JButton("Spara");
    private JButton skriv = new JButton("Skriv ut");
    private JButton sluta = new JButton("Avsluta");
    private JTextArea area = new JTextArea(10, 60);
    private JScrollPane sp = new JScrollPane(area,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    public TextEditor() {
        setLayout(new BorderLayout());
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));
        //buttonPanel.setLayout(new GridLayout(1, 6));
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(new JLabel("Filnamn: "));
        buttonPanel.add(namn);
        buttonPanel.add(öppna);
        buttonPanel.add(spara);
        buttonPanel.add(skriv);
        buttonPanel.add(sluta);
        namn.addActionListener(this);
        öppna.addActionListener(this);
        spara.addActionListener(this);
        skriv.addActionListener(this);
        sluta.addActionListener(this);
        // placera ut panelen och textarean
        add(buttonPanel, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        // undersök vilken knapp användaren har tryckt på
        //if (e.getSource() == namn || e.getSource() == öppna)
        if (e.getSource() == öppna)
            läsInFil(namn.getText());
        else if (e.getSource() == spara)
            sparaFil(namn.getText());
        else if (e.getSource() == skriv)
            try {
                area.print();  // skriver ut texten, kan ge exception
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        else if (e.getSource() == sluta)
            System.exit(0);
    }

    private void läsInFil(String filnamn) {
        try {
            FileReader r = new FileReader(filnamn);
            area.read(r, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sparaFil(String filnamn) {
        try {
            FileWriter w = new FileWriter(filnamn);
            area.write(w);
            JOptionPane.showMessageDialog(null, "Data sparades");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] arg) {
        TextEditor t = new TextEditor();
    }
}
