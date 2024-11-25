package whpu.T.Exam.E1;

public abstract class Employee {
    protected String name;
    protected double salary;

    Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return name;
    }
    double getSalary() {
        return salary;
    }
}
