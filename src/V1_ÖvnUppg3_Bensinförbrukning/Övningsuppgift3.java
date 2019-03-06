package V1_ÖvnUppg3_Bensinförbrukning;

import java.util.Scanner;

public class Övningsuppgift3 {
    
    public Scanner sc = new Scanner(System.in);

    protected double getInParam(String promptMessage){
        System.out.println(promptMessage);
        System.out.flush();
        return sc.nextDouble();
    }
    
    public Övningsuppgift3() {
        double currentMätarställning = getInParam("Ange mätarställning nu: ");
        double oldMätarställning = getInParam("Ange mätarställning för ett år sedan: ");
        double amountOfGas = getInParam("Ange antal liter förbrukad bensin: ");
        
        double antalKördaMil = currentMätarställning - oldMätarställning;
        double forbrukningPerMil = amountOfGas / antalKördaMil;
        
        System.out.println("Antal körda mil: "+antalKördaMil);
        System.out.println("Antal liter bensin: "+amountOfGas);
        System.out.println("Förbrukning per mil: "+forbrukningPerMil);
    }
    
    public static void main(String[] args) {
        Övningsuppgift3 ö = new Övningsuppgift3();
    }
    
}
