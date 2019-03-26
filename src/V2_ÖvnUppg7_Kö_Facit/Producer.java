package V2_ÖvnUppg7_Kö_Facit;


public class Producer implements Runnable{
    
    public Thread aktivitet = new Thread(this);
    private QueueElement obj;
    private int interval;
    private SimpleQueue q;
    private int prio;
    
    public Producer (String txt, int sec, int prio, SimpleQueue k){
        interval = sec * 1000;
        q = k;
        this.prio = prio;
        obj = new QueueElement(txt);
    }
    
    public void run(){
        aktivitet.setPriority(prio);
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
