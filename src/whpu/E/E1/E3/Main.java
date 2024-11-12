package whpu.E.E1.E3;

public class Main {
    public int max(int x, int y){
        return x > y ? x : y;
    }
    public double max(double x, double y) {
        return x > y ? x : y;
    }
    public int max(int x, int y, int z){
        return x > y ? x > z ? x : y > z ? y :z : z > y ? z : y;
    }
    public double max(double x, double y, double z){
        return x > y ? x > z ? x : y > z ? y :z : z > y ? z : y;
    }
    public static void main(String args[]) {
        Main M = new Main();
        System.out.println("The maxnum between 3 and 4 is " + M.max(3,4));
        System.out.println("The maxnum between 3.0 and 5.4 is " + M.max(3.0,5.4));
        System.out.println("The maxnum between 3.0, 5.4 and 10.4 is " + M.max(3.0,5.4, 10.4));
    }
}
