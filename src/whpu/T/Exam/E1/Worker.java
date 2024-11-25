package whpu.T.Exam.E1;

public class Worker extends Employee{
    private int proNumbers;
    private static double profit = 30;
    Worker(String name) {
        setName(name);
    }
    Worker(String name, int proNumbers) {
        setName(name);
        this.proNumbers = proNumbers;
    }
    void setProNumbers(int proNumbers) {
        this.proNumbers = proNumbers;
    }
    void setProfit(double profit) {
        Worker.profit = profit;
    }
    int getProNumbers() {
        return proNumbers;
    }
    double getProfit() {
        return profit;
    }
    double getSalary() {
        return  proNumbers * profit * 0.20;
    }

    @Override
    public String toString() {
        return "工人";
    }
}
