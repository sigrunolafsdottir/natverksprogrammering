package V1_ÖvnUppg3_ArvInterface.Uppg3BC;



public class Huvudprogram {

    public void printFordon(Fordon fordon){
        fordon.printMe();
    }


    Huvudprogram(){
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
        

        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Huvudprogram övn2 = new Huvudprogram();
    }
    
}
