package V1_ÖvnUppg4_Bensinförbrukning;

import java.util.Scanner;

public class Övningsuppgift4 {

    public Scanner sc = new Scanner(System.in);

    protected double getInParam(String promptMessage) {
        System.out.println(promptMessage);
        return sc.nextDouble();
    }

    public Övningsuppgift4() {
        double currentMätarställning = getInParam("Ange mätarställning nu: ");
        double oldMätarställning = getInParam("Ange mätarställning för ett år sedan: ");
        double amountOfGas = getInParam("Ange antal liter förbrukad bensin: ");

        double antalKördaMil = currentMätarställning - oldMätarställning;
        double forbrukningPerMil = amountOfGas / antalKördaMil;

        System.out.println("Antal körda mil: " +antalKördaMil);
        System.out.println("Antal liter bensin: " +amountOfGas);
        System.out.println("Förbrukning per mil: "+  forbrukningPerMil);
    }

    public static void main(String[] args) {
        Övningsuppgift4 ö = new Övningsuppgift4();

    }

}
