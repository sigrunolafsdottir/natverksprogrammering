package V2_ÖvnUppg7_Kö_Facit;


public class Consumer implements Runnable{
    public Thread aktivitet = new Thread(this);
    private int interval;
    private SimpleQueue q;
    
    public Consumer (int sec, SimpleQueue k){
        interval = sec * 1000;
        q = k;
    }
    
    public void run(){
        while(!Thread.interrupted()){
            try{
                Thread.sleep(interval);
                QueueElement e = (QueueElement)q.take();
                System.out.println("Taking "+e.getText());
            }
            catch (InterruptedException e){
                break;
            }
        }
    }

}
