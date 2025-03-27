package SerializationDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeSerializer {

    public DeSerializer() throws IOException, ClassNotFoundException {

        try(ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("src/SerializationDemo/mySerializedFriends.ser"))){
            Friend f1 = (Friend) ois.readObject();
            Friend f2 = (Friend) ois.readObject();
            Friend f3 = (Friend) ois.readObject();

            System.out.println(f1);
            System.out.println(f2);
            System.out.println(f3);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DeSerializer serializer = new DeSerializer();
    }
}
