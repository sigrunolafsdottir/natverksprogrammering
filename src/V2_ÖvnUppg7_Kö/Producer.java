package V2_ÖvnUppg7_Kö;


public class Producer implements Runnable{
    
    public Thread aktivitet = new Thread(this);
    private QueueElement obj;
    private int interval;
    private SimpleQueue q;
    
    public Producer (String txt, int sec, SimpleQueue k){
        interval = sec * 1000;
        q = k;
        obj = new QueueElement(txt);
    }
    
    public void run(){
        while(!Thread.interrupted()){
            try{
                Thread.sleep(interval);
                q.put(obj);
            }
            catch (InterruptedException e){
                break;
            }
        }
    }
}
