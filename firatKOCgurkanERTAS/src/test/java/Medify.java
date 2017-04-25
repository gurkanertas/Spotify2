import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Medify {

    @Test
    public void registerUser(){
        assertTrue(new User("Gurkan","123456").equals(new User("Gurkan","123456")));
    }
    @Test
    public void playList(){
        assertTrue(new PlayList("playlist1",new ArrayList<Song>().add(new Song("Song1","5","youtube.com/video=2342",new Singer("Eminem","yok",null))))==null);
    }
    @Test
    public void song(){
        assertTrue(new Song("song1","3","youtube.com/video?rwer3",null,null) == null);
    }
    @Test
    public void album(){
        assertTrue(new Album(null,null) == null);
    }
    @Test
    public void singer(){
        assertTrue(new Singer("SİNGER1","SURNAME1",null) == null);
    }

}
