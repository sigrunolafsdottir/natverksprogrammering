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

public class Övningsuppgift8_original {

    public Övningsuppgift8_original () {
        
        String firstLine;
        String secondLine;
        Path inFilePath= Paths.get("src\\V1_ÖvnUppg8_SkrivaTillFil\\Personuppgifter.txt");
        Path outFilePath = Paths.get("src\\V1_ÖvnUppg8_SkrivaTillFil\\TallPeopleInformation.txt");
        
        String[] personDataParts;

        
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
                personDataParts = firstLine.split(",");
               
                
                if (fileScanner.hasNext()){
                    secondLine = fileScanner.nextLine();
                    personDataParts = secondLine.split(",");

                    if (Integer.parseInt(personDataParts[2].trim()) > 199){
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
        Övningsuppgift8_original ö = new Övningsuppgift8_original();
    }
}
