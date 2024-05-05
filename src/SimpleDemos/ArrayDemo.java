package SimpleDemos;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] myArray = new int[3];
        myArray[0] = 5;
        myArray[1] = 6;
        myArray[2] = 7;

        for(int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

        System.out.println();

        int[] myArray2 = {1,2,3};
        myArray2[1]=10;

        for(int i: myArray2){
            System.out.println(i);
        }

    }
}
