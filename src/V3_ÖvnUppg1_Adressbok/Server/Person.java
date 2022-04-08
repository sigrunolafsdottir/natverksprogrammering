package V3_ÖvnUppg1_Adressbok.Server;

import java.io.Serializable;
import java.time.LocalDate;

//only available backend
public class Person implements Serializable {

    protected String name;
    String address;
    protected LocalDate dateOfBirth;

    public Person(String name, String address, LocalDate dateOfBirth) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(int year, int month, int day) {
        dateOfBirth = LocalDate.of(year, month - 1, day);
    }

    public LocalDate getBirthday() {
        return dateOfBirth;
    }

}
    
    
    
