package KlassDemo2;

public abstract class Person {
    
    protected String name;
    
    Person (String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public abstract void printMe();
}
