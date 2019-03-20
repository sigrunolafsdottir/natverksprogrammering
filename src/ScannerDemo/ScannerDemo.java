package ScannerDemo;

import java.util.Scanner;


public class ScannerDemo {
    
    ScannerDemo(){
        Scanner sc = new Scanner(System.in);
        int kostnad = 0;
        int betalning = 0;
        int växel = 0;
        
        System.out.println("Skriv din kostnad: ");
        
        boolean gettingKostnad = false;
        while (!gettingKostnad){
            try {
                if (sc.hasNextInt()){
                    kostnad = sc.nextInt();
                    gettingKostnad = true;
                }
                else if (sc.hasNext()){
                    System.out.println("Felaktig kostnad, försök igen (else)");
                    sc.next();
                }
            }
            catch(Exception e){
                System.out.println("Felaktig kostnad, försök igen (exception)");
            }
        }
        
        System.out.println("Kostnad "+ kostnad);
        
    }
    
    public static void main(String[] args){
        ScannerDemo sc = new ScannerDemo();
    }

}
