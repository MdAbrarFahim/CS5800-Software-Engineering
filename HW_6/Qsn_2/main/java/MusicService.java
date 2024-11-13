
import java.util.List;

public interface MusicService {

    Song findByID(Integer id);
    List<Song> findByTitle(String title);
    List<Song> findByAlbum(String album);
}
