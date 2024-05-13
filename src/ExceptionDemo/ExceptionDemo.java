package ExceptionDemo;

public class ExceptionDemo {
    void secondmethod() throws TestException {
        throw new TestException("TestException Occurred in seconmethod");
    }

    void firstMethod() throws TestException {
        // throw new TestException("TestException Occurred in firstMethod");
            try{
                secondmethod();
            }
            catch (TestException ae){
                System.out.println("caught in firstMethod");
            }
    }


    public static void main(String args[]) throws Exception {
        ExceptionDemo obj = new ExceptionDemo();
     //   try{
            obj.firstMethod();
            System.out.println("Stuff in main");
     /*   }
        catch (TestException ae){
            System.out.println("Fel inträffade, main catchade");
            ae.printStackTrace();
        }*/

    }
}
