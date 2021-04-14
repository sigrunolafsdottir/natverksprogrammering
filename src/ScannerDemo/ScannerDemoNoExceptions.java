package ScannerDemo;

import java.util.Scanner;


public class ScannerDemoNoExceptions {
    
    ScannerDemoNoExceptions(){
        Scanner sc = new Scanner(System.in);
        int kostnad = 0;
        
        System.out.println("Skriv din kostnad: ");
        
        boolean gettingKostnad = false;
        while (!gettingKostnad){
            System.out.println("waiting");
                if (sc.hasNextInt()){
                    kostnad = sc.nextInt();
                    gettingKostnad = true;
                }
                else if (sc.hasNext()){
               // else {
                    System.out.println("Felaktig kostnad, försök igen (else)");
                    sc.nextLine();
                }
        }
        
        System.out.println("Kostnad "+ kostnad);
        
    }
    
    public static void main(String[] args){
        ScannerDemoNoExceptions sc = new ScannerDemoNoExceptions();
    }

}
