package V1_ÖvnUppg2_ArvInterface;

public class Övningsuppgift2 {
    
    public void printFordon(Fordon fordon){
        fordon.printMe();
    }
    
    //tillhör Uppgift 2e
    public void printViaInterface(Printable whatever){
        whatever.printMe();
    }
    
    public void printAntalHjul(IHjulburen hjulburen){
        System.out.println("Antal hjul "+hjulburen.getAntalHjul());
    }
    
    Övningsuppgift2(){
        Tåg tåg = new Tåg(180, 300000, 5);
        Bil bil = new Bil(200, 1000, 70);
        Båt båt = new Båt(50, 300, 50);
        Cykel cykel = new Cykel(20, 5, 10);
        
        printFordon(bil);
        printFordon(båt);
        printFordon(tåg);
        printFordon(cykel);
        
        System.out.println();
        
        //tillhör Uppgift 2e
        printViaInterface(bil);
        printViaInterface(båt);
        printViaInterface(tåg);
        printViaInterface(cykel);
        
        IHjulburen bil2 = new Bil(300, 1500, 24);
        IHjulburen cykel2 = new Cykel(30, 15, 24);
        
        printAntalHjul(bil2);
        printAntalHjul(cykel2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Övningsuppgift2 övn2 = new Övningsuppgift2();
    }
    
}
