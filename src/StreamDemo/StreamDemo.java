package StreamDemo;

import java.io.BufferedReader;
import java.io.FileReader;


public class StreamDemo {
    
    public static void main(String[] args){
        String tempLine = "";
        int tempInt = 0;
        BufferedReader bufIn = null;
        
        try {
            bufIn = new BufferedReader
                (new FileReader ("src\\StreamDemo\\Luka.txt"));
            
         //   med BufferedReader kan vi läsa en rad i taget
//            while(tempLine != null){
//                tempLine = bufIn.readLine();
//                System.out.println(tempLine);
//            }
            
       //     vi slipper null på slutet
//            while((tempLine = bufIn.readLine()) != null){
//                System.out.println(tempLine);
//            }
            
            
            FileReader fileIn = new FileReader(
                    "src\\StreamDemo\\Luka.txt");
            
            while(tempInt != -1){
                tempInt = fileIn.read();
               // System.out.println(tempInt);
               // Vi måste casta intarna till char
                System.out.print((char)tempInt);
            }
        }
        catch (Exception e){
            System.out.println("Could not read from file");
        }

    }
}


