package V2_ÖvnUppg3_Temperatur;

import java.io.BufferedReader;
import java.io.FileReader;


public class Övningsuppgift3 {
    public Övningsuppgift3() {
        double temp;
        double tempSum = 0;
        int amountOfDays = 0;
        double maxTemp = -Double.MAX_VALUE;
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        double minTemp = Double.MAX_VALUE;
        String tempLine;
        try (BufferedReader reader = new BufferedReader(
                new FileReader("src\\V2_ÖvnUppg3_Temperatur\\temp.txt"))) {

            while ((tempLine = reader.readLine()) != null) {

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
        } catch (Exception e) {
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }

        System.out.println("Maxtemp är " + maxTemp + "\n"
                + "Mintemp är " + minTemp +
                "\nMedelvärdet är " + tempSum / amountOfDays
                + " (beräknat över " + amountOfDays + " dagar)");
    }

    public static void main(String[] args) {

        Övningsuppgift3 ö = new Övningsuppgift3();
    }
}
