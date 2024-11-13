import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class MainTest {

    private MusicService proxyService;
    private RealMusicServer realServer;

    @BeforeEach
    public void setUp() {
        realServer = new RealMusicServer();
        proxyService = new MusicMetadataProxy(realServer);
    }

    @Test
    public void testFindByID() {
        Song song = proxyService.findByID(1);
        assertNotNull(song, "Song should be found for ID 1");
        assertEquals(1, song.getId(), "Song ID should match");
        assertEquals("Baba", song.getTitle(), "Song title should match");

        Song cachedSong = proxyService.findByID(1);
        assertSame(song, cachedSong, "Song should be retrieved from cache");
    }

    @Test
    public void testFindByTitle() {
        List<Song> songs = proxyService.findByTitle("Sweety");
        assertFalse(songs.isEmpty(), "Songs should be found for title 'Sweety'");
        assertEquals("Sweety", songs.get(0).getTitle(), "Song title should match");

        List<Song> cachedSongs = proxyService.findByTitle("Sweety");
        assertSame(songs, cachedSongs, "Songs should be retrieved from cache");
    }

    @Test
    public void testFindByAlbum() {
        List<Song> songs = proxyService.findByAlbum("Album-Baba");
        assertFalse(songs.isEmpty(), "Songs should be found for album 'Album-Baba'");

        List<Song> cachedSongs = proxyService.findByAlbum("Album-Baba");
        assertSame(songs, cachedSongs, "Songs should be retrieved from cache");
    }

    @Test
    public void testInvalidSearch() {
        Song song = proxyService.findByID(999);
        assertNull(song, "No song should be found for invalid ID");

        List<Song> songs = proxyService.findByTitle("Nonexistent Song");
        assertTrue(songs.isEmpty(), "No songs should be found for invalid title");

        List<Song> albumSongs = proxyService.findByAlbum("Nonexistent Album");
        assertTrue(albumSongs.isEmpty(), "No songs should be found for invalid album");
    }
}
