package V1_ÖvnUppg3_ArvInterface.Uppg3A;

import V1_ÖvnUppg3_ArvInterface.Uppg3A.Fordon;

public class Bil extends Fordon {
    private int motoreffekt;
    private int antalHjul = 4;

    public Bil(int hastighet, int vikt, int motoreffekt) {
        super(hastighet, vikt);
        this.motoreffekt = motoreffekt;

    }

    public void växla() {
    }

    public void printMe() {
        System.out.println("Bil med hastighet " + getHastighet() + " km/h, vikt " + getVikt() + " kg och motoreffekt: " + motoreffekt);
    }

    public int getAntalHjul() {
        return antalHjul;
    }
}
