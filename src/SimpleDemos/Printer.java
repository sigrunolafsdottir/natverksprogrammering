package SimpleDemos;


public class Printer {
    
    String name;
    String textToPrint;
    
    public Printer(){};
    
    public Printer(String name, String text){
        this.name = name;
        textToPrint = text;
    }
    
    public void printer(){
        System.out.println(name+" says "+textToPrint);
    }

}
