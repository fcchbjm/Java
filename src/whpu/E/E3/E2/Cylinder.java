package whpu.E.E3.E2;

public class Cylinder extends Circle{
    protected double hight;
    Cylinder() {
        radius = 0.0;
        hight = 0.0;
    }
    Cylinder(double radius, double hight){
        this.radius = radius;
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "半径为" + radius + "高为" + hight + "的圆柱体类";
    }
}
