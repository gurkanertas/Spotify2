
public class Song {
    public String name,duration,url;
    public Album album;
    public Singer singer;

    public Song(String name, String duration, String url, Album album, Singer singer) {
        this.name = name;
        this.duration = duration;
        this.url = url;
        this.album = album;
        this.singer = singer;
    }
}
