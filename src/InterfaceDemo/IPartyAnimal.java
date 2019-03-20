package InterfaceDemo;

public interface IPartyAnimal {
    
    public String getFavoriteSnack();

    default String getFavouriteDrink(){
        return "Beer";
    }
}