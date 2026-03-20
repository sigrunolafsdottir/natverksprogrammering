package SimpleDemos;


public class IntDemo {

    int globalI = 10;

    public void Adder(int i) {
        i = i + 1;
        IO.println("i inside Adder: " + i);
    }

    //same behaviour as for int
    public void AdderInteger(Integer i) {
        i = i + 1;
        IO.println("i inside Adder: " + i);
    }


    void main() {
        int i = 1;
        IO.println("i before adding: " + i);
        Adder(i);
        IO.println("i after adding: " + i);

        IO.println("globalI = " + globalI);
        globalI++;
        IO.println("globalI = " + globalI);

        Adder(globalI);
        IO.println("globalI = " + globalI);

        IO.println();

        IO.println("i before addingInteger: " + i);
        AdderInteger(i);
        IO.println("i after addingInteger: " + i);

    }

}