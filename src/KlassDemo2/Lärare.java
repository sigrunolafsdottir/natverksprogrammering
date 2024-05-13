package KlassDemo2;

public class Lärare extends Person {

    private String kurs;

    public Lärare(String namn, String kurs) {
        super(namn);
        this.kurs = kurs;
    }

    @Override
    public void printMe() {
        System.out.println("Jag är Lärare " + name);
    }

}
