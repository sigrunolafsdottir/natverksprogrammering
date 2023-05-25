package V1_ÖvnUppg8_SkrivaTillFil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Övningsuppgift8 {

    List<Person> allPersonList = new ArrayList<>();
    int max = 200;

    Path inFilePath = Paths.get("src\\V1_ÖvnUppg8_SkrivaTillFil\\Personuppgifter.txt");
    Path outFilePath = Paths.get("src\\V1_ÖvnUppg8_SkrivaTillFil\\TallPeopleInformationOLD.txt");

    public void createPersonList() throws IOException {

        String firstLine;
        String secondLine;
        String[] personDataParts1;
        String[] personDataParts2;

        //Try with resources, nya sättet med Paths och Files
        try (PrintWriter w = new PrintWriter(Files.newBufferedWriter(outFilePath));
             Scanner fileScanner = new Scanner(inFilePath);) {

            while (fileScanner.hasNext()) {
                Person tempPerson = new Person();

                firstLine = fileScanner.nextLine();
                personDataParts1 = firstLine.split(",");

                tempPerson.setName(personDataParts1[0]);
                tempPerson.setRoad(personDataParts1[1]);
                tempPerson.setPostalAddress(personDataParts1[2]);

                if (fileScanner.hasNext()) {
                    secondLine = fileScanner.nextLine();
                    personDataParts2 = secondLine.split(",");

                    tempPerson.setAge(Integer.parseInt(personDataParts2[0].trim()));
                    tempPerson.setWeight(Integer.parseInt(personDataParts2[1].trim()));
                    tempPerson.setHeight(Integer.parseInt(personDataParts2[2].trim()));

                    allPersonList.add(tempPerson);

                }
            }
        }
    }

    public List<Person> filterHeight(int limit){
        List<Person> temp = new ArrayList<>();
        for (Person p : allPersonList){
            if (p.getHeight() >= limit){
                temp.add(p);
            }
        }
        return temp;
    }

    public Övningsuppgift8() throws IOException {

        createPersonList();

        List<Person> filteredList = filterHeight(max);

        //Try with resources, nya sättet med Paths och Files
        try (PrintWriter w = new PrintWriter(Files.newBufferedWriter(outFilePath));){

            for (Person p : filteredList){
                w.println(p);
            }
            w.flush();

        } catch (Exception e) {
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static void main(String[] args) throws IOException {
        Övningsuppgift8 ö = new Övningsuppgift8();
    }
}
