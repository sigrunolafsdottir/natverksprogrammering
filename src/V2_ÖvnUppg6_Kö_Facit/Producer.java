package V2_ÖvnUppg6_Kö_Facit;


public class Producer implements Runnable {

    private QueueElement obj;
    private int interval;
    private SimpleQueue q;

    public Producer(String txt, int sec, int prio, SimpleQueue k) {
        interval = sec * 1000;
        q = k;
        obj = new QueueElement(txt, prio);
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(interval);
                q.put(obj);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
