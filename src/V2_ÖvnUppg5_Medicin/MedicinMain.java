package V2_ÖvnUppg5_Medicin;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class MedicinMain {

    public static void main(String[] arg) throws InterruptedException {
        Scanner sc;
        double ggr = 0;


        while (true) {
            String medicin = JOptionPane.showInputDialog(null, "Medicinens namn");
            String ggrString = JOptionPane.showInputDialog(null, "Hur många gånger per minut?");
            sc = new Scanner(ggrString);

            if (sc.hasNextDouble()) {
                ggr = sc.nextDouble();
            } else {
                break;
            }

            Medicin m = new Medicin(medicin, ggr);
            Thread t = new Thread(m);
            t.start();
        }
        System.exit(0);
    }
}
