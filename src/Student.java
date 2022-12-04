public class Student {

    private String firstName;
    private String lastName;
    private int gradYear;
    private double gpa;
    private boolean inClub;

    public Student(String first, String last, int gradYear, double gpa, boolean inClub) {
        firstName = first;
        lastName = last;
        this.gradYear = gradYear;
        this.gpa = gpa;
        this.inClub = inClub;
    }

    // Add getter and setter methods for ALL instance variables here!
    //first name
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName (String newFirstName) {
        firstName = newFirstName;
    }

    //last name
    public String getLastName() {
        return lastName;
    }
    public void setLastName (String newLastName) {
        lastName = newLastName;
    }

    //grad year
    public int getGradYear() {
        return gradYear;
    }
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    //gpa
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double newGpa) {
        gpa = newGpa;
    }

    // in club
    public boolean isInClub() {
        return inClub;
    }
    public void setInClub(boolean newInClub) {
        inClub = newInClub;
    }

    public String studentInfo() {
        return "first name: " + firstName + ", last name: " + lastName +
                ", grad year: " + gradYear + ", gpa: " + gpa +
                ", is in club: " + inClub;
    }
}
