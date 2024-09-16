public class Instructor {
    private String instructorFirstName;
    private String instructorLastName;
    private String office;

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

    public void setOffice(String office) {
        this.office = office;
    }


    public void printDetails() {
        System.out.println("Name: " + instructorFirstName + " " + instructorLastName);
        System.out.println("Office: " + office);
    }
}
