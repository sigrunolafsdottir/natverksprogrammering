package V2_ÖvnUppg4_AdressBok.Server;

import V2_ÖvnUppg1_Adressbok.Server.DAO;
import V2_ÖvnUppg1_Adressbok.Server.Person;
import V2_ÖvnUppg3_Adressbok.Server.Initiator;
import V2_ÖvnUppg3_Adressbok.Server.Response;


public class Protokoll {
    
    //This class now holds all the server logic
    
    private static final int BEFORE_INIT = 0;
    private static final int WAITING_FOR_REQUEST = 1;
    
    private int state = BEFORE_INIT;
    private DAO dao = new DAO();
    Person dbResponse;
    
    public Object processInput(String theInput) {
        Object theOutput = null;

        if (state == BEFORE_INIT) {
            theOutput = new Initiator();
            state = WAITING_FOR_REQUEST;
        } else if (state == WAITING_FOR_REQUEST) {
            
             dbResponse = dao.getPersonByName(((String)theInput).trim());
             if (dbResponse == null){
                 theOutput = new Response(false);
             }
             else{
                 theOutput = new Response(true, dbResponse);
             }
        } 
        return theOutput;
    }

}
