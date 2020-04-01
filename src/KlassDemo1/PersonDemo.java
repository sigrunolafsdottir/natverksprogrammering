package KlassDemo1;


public class PersonDemo {
    
    public static void main (String[] args){
        
        Person p = new Person ("Sigrun", 5);
        System.out.println(p.getName());
        
        p.setName("Bertil");
        System.out.println(p.getName());
        
        p.name = "Hej";
        System.out.println(p.getName());
        
        p.age = 20;
    }

}
