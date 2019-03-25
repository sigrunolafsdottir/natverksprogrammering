package PathDemo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class Miniprogram {
    
    public static void main  (String[] args){
        
        Path path = Paths.get("src\\PathDemo\\citat");
        //Path altPath = Paths.get("src/PathDemo/citat");

        try (PrintWriter writer = 
                new PrintWriter(Files.newBufferedWriter(path, 
                        StandardCharsets.UTF_8, 
                        StandardOpenOption.APPEND));){
            writer.println("Where you go, there you are.\n");
            //writer.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
