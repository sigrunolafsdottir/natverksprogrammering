package V1_ÖvnUppg2_ArvInterface;

abstract class Fordon{
    
    private int hastighet;
    private int vikt;
    
    Fordon(){}
    
    Fordon(int hastighet, int vikt){
        this.hastighet = hastighet;
        this.vikt = vikt;
    }
    
    public int getHastighet(){
        return hastighet;
    }
    
    public int getVikt(){
        return vikt;
    }
    
    public void ändraHastighet(int nyHastighet){
        hastighet = nyHastighet;
    }
 
    //Nödvändig för att det ska gå att skriva 
    //ut en subklass via Fordon
    abstract public void printMe();
}
