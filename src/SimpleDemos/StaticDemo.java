package SimpleDemos;


public class StaticDemo {

    public static int staticInt = 5;
    public int regularInt = 7;

    private void print(String s) {
        System.out.println(s);
    }

    private static void staticPrint(String s) {
        System.out.println(s);
    }

    public StaticDemo() {
        print("Hej från StaticDemo");
    }

    public static void main(String[] args) {

        System.out.println(staticInt);

        StaticDemo staticD = new StaticDemo();
        StaticDemo staticD2 = new StaticDemo();
        System.out.println(staticD.staticInt);
        System.out.println(staticD2.staticInt);
        staticD.staticInt = 19;

        System.out.println(staticD2.staticInt);

     /*


        System.out.println(staticD.regularInt);

        staticPrint("hej");
        staticD.print("hej fr vanliga print");
*/
//        
//        //Vi kan också komma åt staticInt genom klassnamnet 
//        //observera att här har vi INTE skapat en instans av klassen
/*        System.out.println(StaticDemo.staticInt);
        System.out.println(Math.PI);

        StaticDemo std = new StaticDemo();
        System.out.println(std.staticInt);
        System.out.println(std.regularInt);

        //testa att ändra staticInt
        StaticDemo std2 = new StaticDemo();
        System.out.println(std2.staticInt);
        staticInt=9;
        System.out.println(std2.staticInt);*/
//        
//        //ok
 /*       staticPrint("Anrop till statisk funktion");
//       //nedanstående kan vi inte anropa
        //print("funkar inte");
        StaticDemo myDemo = new StaticDemo();
//        //nedanstående kan bara accessas genom en instans av sin egna klass
        myDemo.print("Nu funkar det!!!");
//        //Det går bra att accessa statiska metoder genom en instans av klassen också
//        myDemo.staticPrint("Detta funkar också!!!"); */
    }

}
