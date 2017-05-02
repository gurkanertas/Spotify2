/**
 * Created by GurkanErtas u on 29.4.2017.
 */
public class Singer {
    public String firstName;
    public String lastName;
    public int age;

    public Singer(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "FirstName:"+firstName+
                "\nLastName:"+lastName+
                "\nAge:"+age;
    }
}
