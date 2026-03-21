package V2_ÖvnUppg6_Kö_Facit;

public class QueueElement {
    protected String text;
    protected int pri;

    QueueElement(String o, int prio) {
        text = o;
        pri = prio;
    }

    public String getText() {
        return text;
    }

    public int getPri() {
        return pri;
    }

}
