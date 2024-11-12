package whpu.E.E3.E2;

public class Circle {
    protected double radius;
    Circle() {
        radius = 0.0;
    }
    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "半径为" + radius + "的圆类";
    }
}
