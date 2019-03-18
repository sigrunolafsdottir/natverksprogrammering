package SimpleDemos;


public class StringDemo {

        public static String Adder(String s){
            s = s + " Då";
            System.out.println("s inside Adder: "+s);
            return s;
        }

        public static void main (String[] args){
            String s = "Hej";
            System.out.println("s before passing: "+ s);
            s = Adder(s);
            System.out.println("s after passing: "+s);
        }

    }
