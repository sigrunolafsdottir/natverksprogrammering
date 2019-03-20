package PathDemo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class Miniprogram {
    
    public static void main  (String[] args){
        
        Path path = Paths.get("src\\PathDemo\\citat");
        //Path altPath = Paths.get("src/PathDemo/citat");

        try (BufferedWriter writer = 
                Files.newBufferedWriter(path, StandardCharsets.UTF_8, 
                        StandardOpenOption.APPEND);){
            writer.write("Where you go, there you are.\n");
            writer.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}
