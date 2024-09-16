import java.util.Iterator;
//
import java.util.List;

public class Folder {
    private String name;
    private List<File> subFiles;
    private List<Folder> subFolders;

    public Folder(String name, List<File> files, List<Folder> folders) {
        this.name = name;
        this.subFiles = files;
        this.subFolders = folders;
    }


    public String getName() {
        return name;
    }
    public List<Folder> getSubFolders(){
        return this.subFolders;
    }
    public List<File> getSubFiles(){
        return this.subFiles;
    }

    public void deleteFolder(String folderPath){

        if (subFolders.isEmpty()) {
            return;
        }
        String[] path = folderPath.split("/");
        deleteFolderHelper(path, 1, this.getSubFolders());
    }

    private void deleteFolderHelper(String[] path, int index, List<Folder> subFolders){

        if (subFolders.isEmpty()){
            return;
        }

        if (index > path.length){
            return;
        }

        String currentFolderName = path[index];
        if(index == path.length - 1){


            Iterator<Folder> iterator = subFolders.iterator();
            while(iterator.hasNext()){
                Folder currentFolder = iterator.next();
                if (currentFolder.getName().equalsIgnoreCase(currentFolderName)){
                    iterator.remove();
                    return;
                }
            }
        }

        subFolders.stream().filter(folder -> folder != null
                        && folder.getName().equalsIgnoreCase(currentFolderName))
                .findFirst()
                .ifPresent(folder -> deleteFolderHelper(path, index + 1, folder.getSubFolders()));
    }
    public void print(){
        printHelper(this.name, this);
    }

    private void printHelper(String parentPath, Folder folder){
        if (folder == null){
            return;
        }
        System.out.println(parentPath);
        folder.getSubFiles().forEach(file -> System.out.println(parentPath + "/" + file.getName()));
        folder.getSubFolders().forEach(folder1 -> printHelper(parentPath +"/" + folder1.getName(), folder1));
    }

}