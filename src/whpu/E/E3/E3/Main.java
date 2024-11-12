package whpu.E.E3.E3;

public class Main {
    public static void main(String args[]) {
        Circle c1 = new Circle(3, 4, 5);
        Circle c2 = (Circle) c1.clone();
        c2.setCenter(5,6);
        System.out.println(c1);
        System.out.println(c2);
    }
}
