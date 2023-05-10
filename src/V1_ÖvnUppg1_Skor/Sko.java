package V1_ÖvnUppg1_Skor;

public class Sko {

    private int size;
    private String color;
    private String label;

    public Sko(int size, String color, String label) {
        this.size = size;
        this.color = color;
        this.label = label;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Sko{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", label='" + label + '\'' +
                '}';
    }

    public void print() {
        System.out.println("Storlek: " + size + " Märke: " + label + " Färg: " + color);
    }
}
