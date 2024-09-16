public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setInstructorFirstName("Nima");
        instructor.setInstructorLastName("Davarpanah");
        instructor.setOffice("3-2636");

        Textbook textbook = new Textbook();
        textbook.setTitle("Clean Code");
        textbook.setAuthor("Robert Martin");
        textbook.setPublisher("Prentice Hall");

        Course course = new Course();
       //
        course.setInstructor(instructor);
        course.setTextbook(textbook);

        course.printCourseInfo();
    }

}
