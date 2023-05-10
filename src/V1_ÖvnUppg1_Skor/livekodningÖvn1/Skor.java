package V1_ÖvnUppg1_Skor.livekodningÖvn1;

public class Skor {

    private int size;
    private String färg;
    private String type;

    public Skor(int size, String färg, String type) {
        this.size = size;
        this.färg = färg;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Skor{" +
                "size=" + size +
                ", färg='" + färg + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
