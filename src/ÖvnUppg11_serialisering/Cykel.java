package ÖvnUppg11_serialisering;

public class Cykel extends Fordon implements Printable{
    private int antalVäxlar;
    
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
}
