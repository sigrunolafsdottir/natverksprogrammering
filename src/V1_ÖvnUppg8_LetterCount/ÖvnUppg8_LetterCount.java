package V1_ÖvnUppg8_LetterCount;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class ÖvnUppg8_LetterCount {

    public ÖvnUppg8_LetterCount () {

        String temp;
        int[] fördelning = new int[100];

        try{
            URL url = new URL("http://www.puzzlers.org/pub/wordlists/pocket.txt");
        
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(url.openStream()))) {
                while ((temp = in.readLine()) != null ){
                    int size = temp.length();
                    fördelning[size]++;
                }
        
                for (int i = 0; i < fördelning.length; i++){
                    if (fördelning[i] != 0){
                        System.out.println("Antal ord med "+ i +" bokstäver: "
                                +fördelning[i] );
                    }
                    
                }
            }
        }
        catch (MalformedURLException e){
            e.printStackTrace();
       }

        catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args){
        ÖvnUppg8_LetterCount ö = new ÖvnUppg8_LetterCount();
    }
}
