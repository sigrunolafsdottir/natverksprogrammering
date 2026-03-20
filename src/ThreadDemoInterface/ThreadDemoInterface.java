package ThreadDemoInterface;

//Java25 med virituella trådar och kortare main-signatur

public class ThreadDemoInterface {

    void main() throws InterruptedException {

        Skrivare s1 = new Skrivare("Winter", 1);
        Skrivare s2 = new Skrivare("is", 2);
        Skrivare s3 = new Skrivare("coming", 3);

        Thread t1 = Thread.startVirtualThread(s1);
        Thread t2 = Thread.startVirtualThread(s2);
        Thread t3 = Thread.startVirtualThread(s3);

        Thread.sleep(10000);

        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
    }
}
