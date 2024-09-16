public class Course {
    private Instructor instructor;
    private Textbook textbook;

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }



    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }


    public void printCourseInfo() {
        System.out.println("Course Name: Advanced Software Engineering");
        System.out.println();
        System.out.println("Instructor info-");
        instructor.printDetails();
        System.out.println();
        System.out.println("Textbook info-");
        textbook.printDetails();
    }
}
