package ThreadDemoInterface;



public class ThreadDemoInterface {
    public static void main(String[] args) throws InterruptedException {
        Skrivare s1 = new Skrivare("Winter", 1);
        Skrivare s2 = new Skrivare("is", 2);
        Skrivare s3 = new Skrivare("coming", 3);
        
        s1.aktivitet.start();
        s2.aktivitet.start();
        s3.aktivitet.start();
        Thread.sleep(10000);
        s1.aktivitet.interrupt();
        s2.aktivitet.interrupt();
        s3.aktivitet.interrupt();
        

        
    }
}
