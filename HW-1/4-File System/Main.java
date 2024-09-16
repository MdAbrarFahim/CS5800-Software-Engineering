import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        

        String[] appSubFolderNames = new String[]{"config", "controllers", "library", "migrations", "models", "views"};
        List<Folder> appSubFolders = new ArrayList<>();

        Arrays.stream(appSubFolderNames).forEach(folderName -> appSubFolders.add(new Folder(folderName, new ArrayList<>(), new ArrayList<>())));

        Folder app = new Folder("app", new ArrayList<>(), appSubFolders);
        Folder phalcon = new Folder(".phalcon", new ArrayList<>(), new ArrayList<>());
        Folder cache = new Folder("cache", new ArrayList<>(), new ArrayList<>());
        Folder publicFolder = new Folder("public", new ArrayList<>(), new ArrayList<>());
        List<Folder> sourceFileSubFolders = new ArrayList<>();
        sourceFileSubFolders.add(phalcon);
        sourceFileSubFolders.add(app);
        sourceFileSubFolders.add(cache);
        sourceFileSubFolders.add(publicFolder);

        List<File> sourceFileSubFiles = new ArrayList<>();
        sourceFileSubFiles.add(new File(".htaccess"));
        sourceFileSubFiles.add(new File(".htrouter.php"));
        sourceFileSubFiles.add(new File("index.html"));

        
        Folder sourceFiles = new Folder("Source Files", sourceFileSubFiles, sourceFileSubFolders);
        
        Folder includePath = new Folder("Include Path" ,new ArrayList<>(), new ArrayList<>());

        Folder remoteFiles = new Folder("Remote Files", new ArrayList<>(), new ArrayList<>());

        List<Folder> php_subFiles = new ArrayList<>();
        php_subFiles.add(sourceFiles);
        php_subFiles.add(includePath);
        php_subFiles.add(remoteFiles);

        Folder php_demo1 = new Folder("php_demo1", new ArrayList<>(), php_subFiles);

        
        System.out.println("Given Structure-");
        php_demo1.print();

        System.out.println();
        php_demo1.deleteFolder("php_demo1/Source Files/app");
        System.out.println("Deleting App folder- (php_demo1/Source Files/app) ");
        php_demo1.print();



        System.out.println();
        php_demo1.deleteFolder("php_demo1/Source Files/public");
        System.out.println("Deleting Public folder- (php_demo1/Source Files/public) ");
        php_demo1.print();
    }
}