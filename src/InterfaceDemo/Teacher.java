package InterfaceDemo;

public class Teacher extends Person implements IPartyAnimal{
    
    public Teacher(String namn){
        super(namn);
    }
    
    public String getFavoriteSnack() {
        return "Kale chips";
    }
    
    public String getFavoriteDrink() {
        return "Wine";
    }
}