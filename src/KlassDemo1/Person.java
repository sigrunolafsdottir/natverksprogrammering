package KlassDemo1;

public class Person {

    private String name;
    private int age;
    private int luckyNumber;

    public Person(String name, int age, int luckyNumber) {
        this.name = name;
        this.age = age;
        this.luckyNumber = luckyNumber;
    }

    public String getName() {
        return name;
    }

    private int checkLuckyNumber(){
        if (luckyNumber == 13) return 14;
        else return luckyNumber;
    }

    public int getLuckyNumber() {
        return checkLuckyNumber();
    }

    public void setName(String newName) {
        name = newName;
    }
}
