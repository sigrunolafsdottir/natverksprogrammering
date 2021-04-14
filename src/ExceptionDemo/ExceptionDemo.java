package ExceptionDemo;

public class ExceptionDemo {
    void secondmethod()throws TestException{  
        throw new TestException("TestException Occurred");  
    }  

    void firstMethod() throws TestException{ 
        throw new TestException("TestException Occurred");
//       try{
//            secondmethod();
//       }
//       catch (TestException ae){
//           System.out.println("caught in firstMethod");
//       }
    }
    
    
    public static void main (String args[]) throws Exception{
        ExceptionDemo obj=new ExceptionDemo(); 
       // try{
            obj.firstMethod(); 
            System.out.println("Stuff in try clause");
//        }
//        catch (TestException ae){
//            ae.printStackTrace();
//        }

    }  
}
