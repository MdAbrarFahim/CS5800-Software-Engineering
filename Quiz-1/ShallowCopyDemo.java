import java.util.ArrayList;
import java.util.List;

public class ShallowCopyDemo {
    public static void main(String[] args) {
        List<String> chapters = new ArrayList<>();
        chapters.add("Introduction");
        chapters.add("Main plot");
        BookShallowCopy originalBook = new BookShallowCopy("Himu", "Humayun Ahmed", chapters);

        BookShallowCopy clonedBook = (BookShallowCopy) originalBook.clone();

        System.out.println();

        System.out.println("Before modify");
        System.out.println("Main Book: " + originalBook);
        System.out.println("After cloned: " + clonedBook);

        originalBook.getChapters().add("Conclusion");
        System.out.println("- - - - - - - -");
        System.out.println("After modify");
        System.out.println("Min Book: " + originalBook);
        System.out.println("After cloned: " + clonedBook);
    }
}
