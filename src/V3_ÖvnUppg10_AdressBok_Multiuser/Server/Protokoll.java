package V3_ÖvnUppg10_AdressBok_Multiuser.Server;

import V3_ÖvnUppg5_Adressbok_Basic.Server.DAO;
import V3_ÖvnUppg5_Adressbok_Basic.Server.Person;
import V3_ÖvnUppg7_Adressbok_KustomiseradeObjekt.Server.Initiator;
import V3_ÖvnUppg7_Adressbok_KustomiseradeObjekt.Server.Response;


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

            dbResponse = dao.getPersonByName(((String) theInput).trim());
            if (dbResponse == null) {
                theOutput = new Response(false);
            } else {
                theOutput = new Response(true, dbResponse);
            }
        }
        return theOutput;
    }

}
