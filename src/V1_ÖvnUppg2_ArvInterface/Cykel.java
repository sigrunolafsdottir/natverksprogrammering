package V1_ÖvnUppg2_ArvInterface;

public class Cykel extends Fordon implements Printable, IHjulburen{
    private int antalVäxlar;
    private int antalHjul = 2;
    
    public Cykel(int hastighet, int vikt, int antalVäxlar) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
    }
    
    public void trampa(){}
    
    public void printMe(){
        System.out.println("Cykel med hastighet " 
                +getHastighet()+ " km/h, vikt " 
                + getVikt() +" kg och antalVäxlar: " 
                + antalVäxlar);
    }
    
    public int getAntalHjul(){
        return antalHjul;
    }
}
