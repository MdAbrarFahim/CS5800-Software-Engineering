import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class MusicMetadataProxyTest {

    private MusicService proxyService;
    private RealMusicServer realServer;

    @BeforeEach
    public void setUp() {
        realServer = new RealMusicServer();
        proxyService = new MusicMetadataProxy(realServer);
    }

    @Test
    public void testFindByID_CacheBehavior() {
        Song firstFetch = proxyService.findByID(1);
        assertNotNull(firstFetch, "Song should be found in server");
        Song cachedFetch = proxyService.findByID(1);
        assertSame(firstFetch, cachedFetch, "Song should be retrieved from cache");
    }

    @Test
    public void testFindByTitle_CacheBehavior() {
        List<Song> firstFetch = proxyService.findByTitle("Nirobe");
        if (firstFetch.isEmpty()) {
            System.out.println("No songs found for title 'Nirobe'. Check if the song data is correctly initialized.");
        }
        assertTrue(!firstFetch.isEmpty(), "Songs should be found in server");
        List<Song> cachedFetch = proxyService.findByTitle("Nirobe");
        assertSame(firstFetch, cachedFetch, "Songs should be retrieved from cache");
    }

    @Test
    public void testFindByAlbum_CacheBehavior() {
        List<Song> firstFetch = proxyService.findByAlbum("Album-Rupali Guiter");
        if (firstFetch.isEmpty()) {
            System.out.println("No songs found for album 'Album X'. Check if the album data is correctly initialized.");
        }
        assertTrue(!firstFetch.isEmpty(), "Songs should be found in server");
        List<Song> cachedFetch = proxyService.findByAlbum("Album-Prottoy");
        assertSame(firstFetch, cachedFetch, "Songs should be retrieved from cache");
    }
}
