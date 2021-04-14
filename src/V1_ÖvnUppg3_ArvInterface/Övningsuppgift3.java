package V1_ÖvnUppg3_ArvInterface;

import java.util.ArrayList;
import java.util.List;

public class Övningsuppgift3 {
    
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
    
    Övningsuppgift3(){
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
        Printable p = new Cykel(45, 12, 78);
        
        printAntalHjul(bil);
        printAntalHjul(cykel2);
        
        List<Printable> hlist = new ArrayList<>();
        hlist.add(tåg);
        hlist.add(båt);
        hlist.add(bil);
        hlist.add(cykel);
        hlist.add(p);
        
        for (Printable h : hlist){
            h.printMe();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Övningsuppgift3 övn2 = new Övningsuppgift3();
    }
    
}
