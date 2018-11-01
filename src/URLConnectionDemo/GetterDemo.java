package URLConnectionDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class GetterDemo {
    
    public static void main(String[] args) throws MalformedURLException, IOException{
        
        URL allBooksXMLURL = new URL("http://localhost:8080/WebApplicationDemo/rest/BookService/books");
        HttpURLConnection conn= (HttpURLConnection) allBooksXMLURL.openConnection();  
        BufferedReader buffy = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        while ((inputLine = buffy.readLine()) != null){
            System.out.println(inputLine);
        }
        buffy.close();
        
        URL allBooksJSONURL = new URL("http://localhost:8080/WebApplicationDemo/rest/BookService/booksJSON");
        HttpURLConnection conn2= (HttpURLConnection) allBooksJSONURL.openConnection();  
        BufferedReader buffyJSON = new BufferedReader(new InputStreamReader(conn2.getInputStream()));
        while ((inputLine = buffyJSON.readLine()) != null){
            System.out.println(inputLine);
        }
        buffyJSON.close();

    }
}
