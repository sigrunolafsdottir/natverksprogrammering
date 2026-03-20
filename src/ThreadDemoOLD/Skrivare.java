package ThreadDemoOLD;

//inte längre rekommenderat att ärva Tread, bättre att använda Runnable (interface) och virutella trådar
//se ThreadDemoInterface-koden


public class Skrivare extends Thread {
    private String text;
    private long interval;

    public Skrivare(String text, long interval) {
        this.text = text;
        this.interval = interval * 1000;
    }

    @Override
    public void run() {

        while (!Thread.interrupted()) {
            try {
                Thread.sleep(interval);
                System.out.println(text);
            } catch (InterruptedException e) {
                System.out.println("Interrupted by Exception");
                break;
            }
        }
        if (Thread.interrupted()){
            System.out.println("Thread.interrupted");
        }
    }
}
