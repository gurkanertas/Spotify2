/**
 * Created by GurkanErtas u on 29.4.2017.
 */
public class Album {
    public String name;

    @Override
    public String toString() {
        return "Name:"+name;
    }

    public Album(String name) {
        this.name = name;
    }
}
