package KlassDemo1;

public class Person {
    
    public String name;
    protected int age;

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
