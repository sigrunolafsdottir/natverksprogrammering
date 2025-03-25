package V1_ÖvnUppg2_Skor.LiveDemo2024;

import java.util.ArrayList;
import java.util.List;

public class Skosamling {

    Sko s1 = new Sko(37, "blå", "Adidas");
    Sko s2 = new Sko(37, "svart", "Dr Martens");
    Sko s3 = new Sko(37, "brun", "Ecco");

    private List<Sko> allaSkor = new ArrayList<>();

    public Skosamling(){
        allaSkor.add(s1);
        allaSkor.add(s2);
        allaSkor.add(s3);
    }

    public List<Sko> getAllaSkor() {
        return allaSkor;
    }

    public List<Sko> addSko(Sko nySko) {
        allaSkor.add(nySko);
        return allaSkor;
    }

    public List<Sko> taBortSko(int size, String color, String label) {
        int index = -1;
        for(int i = 0; i < allaSkor.size(); i++){
            if (allaSkor.get(i).getSize() == size && allaSkor.get(i).getColor() == color &&
                    allaSkor.get(i).getLabel() == label)
                index = i;
        }
        if (index != -1) {
            allaSkor.remove(index);
        }
        return allaSkor;
    }

    public List<Sko> bytFargSko(int size, String color, String label, String newColor) {
        for(int i = 0; i < allaSkor.size(); i++){
            if (allaSkor.get(i).getSize() == size && allaSkor.get(i).getColor() == color &&
                    allaSkor.get(i).getLabel() == label)
                allaSkor.get(i).setColor(newColor);
        }
        return allaSkor;
    }
}
