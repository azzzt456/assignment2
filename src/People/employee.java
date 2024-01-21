package People;

public class employee extends person {
    private String position;
    private double salary;

    @Override
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPaymentAmount() {
        return salary;
    }

    public employee(){
    }
    public employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee:" + super.toString() + " earns " + getPaymentAmount() + " tenge";
    }
}