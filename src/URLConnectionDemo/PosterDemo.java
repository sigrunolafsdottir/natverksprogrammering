package URLConnectionDemo;

import com.google.gson.Gson;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;


public class PosterDemo {
    
    public static void main(String[] args) throws MalformedURLException, IOException{

       String xmlStr = "<book><author>Tannenbaum</author><title>ComputerNetworks</title><id>10</id></book>";       
        byte[] postData       = xmlStr.getBytes( StandardCharsets.UTF_8 );
        String request        = "http://localhost:8080/WebApplicationDemo/rest/BookService/book/add";
        URL    url            = new URL( request );
        HttpURLConnection conn= (HttpURLConnection) url.openConnection();           
        conn.setDoOutput( true );
        conn.setDoInput( true );
        conn.setInstanceFollowRedirects( false );
        conn.setRequestMethod( "POST" );
        conn.setRequestProperty( "Content-Type", "application/xml"); 
        conn.setRequestProperty( "charset", "utf-8");
        conn.setRequestProperty( "Content-Length", Integer.toString( xmlStr.length() ));
        conn.setUseCaches( false );
        try( DataOutputStream wr = new DataOutputStream( conn.getOutputStream())) {
           wr.write( postData );
           wr.flush();
        }
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String t;
        while((t = br.readLine()) != null) System.out.println(t);
        br.close();


    }
}
