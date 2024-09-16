public class Employee {
    private String FirstName;
    private String LastName;
    private String SSN;

    public Employee(String FirstName, String LastName, String SSN) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.SSN = SSN;

    }


    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getSSN(){
        return SSN;
    }

}