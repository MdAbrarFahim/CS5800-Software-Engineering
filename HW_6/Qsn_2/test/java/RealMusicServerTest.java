
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class RealMusicServerTest {
    private RealMusicServer server;

    @BeforeEach
    public void setUp() {
        server = new RealMusicServer();
    }

    @Test
    public void testFindByID_ValidID() {
        Song song = server.findByID(1);
        assertNotNull(song, "Song should be found for valid ID");
        assertEquals(1, song.getId(), "Song ID should match");
    }

    @Test
    public void testFindByID_InvalidID() {
        Song song = server.findByID(999);
        assertNull(song, "No song should be found for invalid ID");
    }

    @Test
    public void testFindByTitle_ValidTitle() {
        List<Song> songs = server.findByTitle("Track 1");
        assertFalse(songs.isEmpty(), "Songs should be found for valid title");
        assertEquals("Track 1", songs.get(0).getTitle(), "Song title should match");
    }

    @Test
    public void testFindByAlbum_ValidAlbum() {
        List<Song> songs = server.findByAlbum("Album X");
        assertFalse(songs.isEmpty(), "Songs should be found for valid album");
    }
}
