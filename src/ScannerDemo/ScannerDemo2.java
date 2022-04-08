package ScannerDemo;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ScannerDemo2 {

    ScannerDemo2() {
        Scanner sc = new Scanner(System.in);
        int kostnad = 0;

        System.out.println("Skriv din kostnad: ");

      //  try {
            kostnad = sc.nextInt();
            System.out.println("Kostnad " + kostnad);
    /*    }
        catch (InputMismatchException  e) {
            System.out.println("InputMismatchException");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Felaktig kostnad, försök igen (exception)");
            e.printStackTrace();
        } */
    }

    public static void main(String[] args) {
        ScannerDemo2 sc = new ScannerDemo2();
    }

}
