
public class Main{
    public static void main(String[] args) {
        RealMusicServer realServer = new RealMusicServer();
        MusicService proxyService = new MusicMetadataProxy(realServer);

        System.out.println(proxyService.findByID(3));
        System.out.println(proxyService.findByID(2));
        System.out.println(proxyService.findByID(1));

        System.out.println(proxyService.findByTitle("Sweety"));
        System.out.println(proxyService.findByTitle("Nirobe"));
        System.out.println(proxyService.findByTitle("Nila"));

        System.out.println(proxyService.findByAlbum("Album-Baba"));
        System.out.println(proxyService.findByAlbum("Album-Sweety"));
        System.out.println(proxyService.findByAlbum("Album-Hashimukh"));
    }
}
