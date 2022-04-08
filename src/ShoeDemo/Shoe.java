package ShoeDemo;

public class Shoe {

    private int size;
    private String typeOfSHoes;
    private String color;

    public Shoe(){}

    public Shoe(int size, String typeOfSHoes, String color) {
        this.size = size;
        this.typeOfSHoes = typeOfSHoes;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTypeOfSHoes() {
        return typeOfSHoes;
    }

    public void setTypeOfSHoes(String typeOfSHoes) {
        this.typeOfSHoes = typeOfSHoes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
