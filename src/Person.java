/**
 *
 * @author douglasbeaver
 */
public class Person {

    private String name;
    private int age;
    private String street;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }    
    
    public String toString() {
        
        return name + "Name is: \n" + age + "Age is: ";
    }
}
