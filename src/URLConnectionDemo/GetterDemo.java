package URLConnectionDemo;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class GetterDemo {
    
    public static void main(String[] args) throws MalformedURLException, IOException{
        
        URL allBooksXMLURL = new URL("http://localhost:8080/WebApplicationDemo/rest/BookService/books");
        BufferedReader buffy = new BufferedReader(new InputStreamReader(allBooksXMLURL.openStream()));
        String inputLine;
        while ((inputLine = buffy.readLine()) != null){
            System.out.println(inputLine);
        }
        buffy.close();
        
        URL allBooksJSONURL = new URL("http://localhost:8080/WebApplicationDemo/rest/BookService/booksJSON");
        BufferedReader buffyJSON = new BufferedReader(new InputStreamReader(allBooksJSONURL.openStream()));
        while ((inputLine = buffyJSON.readLine()) != null){
            System.out.println(inputLine);
        }
        buffyJSON.close();
        Gson gson = new Gson();
    }
}
