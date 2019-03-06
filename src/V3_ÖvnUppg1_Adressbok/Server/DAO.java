package V3_ÖvnUppg1_Adressbok.Server;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class DAO {
    
    private final Person Anna = new Person("Anna", "Kungsgatan 12, 12456 Stockholm",
            LocalDate.of(1989, Month.JULY, 12));
    private final Person Bertil = new Person("Bertil", 
            "Drottninggatan 3 12, 1226 Stockholm",LocalDate.of(2008, Month.MARCH, 9));
    private final Person Cecil = new Person("Cecil", 
            "Allgatan 12, 12456 Stockholm",LocalDate.of(1989, Month.NOVEMBER, 23));
    private final Person Danne = new Person("Danne", 
            "Betgatan 12, 12456 Stockholm",LocalDate.of(1984, Month.SEPTEMBER, 26));
    private final Person Ella = new Person("Ella", 
            "Cevgatan 12, 12456 Stockholm",LocalDate.of(1967, Month.SEPTEMBER, 27));
    
    private final List <Person> allPersons = new ArrayList<>();
    
    public DAO(){
        allPersons.add(Anna);
        allPersons.add(Bertil);
        allPersons.add(Cecil);
        allPersons.add(Danne);
        allPersons.add(Ella);
    }
    
    public List<Person> getAllPersons(){
        return allPersons;
    }
    
   public Person getPersonByName(String s){
       for (Person p :allPersons){
           if (p.getName().equalsIgnoreCase(s)){
               return p;
           }
       }
       return null;
   }
   
   public String getAddress(String s){
       for (Person p :allPersons){
           if (p.getName().equalsIgnoreCase(s)){
               return p.getAddress();
           }
       }
       return null;
   }
    
}
