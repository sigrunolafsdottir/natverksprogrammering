package SimpleDemos;


public class IntDemo {

    public static void Adder(int i){
        i = i+1;
        System.out.println("i inside Adder: "+i);
    }


    public static void main (String[] args){
        int i = 1;
        System.out.println("i before adding: "+ i);
        Adder(i);
        System.out.println("i after adding: "+i);
    }

}