package ÖvnUppg11_serialisering;

import java.util.ArrayList;
import java.util.List;


public class ÖvnUppg11_serialisering {
    
    public void printList(List<Fordon> fordon){
        fordon.forEach(f -> f.printMe());
    }


    ÖvnUppg11_serialisering(){
        SerializationManager sm = new SerializationManager();
        
        Tåg tåg = new Tåg(180, 300000, 5);
        Bil bil = new Bil(200, 1000, 70);
        Båt båt = new Båt(50, 300, 50);
        Cykel cykel = new Cykel(50, 5, 10);
        
        List <Fordon> fordonsLista = new ArrayList<>();
        fordonsLista.add(tåg);
        fordonsLista.add(bil);
        fordonsLista.add(båt);
        fordonsLista.add(cykel);
        
        sm.serializeList(fordonsLista, 
                "src/ÖvnUppg11_serialisering/minaFordon.ser");
        
        List<Fordon> f = sm.deSerializeList();
        printList(f);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ÖvnUppg11_serialisering övn = new ÖvnUppg11_serialisering();
    }
    
}