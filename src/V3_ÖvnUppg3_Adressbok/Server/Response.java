package V3_ÖvnUppg3_Adressbok.Server;

import V3_ÖvnUppg1_Adressbok.Server.Person;
import java.io.Serializable;

public class Response implements Serializable {
    
    private boolean success;
    private Person person;
    
    public Response(){}
    
    public Response(boolean success){
       this.success = success; 
    }
    
    public Response(boolean success, Person person){
       this.success = success; 
       this.person = person;
    }
    
    public void setPerson(Person person){
        this.person = person;
    }

    public Person getPerson(){
        return person;
    }
    
    public void setSuccess(boolean success){
        this.success = success;
    }

    public boolean getSuccess(){
        return success;
    }
}
