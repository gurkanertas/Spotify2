import java.util.List;

public class PlayList {
    public PlayList(String name, List<Song> songList) {
        this.name = name;
        this.songList = songList;
    }

    public String name;
    public List<Song> songList;
}
