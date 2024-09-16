import java.util.ArrayList;
public class Course {
    private String courseName;
    private ArrayList<Instructor> instructors = new ArrayList<>();
    private ArrayList<Textbook> textbooks = new ArrayList<>();


    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }
    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }


    public void addInstructor(Instructor instructor) {
        this.instructors.add(instructor);
    }
    public void setTextbooks(ArrayList<Textbook> textbooks) {
        this.textbooks = textbooks;
    }

    public ArrayList<Textbook> getTextbooks() {
        return textbooks;
    }

    public void addTextbook(Textbook textbook) {
        this.textbooks.add(textbook);
    }

    public void printCourseInfo() {
        System.out.println("Course Name: Advanced Software Engineering");
        System.out.println();

        instructors.forEach(instructor -> {
            System.out.println("Instructor info-");
            System.out.println("Name: " + instructor.getInstructorFirstName() + " " + instructor.getInstructorLastName());
            System.out.println("Office: " + instructor.getOffice());
            System.out.println();
        }
        );

        textbooks.forEach(textbook -> {
            System.out.println();
            System.out.println("Textbook info-");
            System.out.println("Title: " + textbook.getTitle());
            System.out.println("Author: " + textbook.getAuthor());
            System.out.println("Publisher: " + textbook.getPublisher());
        }
        );
    }

}


