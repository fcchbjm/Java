package whpu.E.E3.E2;

public class Main {
    public static void main(String args[]) {
        ComparableCircle circle1 = new ComparableCircle(3);
        ComparableCircle circle2 = new ComparableCircle(4);
        ComparableCylinder cylinder1 = new ComparableCylinder(3,4);
        ComparableCylinder cylinder2 = new ComparableCylinder(2,5);
        System.out.println(Max.max(circle1, circle2) + "面积较大");
        System.out.println(Max.max(cylinder1, cylinder2) + "底面积较大");
    }
}
