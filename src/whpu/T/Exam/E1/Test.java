package whpu.T.Exam.E1;

public class Test {
    public static void displaySalary(Employee[] ems) {
        for(Employee e : ems) {
            System.out.println(e.toString() + e.getName() + "的月薪为" + e.getSalary());
        }
    }
    public static void main(String args[]) {
        Employee[] ems = new Employee[2];
        ems[0] = new Worker("a", 200);
        ems[1] = new Salesman("b", 300);
        displaySalary(ems);
    }
}
