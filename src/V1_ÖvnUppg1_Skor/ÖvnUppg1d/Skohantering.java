package V1_ÖvnUppg1_Skor.ÖvnUppg1d;

import V1_ÖvnUppg1_Skor.Sko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Skohantering {

    Scanner sc = new Scanner(System.in);
    Skosamling skosamling = new Skosamling();

    public void printMainMenu(){
        System.out.println("Välj ett alternativ ");
        System.out.println("1. Skriv ut alla skor ");
        System.out.println("2. Lägg till skor ");
        System.out.println("3. Ändra data för befintliga skor ");
        System.out.println("4. Ta bort ett par skor ");
    }

    public void addShoes(){
        int size = 0;
        String color="";
        String label="";
        System.out.print("Skriv in storlek på de skor du vill lägga in: ");
        if (sc.hasNextInt()){
            size=sc.nextInt();
        }
        System.out.print("Skriv in färg på de skor du vill lägga in: ");
        if (sc.hasNext()){
            color=sc.next();
        }
        System.out.print("Skriv in märke på de skor du vill lägga in: ");
        if (sc.hasNext()){
            label=sc.next();
        }
        skosamling.addSko(size, color, label);
    }

    public void updateShoes(){
        int index = -1;
        String color="";

        System.out.print("Skriv in index för de skor du vill uppdatera: ");
        if (sc.hasNextInt()){
            index=sc.nextInt();
        }
        System.out.print("Skriv in den nya färgen på de skor du vill uppdatera: ");
        if (sc.hasNext()){
            color=sc.next();
        }
        skosamling.updateColor(index, color);
    }

    public void removeShoes(){
        int index = -1;

        System.out.print("Skriv in index för de skor du vill ta bort: ");
        if (sc.hasNextInt()){
            index=sc.nextInt();
        }

        skosamling.removeSko(index);
    }


    public Skohantering(){
        printMainMenu();
        int choice;

        while(true){
            if (sc.hasNextInt()){
                choice = sc.nextInt();
                if (choice==1){
                    skosamling.listaAllaSkor();
                }
                else if (choice==2){
                    addShoes();
                }
                else if (choice==3){
                    updateShoes();
                }
                else if (choice==4){
                    removeShoes();
                }
            }
            printMainMenu();
        }

    }

}
