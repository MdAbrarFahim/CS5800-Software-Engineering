
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SongTest {

    @Test
    public void testSongAttributes() {
        Song song = new Song(1, "Test Track", "Test Artist", "Test Album", 300);
        assertEquals(1, song.getId(), "ID should match the provided value");
        assertEquals("Test Track", song.getTitle(), "Title should match the provided value");
        assertEquals("Test Artist", song.getArtist(), "Artist should match the provided value");
        assertEquals("Test Album", song.getAlbum(), "Album should match the provided value");
        assertEquals(300, song.getDuration(), "Duration should match the provided value");
    }
    @Test
    public void testSetters() {
        Song song = new Song(1, "Old Title", "Old Artist", "Old Album", 200);
        song.setTitle("New Title");
        song.setArtist("New Artist");
        song.setAlbum("New Album");
        song.setDuration(400);
        
        assertEquals("New Title", song.getTitle(), "Title should be updated");
        assertEquals("New Artist", song.getArtist(), "Artist should be updated");
        assertEquals("New Album", song.getAlbum(), "Album should be updated");
        assertEquals(400, song.getDuration(), "Duration should be updated");
    }
}
