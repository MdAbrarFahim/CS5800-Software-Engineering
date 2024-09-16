public class Main {
    public static void main(String[] args) {

        Course course = new Course();
        course.setCourseName("Advanced Software Engineering");

        Instructor instructor1 = new Instructor();
        instructor1.setInstructorFirstName("Nima");
        instructor1.setInstructorLastName("Davarpanah");
        instructor1.setOffice("3-2636");

        Textbook textbook1 = new Textbook();
        textbook1.setTitle("Clean Code");
        textbook1.setAuthor("Robert Martin");
        textbook1.setPublisher("Prentice Hall");
        //
        Instructor instructor2 = new Instructor();
        instructor2.setInstructorFirstName("Md Abrar");
        instructor2.setInstructorLastName("Fahim");
        instructor2.setOffice("94-348");

        Textbook textbook2 = new Textbook();
        textbook2.setTitle("Pother Pachali");
        textbook2.setAuthor("B.V. Banarjee");
        textbook2.setPublisher("Ananya Prokashoni");


        course.addInstructor(instructor1);
        course.addTextbook(textbook1);
        course.addInstructor(instructor2);
        course.addTextbook(textbook2);

        course.printCourseInfo();
    }

}

