package V2_ÖvnUppg6_Medicin;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class MedicinMain {

  public static void main(String[] arg) throws InterruptedException {
    Scanner sc;
    double ggr = 0;
    boolean go = true;
    while (go) { 
      String medicin = JOptionPane.showInputDialog(null, "Titel");
      if (medicin == null || medicin.length() == 0){  //tar hand om Cancel-tryck
          System.exit(0); 
      }
      String ggrString = JOptionPane.showInputDialog(null, "Hur många gånger per minut?");
      if (ggrString == null || ggrString.length() == 0){  //tar hand om Cancel-tryck
          System.exit(0); 
      }
      sc = new Scanner(ggrString);
      if (sc.hasNextDouble()){
          ggr = sc.nextDouble();
      }
      else {
          break;
      }

      Medicin m = new Medicin(medicin, ggr);
      Thread t = new Thread(m);
      t.start();
    }
    System.exit(0);    
  }
}
