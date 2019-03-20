package demos.hospital;

import java.util.List;


public class FrontEnd {
    
        public void printAddress(IAddressee a){
           System.out.println(a.getName());
           System.out.println(a.getAddress());
           System.out.println();
    }
    
    public FrontEnd(){
    
        Backend backend = new Backend();
        List <BackendPerson> allPersons = backend.getAllPersons();
        
        for (BackendPerson a : allPersons){
            System.out.println(a.getAll());
        }
    }
    
    public static void main(String[] args){
        FrontEnd frontEnd = new FrontEnd();
    }

}
