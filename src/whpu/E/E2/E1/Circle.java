package whpu.E.E2.E1;

public class Circle {
    private double radius;
    public static int numOfObjets = 0;
    Circle(){
        radius = 0.0;
        ++numOfObjets;
    }
    Circle(double radius){
        this.radius = radius;
        ++numOfObjets;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.1415926535 * radius *radius;
    }
}
