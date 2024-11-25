package whpu.T.Exam.E1;

public class Salesman extends Employee{
    protected double monthlysale;
    static double percent = 0.30;
    Salesman(String name) {
        setName(name);
    }
    Salesman(String name, double monthlysale) {
        setName(name);
        this.monthlysale = monthlysale;
    }
    void setMonthlysale(double monthlysale) {
        this.monthlysale = monthlysale;
    }
    void setPercent(double percent){
        Salesman.percent = percent;
    }
    double getMonthlysale() {
        return monthlysale;
    }
    double getPercent() {
        return percent;
    }

    @Override
    double getSalary() {
        return monthlysale * percent;
    }

    @Override
    public String toString() {
        return "销售员";
    }
}
