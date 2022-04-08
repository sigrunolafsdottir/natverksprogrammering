package KlassDemo1;


public class PersonDemo {

    public static void main(String[] args) {



        Person p = new Person("Sigrun", 5);
        System.out.println(p.getName());
        p.setName("Kalle");
        System.out.println(p.getName());


        //System.out.println(p.age);

    }

}
