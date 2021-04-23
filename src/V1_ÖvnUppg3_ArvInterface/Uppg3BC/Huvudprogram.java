package V1_ÖvnUppg3_ArvInterface.Uppg3BC;


import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {

    public void printFordon(Fordon fordon){
        fordon.printMe();
    }


    public Huvudprogram(){
        Tåg tåg = new Tåg(180, 300000, 5);
        Bil bil = new Bil(200, 1000, 70);
        Båt båt = new Båt(50, 300, 50);
        Cykel cykel = new Cykel(20, 5, 10);

        Fordon f = new Cykel(15, 7, 3);
        
        printFordon(bil);
        printFordon(båt);
        printFordon(tåg);
        printFordon(cykel);

        printFordon(f);

        System.out.println();
        
        List<Fordon> lista = new ArrayList<>();
        lista.add(tåg);
        lista.add(bil);
        lista.add(båt);
        lista.add(cykel);
        lista.add(f);

        for (Fordon ford : lista){
            ford.printMe();
        }
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Huvudprogram övn2 = new Huvudprogram();
    }
    
}
