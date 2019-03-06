package V1_ÖvnUppg7_SkrivaTillFil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Övningsuppgift7 {

    public Övningsuppgift7 () {
        
        String firstLine;
        String secondLine;
        Path inFilePath= Paths.get("src\\ÖvnUppg7_SkrivaTillFil\\Personuppgifter.txt");
        Path outFilePath = Paths.get("src\\ÖvnUppg7_SkrivaTillFil\\TallPeopleInformation.txt");
        
        String[] personDataParts;
        
        //Try with resources, gamla sättet
        //try(PrintWriter w = new PrintWriter(new BufferedWriter(
        //        new FileWriter(outFilePathString)))){
               
        //Try with resources, nya sättet med Paths och Files
        try(PrintWriter w = new PrintWriter(Files.newBufferedWriter(outFilePath)))
            {

            Scanner fileScanner = new Scanner(inFilePath);
            
            while(fileScanner.hasNext()){
                firstLine = fileScanner.nextLine();
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
        Övningsuppgift7 ö = new Övningsuppgift7();
    }
}
