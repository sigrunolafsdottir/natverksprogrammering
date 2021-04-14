package SimpleDemos;


public class StaticDemo {
    
    public static int staticInt = 5;
    public int regularInt = 7;
    
    private void print(String s){
        System.out.println(s);
    }
    private static void staticPrint(String s){
        System.out.println(s);
    }

    public StaticDemo(){
        print("Hej");
    }

    public static void main(String[] args) {

        StaticDemo statDemo = new StaticDemo();
        statDemo.print("Hej");

        System.out.println(staticInt);
//        //nedanstående funkar inte
        StaticDemo std = new StaticDemo();
        StaticDemo std1 = new StaticDemo();
        StaticDemo std2 = new StaticDemo();
        StaticDemo std3 = new StaticDemo();
        System.out.println(std.staticInt);
        System.out.println(std1.staticInt);
        System.out.println(std2.staticInt);
//        
//        //Vi kan också komma åt staticInt genom klassnamnet 
//        //observera att här har vi INTE skapat en instans av klassen
        System.out.println(StaticDemo.staticInt);
        System.out.println(Math.PI);
//        
//        //ok
       staticPrint("Anrop till statisk funktion");
//       //nedanstående kan vi inte anropa
       //print("funkar inte");
        StaticDemo myDemo = new StaticDemo();
//        //nedanstående kan bara accessas genom en instans av sin egna klass
        myDemo.print("Nu funkar det!!!");
//        //Det går bra att accessa statiska metoder genom en instans av klassen också
//        myDemo.staticPrint("Detta funkar också!!!");
    }
    
}
