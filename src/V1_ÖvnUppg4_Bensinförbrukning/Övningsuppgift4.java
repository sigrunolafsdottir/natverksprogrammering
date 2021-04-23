package V1_ÖvnUppg4_Bensinförbrukning;

import java.util.Scanner;

public class Övningsuppgift4 {
    
    public Scanner sc = new Scanner(System.in);

    protected double getInParam(String promptMessage){
        System.out.println(promptMessage);
        //System.out.flush();
        return sc.nextDouble();
    }
    
    public Övningsuppgift4() {
        double currentMätarställning = getInParam("Ange mätarställning nu: ");
        double oldMätarställning = getInParam("Ange mätarställning för ett år sedan: ");
        double amountOfGas = getInParam("Ange antal liter förbrukad bensin: ");
        
        double antalKördaMil = currentMätarställning - oldMätarställning;
        double forbrukningPerMil = amountOfGas / antalKördaMil;

        //String.format("%.2f",d)
        System.out.println(String.format("Antal körda mil:  %.2f",antalKördaMil));
        System.out.println(String.format("Antal liter bensin:  %.2f",amountOfGas));
        System.out.println(String.format("Förbrukning per mil: %.2f",forbrukningPerMil));
    }
    
    public static void main(String[] args) {
        Övningsuppgift4 ö = new Övningsuppgift4();
    }
    
}
