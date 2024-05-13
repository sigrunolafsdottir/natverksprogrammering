package KlassDemo2;

import java.util.ArrayList;
import java.util.List;


public class StudentDemo {

    public static void main(String[] args) {

        //Person d = new Person ("Sigrun");


        Student s = new Student("Sanna", "Nätverksprogrammering");
        System.out.println(s.getName());
        s.printMe();

        Person p = new Student("Pelle", "fdsfs");  //hur kan detta funka?
        System.out.println(p.getName());
        p.printMe();

        Person p2 = new Lärare("Sigrun", "fdsfs");  //hur kan detta funka?
        p2.printMe();

        //Student x = new Person ("Xavier", "Systemintegration");  //varför funkar inte detta?

//        s.printMe();
//        p.printMe();
//        
        List<Person> lista = new ArrayList<>();
        lista.add(s);
        lista.add(p);
        lista.add(p2);

//        
        for (Person person : lista) {
            person.printMe();
        }
    }

}
