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

    public static void main(String[] args) {
        System.out.println(staticInt);
//        //nedanstående funkar inte
//       System.out.println(regularInt);
//        
//        //Vi kan också komma åt staticInt genom klassnamnet 
//        //observera att här har vi INTE skapat en instans av klassen
        System.out.println(StaticDemo.staticInt);
//        
//        //ok
       staticPrint("Anrop till statisk funktion");
//       //nedanstående kan vi inte anropa
       //print("funkar inte");
        //StaticDemo myDemo = new StaticDemo();
//        //nedanstående kan bara accessas genom en instans av sin egna klass
 //       myDemo.print("Nu funkar det!!!");
//        //Det går bra att accessa statiska metoder genom en instans av klassen också
 //       myDemo.staticPrint("Detta funkar också!!!");
    }
    
}
