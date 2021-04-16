package V1_ÖvnUppg3_ArvInterface.Uppg3A;

public class Fordon {
    
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
 

}
