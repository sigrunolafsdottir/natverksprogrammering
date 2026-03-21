package V2_ÖvnUppg6_Kö_Facit;

import java.util.*;

public class SimpleQueue {
    private List<QueueElement> l = new Vector<QueueElement>();

    public int size() {  // ger antalet element i kön
        return l.size();
    }

    public synchronized void put(QueueElement obj) {
        int p = obj.pri;
        int i;

        //leta baklänges i kön tills rätt prio hittas
        for (i = size() - 1; i >= 0 && p > (l.get(i)).pri; i--)
            ;
        l.add(i + 1, obj);
        System.out.println("Putting " + obj.getText()+ "med prio: "+obj.pri +" på plats "+(i+1));
        notify();

    }

    public synchronized QueueElement take() { // tar ut första elementet
        while (l.isEmpty())
            try {
                wait();
            } catch (InterruptedException e) {
                return null;
            }
        QueueElement e = l.get(0);
        l.remove(0);
        return e;
    }

    public void printQueue() {
        l.forEach(o -> System.out.println(o.getText()));
    }
}

