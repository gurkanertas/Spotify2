import java.util.List;

public class Singer {
    public String name,surname;

    public Singer(String name, String surname, List<Song> songs) {
        this.name = name;
        this.surname = surname;
        this.songs = songs;
    }

    public List<Song> songs;
}
