package KlassDemo2;

public class Student extends Person{
    
    private String kurs;
    
    public Student(String namn, String kurs){
        super(namn);
        this.kurs = kurs;
    }
    

    @Override
    public void printMe(){
        System.out.println("Jag är Student "+name);
    }
    
}
