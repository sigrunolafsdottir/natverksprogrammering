package V2_ÖvnUppg5_Medicin;


import javax.swing.*;

public class Medicin implements Runnable {

    private String medicinNamn;
    private double interval;

    public Medicin(String medicinNamn, double ggrPerMinut) {
        this.medicinNamn = medicinNamn;
        this.interval = (60 / ggrPerMinut) * 1000;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(Math.round(interval));
                System.out.println("Dags att ta " + medicinNamn);
            } catch (InterruptedException e) {
                break;
            }
        }

    }

}
