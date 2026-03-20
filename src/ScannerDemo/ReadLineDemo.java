package ScannerDemo;


public class ReadLineDemo {

    ReadLineDemo() {

        int kostnad = 0;
        String input;
        boolean gettingKostnad = false;

        while (!gettingKostnad){
            input = IO.readln("Skriv din kostnad: ").trim();
            try {
                kostnad = Integer.parseInt(input);
                gettingKostnad = true;

            } catch (Exception e) {
                System.out.println("Felaktigt format på input, försök igen");
                //e.printStackTrace();
            }
         }

        System.out.println("Kostnad " + kostnad);

    }

    void main() {

    }

}
