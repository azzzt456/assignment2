package People;

public class student extends person{
    private double gpa;

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getPaymentAmount() {
        return (gpa > 2.67) ? 36660.00 : 0.0;
    }

    public student() {
    }

    public student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + " earns " + getPaymentAmount() + " tenge";
    }
}