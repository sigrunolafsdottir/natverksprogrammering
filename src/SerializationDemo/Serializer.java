package SerializationDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializer {

    Friend anna = new Friend("Anna", "sfds@fsds.com");
    Friend bertil = new Friend("Bertil", "bfdbfd@fsds.com");
    Friend cecil = new Friend("Cecil", "cdscds@fsds.com");


    public Serializer() throws IOException {

        try(ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("src/SerializationDemo/mySerializedFriends.ser"))){
            oos.writeObject(anna);
            oos.writeObject(bertil);
            oos.writeObject(cecil);
            oos.flush();
        }

    }

    public static void main(String[] args) throws IOException {
        Serializer serializer = new Serializer();
    }
}
