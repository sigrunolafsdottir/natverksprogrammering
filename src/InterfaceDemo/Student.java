package InterfaceDemo;

public class Student extends Person implements IPartyAnimal{
    
    private String kurs;
    
    public Student(String namn, String kurs){
        super(namn);
        this.kurs = kurs;
    }
    
    public String getFavoriteSnack() {
        return "Popcorn";
    }
    
    public String getTrams(){
        return "trams";
    }
    
//    @Override
//    public String getFavouriteDrink() {
//        return "Water";
//    }
}