package V2_ÖvnUppg3_Temperatur;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Övningsuppgift3Alt {
    public Övningsuppgift3Alt() {

        String tempLine;
        List<Double> tempList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(
                new FileReader("src\\V2_ÖvnUppg3_Temperatur\\temp.txt"))) {

            while ((tempLine = reader.readLine()) != null) {
                tempList.add(Double.parseDouble(tempLine.trim()));
            }

        } catch (Exception e) {
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }

        System.out.println("Maxtemp är " + tempList.stream().mapToDouble(d -> d).max().getAsDouble() +
                "\nMintemp är " + tempList.stream().mapToDouble(d -> d).min().getAsDouble() +
                "\nMedelvärdet är " + tempList.stream().mapToDouble(d -> d).average().getAsDouble()
                + " (beräknat över " + tempList.size() + " dagar)");
    }

    public static void main(String[] args) {

        Övningsuppgift3Alt ö = new Övningsuppgift3Alt();
    }
}
