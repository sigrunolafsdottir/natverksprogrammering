package InterfaceDemo;


public class InterfaceDemo {
    
    public static void main (String[] args){
        
        Person p = new Student("Anna", "nånKurs");
        
        
          Student s = new Student ("Sanna", "JavaOO");
        System.out.println(s.getName()+" "+s.getFavoriteSnack()
                +" "+s.getFavouriteDrink());
        
        Teacher t = new Teacher("Sigrun");
        System.out.println(t.getName()+" "+t.getFavoriteSnack() 
                + " " + t.getFavoriteDrink());
        
        IPartyAnimal m = new Student ("Mimmi", "JavaOO");
        System.out.println(m.getFavoriteSnack()+" "
                +m.getFavouriteDrink());
//        
        Person p2 = new Student("trams", "nån kurs");
        //p2.getTrams();

        IPartyAnimal t2 = t;
        System.out.println(t2.getFavoriteSnack()+" "+t2.getFavouriteDrink());
//        
        
        //Varför funkar inte detta?
        //System.out.println(m.getName());
        

    }

}