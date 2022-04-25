package ÖvnUppg11_serialisering;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class SerializationManager {
    
    public void serializeList(List<Fordon> list, String filePath ){
        try (FileOutputStream fileOut =
            new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);) {
           
            objectOut.writeObject(list);
            System.out.printf("Fordonen sparade i %s\n", filePath);
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public List<Fordon> deSerializeList(){
        List<Fordon> list = new ArrayList<Fordon>();
        try (FileInputStream fileIn = new FileInputStream("src/ÖvnUppg11_serialisering/minaFordon.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);) {
            
            list = (List<Fordon>) in.readObject();
            return list;
        }
        catch(IOException e) {
            System.out.println("Något gick fel");
        }
        catch(ClassNotFoundException e) {
            System.out.println("Fordon okänd klass");
        }
        return list;
    }
}
