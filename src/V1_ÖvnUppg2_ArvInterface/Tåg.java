package V1_ÖvnUppg2_ArvInterface;

public class Tåg extends Fordon implements Printable{
    private int antalVagnar;
    
    public Tåg(int hastighet, int vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }
    
    public void kopplaVagn(){}
    
    public void printMe(){
        System.out.println("Tåg med hastighet " 
                +getHastighet()+ " km/h, vikt " 
                + getVikt() +" kg och antalVagnar: " 
                + antalVagnar);
    }
}
