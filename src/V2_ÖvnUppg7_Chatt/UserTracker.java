package V2_ÖvnUppg7_Chatt;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

//We need a centralized place in order to keep track of users
//A clientHandler only knows about her own user, this class is used whenever 
//the clienthandler does something that concernes the other users

public class UserTracker {

    private static List<String> names = new ArrayList<String>();
    private static List<PrintWriter> writers = new ArrayList<PrintWriter>();

    public void addName(String s) {
        names.add(s);
    }
    
    public void addWriter(PrintWriter p) {
        writers.add(p);
    }
    
    public List<String> getNames() {
        return names;
    }
    
    public List<PrintWriter> getWriters() {
        return writers;
    }
    
    public boolean containsName(String s) {
        return names.contains(s);
    }
    
    public void removeName(String s) {
        names.remove(s);
    }
    
    public void removeWriter(PrintWriter p) {
        writers.remove(p);
    }

}
