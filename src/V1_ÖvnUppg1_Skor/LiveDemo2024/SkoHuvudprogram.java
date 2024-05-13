package V1_ÖvnUppg1_Skor.LiveDemo2024;

import java.util.ArrayList;
import java.util.List;

public class SkoHuvudprogram {

    Skosamling skosamling = new Skosamling();

    public SkoHuvudprogram(){
        List<Sko> allaSkor = skosamling.getAllaSkor();

        for(Sko s: allaSkor){
            System.out.println(s);
        }

        System.out.println();
        allaSkor = skosamling.addSko(new Sko(37, "gul", "Nike"));

        for(Sko s: allaSkor){
            System.out.println(s);
        }

        System.out.println();
        allaSkor = skosamling.taBortSko(37, "gul", "Nike");

        for(Sko s: allaSkor){
            System.out.println(s);
        }

        System.out.println();
        allaSkor = skosamling.bytFargSko(37, "svart", "Dr Martens", "rosa");

        for(Sko s: allaSkor){
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        SkoHuvudprogram sh = new SkoHuvudprogram();
       // sh.skosamling.addSko(new Sko(38, "rosa", "nike"));
    }
}
