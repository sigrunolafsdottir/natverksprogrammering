package V1_ÖvnUppg1_Skor.livekodningÖvn1;

import java.util.ArrayList;
import java.util.List;

public class Skosamling {

    private List<Skor> minaSkor = new ArrayList<>();

    public void addToList(Skor s){
        minaSkor.add(s);
    }

    public Skosamling(){
        minaSkor.add(new Skor(37, "svart", "sandal"));
        minaSkor.add(new Skor(37, "blå", "stövlar"));
        minaSkor.add(new Skor(37, "rosa", "träskor"));

        addToList(new Skor(37, "vit", "sandal"));

        for(Skor s : minaSkor){
            System.out.println(s.toString());
        }
    }


}
