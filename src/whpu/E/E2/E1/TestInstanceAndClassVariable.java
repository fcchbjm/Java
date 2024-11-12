package whpu.E.E2.E1;

public class TestInstanceAndClassVariable{
    public static void printCircle(Circle c){
        System.out.println("该圆的半径是 " + c.getRadius() + " ,面积为 " + c.getArea());
    }
    public static void main(String args[]){
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.0);
        Circle c3 = new Circle(3.0);
        printCircle(c1);
        printCircle(c2);
        printCircle(c3);
        System.out.println("共创建了 " + Circle.numOfObjets + " 个Circle类对象");
    }
}
