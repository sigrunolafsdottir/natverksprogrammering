package V1_ÖvnUppg3_ArvInterface.Uppg3BC;


public class Cykel extends Fordon {
    private int antalVäxlar;
    private int antalHjul = 2;

    public Cykel(int hastighet, int vikt, int antalVäxlar) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
    }

    public void trampa() {
    }

    public int getVäxlar(){
        return antalVäxlar;
    }

    public void printMe() {
        System.out.println("Cykel med hastighet "
                + getHastighet() + " km/h, vikt "
                + getVikt() + " kg och antalVäxlar: "
                + antalVäxlar);
    }

    public int getAntalHjul() {
        return antalHjul;
    }
}
