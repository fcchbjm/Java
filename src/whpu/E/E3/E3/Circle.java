package whpu.E.E3.E3;

public class Circle implements Cloneable{
    private double radius;
    private Point center;
    Circle() {
        radius = 0.0;
        this.center = new Point();
    }
    Circle(double radius, int x, int y) {
        this.radius = radius;
        this.center = new Point(x, y);
    }
    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    void setCenter(int x, int y) {
        center.setX(x);
        center.setY(y);
    }
    Point getCenter() {
        return center;
    }
    void setCenter(Point center) {
        this.center = center;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    double getRadius() {
        return radius;
    }

//    @Override
//    public Object clone() {
//        Object obj=null;
//        obj = new Circle();
//        ((Circle)obj).setRadius(this.radius);
//        ((Circle)obj).center=(Point)this.center.clone();
//        return obj;
//    }

    @Override
    public Object clone() {
        Object obj=null;
        try {
            obj = super.clone();
            ((Circle)obj).center = (Point) center.clone();
        }
        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return obj;
    }

    @Override
    public String toString() {
        return "这是一个半径为" + radius + "坐标x为" + center.getX() + "坐标y为" + center.getY() + "的圆";
    }
}
