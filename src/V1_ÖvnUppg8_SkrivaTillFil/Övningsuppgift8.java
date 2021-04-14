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

    public Övningsuppgift8 () {
        
        String firstLine;
        String secondLine;
        Path inFilePath= Paths.get("src\\V1_ÖvnUppg8_SkrivaTillFil\\Personuppgifter.txt");
        Path outFilePath = Paths.get("src\\V1_ÖvnUppg8_SkrivaTillFil\\TallPeopleInformation.txt");
        
        String[] personDataParts1;
        String[] personDataParts2;
        String[] completePersonArray = new String[6];
        List<Person> allPersonList = new ArrayList<>();
        
        //Try with resources, gamla sättet
        //try(PrintWriter w = new PrintWriter(new BufferedWriter(
        //        new FileWriter(outFilePathString)))){
               
        //Try with resources, nya sättet med Paths och Files
        try(PrintWriter w = new PrintWriter(Files.newBufferedWriter(outFilePath));
              Scanner fileScanner = new Scanner(inFilePath);  )
            {
            
            while(fileScanner.hasNext()){
                Person tempPerson = new Person();
                
                firstLine = fileScanner.nextLine();
                personDataParts1 = firstLine.split(",");
                completePersonArray[0] = personDataParts1[0];
                completePersonArray[1] = personDataParts1[1];
                completePersonArray[2] = personDataParts1[2];
                
                tempPerson.setName(personDataParts1[0]);
                tempPerson.setRoad(personDataParts1[1]);
                tempPerson.setPostalAddress(personDataParts1[2]);
                
                if (fileScanner.hasNext()){
                    secondLine = fileScanner.nextLine();
                    personDataParts2 = secondLine.split(",");
                    
                    completePersonArray[3] = personDataParts2[0];
                    completePersonArray[4] = personDataParts2[1];
                    completePersonArray[5] = personDataParts2[2];
                    
                    tempPerson.setAge(Integer.parseInt(personDataParts2[0].trim()));
                    tempPerson.setWeight(Integer.parseInt(personDataParts2[1].trim()));
                    tempPerson.setHeight(Integer.parseInt(personDataParts2[2].trim()));
                    
                    Person p = new Person(personDataParts1[0].trim(), personDataParts1[1].trim(), personDataParts1[2].trim(),
                    Integer.parseInt(personDataParts2[0].trim()), Integer.parseInt(personDataParts2[1].trim()),
                    Integer.parseInt(personDataParts2[2].trim()));
                    
                    allPersonList.add(tempPerson);
                   // allPersonList.add(p);

                    if (Integer.parseInt(personDataParts2[2].trim()) > 199){
                        w.print(firstLine + "\n" + secondLine+ "\n");
                    }
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Filen kunde inte hittas");
            e.printStackTrace();
            System.exit(0);
       }
        catch (IOException e){
            System.out.println("Det gick inte att skriva till fil");
            e.printStackTrace();
            System.exit(0);
        }
        catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        Övningsuppgift8 ö = new Övningsuppgift8();
    }
}
