import java.util.ArrayList;
import java.util.List;

public class RealMusicServer implements MusicService {

    private final List<Song> songsDatabase;

    public RealMusicServer() {
        songsDatabase = new ArrayList<>();
        songsDatabase.add(new Song(1, "Baba", "Artist-James", "Album-Baba", 350));
        songsDatabase.add(new Song(2, "Nirobe", "Artist-Bachchu", "Album-Rupali Guiter", 360));
        songsDatabase.add(new Song(3, "Sweety", "Artist-Hasan", "Album-Sweety", 370));
        songsDatabase.add(new Song(4, "Nila", "Artist-Shafin", "Album-Prottoy", 380));
        songsDatabase.add(new Song(5, "Jahaji", "Artist-Tuhin", "Album-Hashimukh", 390));

    }

    @Override
    public Song findByID(Integer id) {
        simulateNetworkDelay();
        return songsDatabase.stream().filter(song -> song.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Song> findByTitle(String title) {
        simulateNetworkDelay();
        List<Song> results = new ArrayList<>();
        for (Song song : songsDatabase) {
            if (song.getTitle().equals(title)) {
                results.add(song);
            }
        }
        return results;
    }

    @Override
    public List<Song> findByAlbum(String album) {
        simulateNetworkDelay();
        List<Song> results = new ArrayList<>();
        for (Song song : songsDatabase) {
            if (song.getAlbum().equals(album)) {
                results.add(song);
            }
        }
        return results;
    }

    private void simulateNetworkDelay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
