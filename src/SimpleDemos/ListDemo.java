package SimpleDemos;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListDemo {


    public static void main(String[] args) {

        List<String> l = List.of("Toker", "Blyger", "Prosit", "Trötter");

        List<String> l2 = new LinkedList<>();
        l2.add("Snövit");
        l2.add("Törnrosa");
        l2.add("Lilla sjöjungfrun");
        l2.add("Rödluvan");

        System.out.println("Size of List " + l.size());

        System.out.println();

        for (String s : l){
            System.out.println(s);
        }

        System.out.println();

        for (int i = 0; i < l.size() ; i++){
           System.out.println(l.get(i));
       }

        System.out.println();

        System.out.println(l);

         System.out.println();

        l.forEach(System.out::println);

         System.out.println();

        l.forEach(i -> System.out.println(i));

        class Simpson {
            String name = "Homer Simpson";
        }

        //List<int> simpsons = new ArrayList<>();

        List<Simpson> simpsons = new ArrayList<>();
        simpsons.add(new Simpson());
        simpsons.add(new Simpson());

        System.out.println(simpsons);

        simpsons.forEach(i -> System.out.println(i.name));

    }
}