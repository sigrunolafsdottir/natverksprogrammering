package ÖvnUppg11_serialisering;

public class Bil extends Fordon implements Printable{
    private int motoreffekt;
    
    public Bil(int hastighet, int vikt, int motoreffekt) {
        super(hastighet, vikt);
        this.motoreffekt = motoreffekt;
    }
    
    public void växla(){}
    
    public void printMe(){
        System.out.println("Bil med hastighet " +getHastighet()
                + " km/h, vikt " + getVikt() +" kg och motoreffekt: " + motoreffekt);
    }
}
