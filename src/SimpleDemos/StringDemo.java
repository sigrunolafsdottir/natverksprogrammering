package SimpleDemos;

public class StringDemo {

    public void Adder(String s) {
        s = s + " Då";
        IO.println("s inside Adder: " + s);
    }

    public void Adder(Simpson s) {
        s.name = "Doh";
        IO.println("s inside Adder: " + s.name);
    }

    void main(String[] args) {
        //Strings are immutable objects
        String s = "Hej";
        IO.println("s before passing: " + s);
        Adder(s);
        IO.println("s after passing: " + s);

        IO.println();
        //Passing an non-immutable object, containing a String
        Simpson s2 = new Simpson();
        IO.println("s2 before passing: " + s2.name);
        Adder(s2);
        IO.println("s2 after passing: " + s2.name);

    }

    class Simpson {
        String name = "Homer Simpson";
    }
}