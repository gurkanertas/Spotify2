import com.sun.org.apache.bcel.internal.generic.ALOAD;

import java.util.*;

/**
 * Created by GurkanErtas u on 29.4.2017.
 */
public abstract class Medify {
    public static List<User> users = new ArrayList<User>();
    public static List<Singer> singers= new ArrayList<Singer>();
    public static List<Album> albums = new ArrayList<Album>();
    public static HashMap<Singer, Album> singersAlbums = new HashMap<Singer,Album>();
    public static HashMap<User, Playlist> usersPlaylists = new HashMap<User,Playlist>();
    public static List<Playlist> playlists = new ArrayList<Playlist>();
    public static List<Song> songs = new ArrayList<Song>();
    public static HashMap<Singer, Song> singersSongs = new HashMap<Singer,Song>();
    void registerUser(String userName,String password){
        User user = new User(userName,password);
        users.add(user);
    };
    User findUser(String name){
        for(User user:users){
            if(user.userName.equalsIgnoreCase(name)){
                return user;
            }
        }
        return null;
    };
    List<User> findAllUsers(){
        for (User user:users){
            System.out.println(user);
        }
        return users;
    };
    Singer createSinger(Singer singer){
        singers.add(singer);
        System.out.println("This singer:"+singer);
        return singer;
    };
    List<Singer> findAllSinger(){
        for (Singer singer:singers){
            System.out.println(singer);
        }
        return singers;
    };
    List<Singer> findSingersBy(String name){
        List<Singer> singer_list = new ArrayList<Singer>();
        for(Singer singer:singers){
            if (singer.firstName.equalsIgnoreCase(name)){
                singer_list.add(singer);
            }
        }
        return singer_list;
    };
    void createAlbum(Singer singer,Album album){
        singers.add(singer);
        albums.add(album);
        singersAlbums.put(singer,album);
    };
    List<Album> findAllAlbums(){
        for(Album album:albums){
            System.out.println(album.toString());
        }
        return albums;
    };
    List<Album> findAlbumsBy(String name){
        List<Album> album_list = new ArrayList<Album>();
        for (Album album:albums){
            if (album.name.equalsIgnoreCase(name)){
                album_list.add(album);
            }
        }
        return album_list;
    };
    List<Album> findAlbumsBy(){
        List<Album> album_list =  new ArrayList<Album>();
        for(Singer singer :singersAlbums.keySet()  ){
            album_list.add(singersAlbums.get(singer));
        }
        return null;
    };

    void createPlaylist(User user,Playlist playList){
        users.add(user);
        usersPlaylists.put(user,playList);
        System.out.println("created user playlist :" + user+ " "+playList);
    };
    List<Playlist> findPlaylistBy(){
        List<Playlist> playlist_list =  new ArrayList<Playlist>();
        for(User user :usersPlaylists.keySet()  ){
            playlist_list.add(usersPlaylists.get(user));
        }
        return playlist_list;
    };
    List<Playlist> findPlaylistBy(User user, String name){
        List<Playlist> playlist_list =  new ArrayList<Playlist>();
        for(User user1 :usersPlaylists.keySet()){
            if (user1.equals(user)){
                Playlist playlist = usersPlaylists.get(user);
                if (playlist.name.equalsIgnoreCase(name)){
                    playlist_list.add(playlist);
                }
            }
        }
        return playlist_list;
    };
    Playlist getPlaylistDetail(User user, String name){
        for(User user1 :usersPlaylists.keySet()){
            if (user1.equals(user)){
                Playlist playlist = usersPlaylists.get(user1);
                if (playlist.name.equalsIgnoreCase(name))
                    return playlist;
            }
        }
        return null;
    };
    void createSong(Singer singer,Album album,Song song){
        singers.add(singer);
        albums.add(album);
        songs.add(song);
        singersAlbums.put(singer,album);
        singersSongs.put(singer,song);
    };
    Song getSongDetail(Singer singer,String name){
        for(Singer singer1 :singersSongs.keySet()) {
            if (singer1.equals(singer)){
                Song song = singersSongs.get(singer1);
                if (song.name.equals(name)){
                    return song;
                }
            }
        }
        return null;
    };
}
