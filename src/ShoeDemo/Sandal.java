package ShoeDemo;

import java.util.Enumeration;

public class Sandal extends Shoe{

    int numberOfStraps;

    public Sandal(int nrStraps, int size, String color, String type){
        super(size, type, color);
        this.numberOfStraps = nrStraps;
    }

}
