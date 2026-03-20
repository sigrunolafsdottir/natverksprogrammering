package ThreadDemoInterface;


public class Skrivare implements Runnable {

    private String text;
    private long interval;

    public Skrivare(String text, long interval) {
        this.text = text;
        this.interval = interval * 1000;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(interval);
                System.out.println(text);
            } catch (InterruptedException e) {
                break;
            }
        }

    }


}
