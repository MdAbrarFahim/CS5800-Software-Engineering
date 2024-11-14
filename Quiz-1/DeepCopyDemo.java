import java.util.ArrayList;
import java.util.List;

public class DeepCopyDemo {
    public static void main(String[] args) {
        List<String> chapters = new ArrayList<>();
        chapters.add("Introduction");
        chapters.add("Main plot");
        BookDeepCopy originalBook = new BookDeepCopy("KakaBabu", "Sunil G.", chapters);

        BookDeepCopy clonedBook = (BookDeepCopy) originalBook.clone();
        System.out.println();

        System.out.println("Before modify");
        System.out.println("Main book: " + originalBook);
        System.out.println("Aftre cloned: " + clonedBook);

        originalBook.getChapters().add("End");

        System.out.println(". . . . . . .");
        System.out.println("After modify");
        System.out.println("main book: " + originalBook);
        System.out.println("After cloned: " + clonedBook);
    }
}
