package whpu.E.E4.E2;

//public class Circle {
//    private double radius;
//    Circle() {
//        radius = 0.0;
//    }
//    Circle(double radius) {
//        this.radius = radius;
//    }
//    void setRadius(double radius) {
//        this.radius = radius;
//    }
//    double getRadius() {
//        return radius;
//    }
//}

public class Circle
{
    protected double radius;
    public Circle(){
        radius = 1.0;
    }
    public Circle(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double findArea(){
        return radius * radius * Math.PI;
    }
    @Override
    public String toString(){
        return "The circle's radius is " + radius + " and its area is " + findArea();
    }
}
