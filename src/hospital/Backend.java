package demos.hospital;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class Backend {
    
    private BackendPerson Anna = new BackendPerson("Anna", "Kungsgatan 12, 12456 Stockholm",
            LocalDate.of(1989, Month.JULY, 12), "Diabetes", false);
    private BackendPerson Bertil = new BackendPerson("Bertil", 
            "Drottninggatan 3 12, 1226 Stockholm",LocalDate.of(2008, Month.MARCH, 9), "", true);
    private BackendPerson Cecil = new BackendPerson("Cecil", 
            "Allgatan 12, 12456 Stockholm",LocalDate.of(1989, Month.NOVEMBER, 23), "Nageltrång", false);
    private BackendPerson Danne = new BackendPerson("Danne", 
            "Betgatan 12, 12456 Stockholm",LocalDate.of(1984, Month.SEPTEMBER, 26), "Öroninflammation", false);
    private BackendPerson Ella = new BackendPerson("Ella", 
            "Cevgatan 12, 12456 Stockholm",LocalDate.of(1967, Month.SEPTEMBER, 27), "Struma", false);
     
    
    
    public List<BackendPerson> getAllPersons(){
        
        List <BackendPerson> allPersons = new ArrayList<>();
        allPersons.add(Anna);
        allPersons.add(Bertil);
        allPersons.add(Cecil);
        allPersons.add(Danne);
        allPersons.add(Ella);
        
        return allPersons;
    }
    
    
    public List<IAddressee> getAllAdressees(){
        
        List <IAddressee> allAdressees = new ArrayList<>();
        allAdressees.add(Anna);
        allAdressees.add(Bertil);
        allAdressees.add(Cecil);
        allAdressees.add(Danne);
        allAdressees.add(Ella);
        
        return allAdressees;
    }
    
    

}
