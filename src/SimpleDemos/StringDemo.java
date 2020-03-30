package SimpleDemos;


public class StringDemo {

        public static String Adder(String s){
            s = s + " Då";
            System.out.println("s inside Adder: "+s);
            return s;
        }
        
        public static Simpson Adder(Simpson s){
            s.name =  " Doh";
            System.out.println("s2 inside Adder: "+s.name);
            return s;
        }

        public static void main (String[] args){
            //Strings are immutable objects
            String s = "Hej";
            System.out.println("s before passing: "+ s);
            Adder(s);
            System.out.println("s after passing: "+s);
            
            //Passing an non-immutable object, containing a String
            Simpson s2 = new Simpson();
            System.out.println("s2 before passing: "+ s2.name);
            Adder(s2);
            System.out.println("s2 after passing: "+s2.name);
            
        }
        
    static class Simpson {
        String name = "Homer";
    }

}
