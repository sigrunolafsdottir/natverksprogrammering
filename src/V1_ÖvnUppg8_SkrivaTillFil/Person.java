package V1_ÖvnUppg8_SkrivaTillFil;


public class Person {
    
    private String name;
    private String road;
    private String postalAddress;
    private int weight;
    private int height;
    private int age;
    
    public Person(){}
    
    public Person(String name, String road, String postalAddress, int age, int weight, int height ){
        this.name = name;
        this.road = road;
        this.postalAddress = postalAddress;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    

}
