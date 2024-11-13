import java.util.HashMap;
import java.util.List;
//import.java.util.
import java.util.Map;

public class MusicMetadataProxy implements MusicService {
    private final MusicService realServer;
    private final Map<Integer, Song> idCache = new HashMap<>();
    private final Map<String, List<Song>> titleCache = new HashMap<>();
    private final Map<String, List<Song>> albumCache = new HashMap<>();

    public MusicMetadataProxy(MusicService server) {
        this.realServer = server;
    }

    @Override
    public Song findByID(Integer id) {
        if (idCache.containsKey(id)) {
            System.out.println();
            System.out.println("Fetching song by ID "+id+ " from cache");
            return idCache.get(id);
        }
        System.out.println();
        System.out.println("Fetching song by ID "+id+" from server");
        Song song = realServer.findByID(id);
        idCache.put(id, song);
        return song;
    }
    @Override
    public List<Song> findByTitle(String title) {
        if (titleCache.containsKey(title)) {
            System.out.println();
            System.out.println("Fetching the song titled "+title+" from cache");
            return titleCache.get(title);
        }
        System.out.println();
        System.out.println("Fetching the song titled " +title+" from server");
        List<Song> songs = realServer.findByTitle(title);
        titleCache.put(title, songs);
        return songs;
    }

    @Override
    public List<Song> findByAlbum(String album) {
        if (albumCache.containsKey(album)) {
            System.out.println();
            System.out.println("Fetching the song from album "+album+" from cache");
            return albumCache.get(album);
        }
        System.out.println();
        System.out.println("Fetching the song from album "+album+" from server");
        List<Song> songs = realServer.findByAlbum(album);
        albumCache.put(album, songs);
        return songs;
    }
}
