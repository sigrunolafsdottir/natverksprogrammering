package V2_ÖvnUppg1_bilhyra;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Bilhyra extends JFrame implements ActionListener {

    JLabel mätarställningNuLabel = new JLabel("Ange mätarställning nu: ");
    JLabel mätarställningGammalLabel = new JLabel("Ange mätarställning för ett år sedan: ");
    JLabel förbrukadBensinLabel = new JLabel("Ange antal liter förbrukad bensin: ");
    JTextField mätarställningNu = new JTextField(30);
    JTextField mätarställningGammal = new JTextField(30);
    JTextField förbrukadBensin = new JTextField(30);
    JLabel antalKördaMil = new JLabel(" ");
    JLabel antalLiterBensinLabel = new JLabel(" ");
    JLabel förbrukningPerMilLabel = new JLabel(" ");

    JPanel questions = new JPanel();
    JPanel answers = new JPanel();
    JPanel finalVerdictPanel = new JPanel();


    public Bilhyra() {
        //lägger ut delpanelerna till programmet
        setLayout(new BorderLayout());
        add("West", questions);
        add("East", answers);
        add("South", finalVerdictPanel);

        //placerar ut komponenter
        questions.setLayout(new GridLayout(3, 1));
        questions.add(mätarställningNuLabel);
        questions.add(mätarställningGammalLabel);
        questions.add(förbrukadBensinLabel);
        answers.setLayout(new GridLayout(3, 1));
        answers.add(mätarställningNu);
        answers.add(mätarställningGammal);
        answers.add(förbrukadBensin);
        finalVerdictPanel.setLayout(new GridLayout(1, 3));
        finalVerdictPanel.add(antalKördaMil);
        finalVerdictPanel.add(antalLiterBensinLabel);
        finalVerdictPanel.add(förbrukningPerMilLabel);

        //add actionlisteners
        mätarställningNu.addActionListener(this);
        mätarställningGammal.addActionListener(this);
        förbrukadBensin.addActionListener(this);

        //finishing touches
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    protected static double forbrukningPerMil(double amountOfGas,
                                              double antalKördaMil) {
        return amountOfGas / antalKördaMil;
    }

    protected static double antalKördaMil(double currentMätarställning,
                                          double oldMätarställning) {
        return currentMätarställning - oldMätarställning;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

            //Using scanner for easy Double parsing
            Scanner scMätarställningNu = new Scanner(mätarställningNu.getText());
            Scanner scMätarställningGammal = new Scanner(mätarställningGammal.getText());
            Scanner scFörbrukadBensin = new Scanner(förbrukadBensin.getText());

            if (scMätarställningNu.hasNextDouble() && scMätarställningGammal.hasNextDouble()
                    && scFörbrukadBensin.hasNextDouble()) {
                double enteredMätarställningNu = scMätarställningNu.nextDouble();
                double enteredMätarställningGammal = scMätarställningGammal.nextDouble();
                double enteredFörbrukadBensin = scFörbrukadBensin.nextDouble();

                double antalMil = antalKördaMil(enteredMätarställningNu, enteredMätarställningGammal);

                antalKördaMil.setText(String.format("Antal körda mil: %8.0f \n",
                        antalMil));
                antalLiterBensinLabel.setText(String.format("Antal liter bensin: %7.1f \n",
                        enteredFörbrukadBensin));
                förbrukningPerMilLabel.setText(String.format("Förbrukning per mil: %1.2f \n",
                        forbrukningPerMil(enteredFörbrukadBensin, antalMil)));

            }

    }

    public static void main(String[] args) {
        Bilhyra ö = new Bilhyra();
    }
}
