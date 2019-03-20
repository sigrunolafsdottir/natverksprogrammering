package KlassDemo1;

public class Person {
    
    public String name;
    private int age;

    Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
}
