package V1_ÖvnUppg2_Skor;

import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {

    List<Sko> skolista = new ArrayList<>();

    public void addSko(int size, String color, String label) {
        Sko nySko = new Sko(size, color, label);
        skolista.add(nySko);
    }

    public void removeSko(int size, String color, String label) {
        int indexToRemove = -1;
        for (int i = 0; i < skolista.size(); i++) {
            if (skolista.get(i).getColor().equalsIgnoreCase(color)
                    && skolista.get(i).getLabel().equalsIgnoreCase(label)
                    && skolista.get(i).getSize() == size) {
                indexToRemove = i;
            }
        }
        if (indexToRemove != -1) {
            skolista.remove(indexToRemove);
        }
    }

    //lite problematiskt, risk för NullPointerException, men kort och koncis funktion
    public void updateColor(int index, String newColor) {
        skolista.get(index).setColor(newColor);
    }

    //om jag inte har koll på index i listan
    public void updateColor(int size, String oldColor, String label, String newColor) {
        int indexToUpdate = -1;
        for (int i = 0; i < skolista.size(); i++) {
            if (skolista.get(i).getColor().equalsIgnoreCase(oldColor)
                    && skolista.get(i).getLabel().equalsIgnoreCase(label)
                    && skolista.get(i).getSize() == size) {
                indexToUpdate = i;
            }
        }
        skolista.get(indexToUpdate).setColor(newColor);
    }

    public void listSko() {
        for (Sko s : skolista) {
            s.print();
        }
    }

    public Huvudprogram() {
        Sko s1 = new Sko(37, "Svart", "Doc Martens");
        Sko s2 = new Sko(37, "Svart", "Ecco");
        Sko s3 = new Sko(37, "Blå", "Nike");

        skolista.add(s1);
        skolista.add(s2);
        skolista.add(s3);

        for (Sko s : skolista) {
            s.print();
        }
        System.out.println();

        addSko(37, "gul", "stövlar");

        for (Sko s : skolista) {
            s.print();
        }
        System.out.println();

        updateColor(37, "gul", "stövlar", "orange");

        for (Sko s : skolista) {
            s.print();
        }
        System.out.println();

        removeSko(37, "orange", "stövlar");

        for (Sko s : skolista) {
            s.print();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Huvudprogram h = new Huvudprogram();

    }


}
