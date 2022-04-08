package KlassDemo1;

public class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}
