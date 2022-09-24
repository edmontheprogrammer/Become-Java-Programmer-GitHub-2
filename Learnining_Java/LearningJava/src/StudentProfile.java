public class StudentProfile {

    String firstName;
    String lastName;
    int expectedYearToGraduate;
    double GPA;
    String declaredMajor;

    public StudentProfile(String firstName, String lastName, int expectedYearToGraduate, double GPA, String declaredMajor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedYearToGraduate = expectedYearToGraduate;
        this.GPA = GPA;
        this.declaredMajor = declaredMajor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getExpectedYearToGraduate() {
        return expectedYearToGraduate;
    }

    public double setExpectedYearToGraduate(int expectedYearToGraduate) {
        this.expectedYearToGraduate = expectedYearToGraduate;
        return this.expectedYearToGraduate;
    }

    public int heldBack(int expectedYearToGraduate) {
       int heldBackYear = expectedYearToGraduate + 1;
        return heldBackYear;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getDeclaredMajor() {
        return declaredMajor;
    }

    public void setDeclaredMajor(String declaredMajor) {
        this.declaredMajor = declaredMajor;
    }
}
