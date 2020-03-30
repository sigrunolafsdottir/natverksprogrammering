package SimpleDemos;



import java.util.LinkedList;
import java.util.List;


public class ListDemo {

    public static void main (String[] args){
          
        List<String> l = new LinkedList<>();

        System.out.println("Size of List "+l.size());

        System.out.println();

        l.add("Toker");
        l.add("Blyger");
        l.add("Prosit");
        l.add("Trötter");
        

//        for (String s : l){
//            System.out.println(s);
//        }

        System.out.println();

//        for (int i = 0; i < l.size() ; i++){
//            System.out.println(l.get(i));
//        }

        System.out.println();

        System.out.println(l);
    }
}