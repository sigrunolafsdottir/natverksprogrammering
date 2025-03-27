package SerializationDemo;

import java.io.Serializable;

public class Friend implements Serializable {

    protected String name;
    protected String email;

    public Friend() {}
    public Friend(String name, String email) {
        this.name = name;
        this.email=email;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email=email;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
