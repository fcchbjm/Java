package whpu.E.E3.E1;

public class Circle extends GeometricObject{
    public static double PI = 3.1415926535;
    private double radius;
    Circle(){
        radius = 0.0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double findArea(){
        return  PI * radius * radius;
    }
    public double findPerimeter(){
        return 2 * PI * radius;
    }
    @Override
    public String toString() {
        return "该圆的半径是 " + getRadius() + " ,面积为 " + findArea() + " ,周长为 " + findPerimeter();
    }
}
