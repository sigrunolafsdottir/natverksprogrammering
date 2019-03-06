package V1_ÖvnUppg6_Temperatur;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class Övningsuppgift6 {
    public Övningsuppgift6 () {
        File file = new File("src\\ÖvnUppg6_Temperatur\\temp.txt");
        double temp;
        double tempSum = 0;
        int amountOfDays = 0;
        double maxTemp = -Double.MAX_VALUE;
        double minTemp = Double.MAX_VALUE;
        String tempLine;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            
            while((tempLine = reader.readLine()) != null){
                
                //bort med End of Line-tecknet och eventuella blanktecken som kan gömma sig i filen
                temp = Double.parseDouble(tempLine.trim());
                

                if (temp > maxTemp) {
                    maxTemp = temp;
                }
                if (temp < minTemp) {
                    minTemp = temp;
                }
                amountOfDays++;
                tempSum += temp;
            }
        }
        catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.out.flush();
            System.exit(0);
        }
         
        System.out.println("Maxtemp är "+maxTemp+"\nMintemp är "+minTemp+
                "\nMedelvärdet är "+tempSum/amountOfDays+" (beräknat över "+amountOfDays+" dagar)");
    }
    
    public static void main(String[] args){
        Övningsuppgift6 ö = new Övningsuppgift6();
    }
}
