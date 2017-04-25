import java.util.List;

public class Album {

    public Singer singer;
    public List<Song> songs;

    public Album(Singer singer, List<Song> songs) {
        this.singer = singer;
        this.songs = songs;
    }
}
