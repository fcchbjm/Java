package whpu.E.E4.E3;

import whpu.E.E3.E3.Point;

public class Circle implements Cloneable
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
    public Object clone() {
        Object obj=null;
        obj = (Object) new Circle();
        ((Circle)obj).setRadius(this.getRadius());
        return obj;
    }

    @Override
    public String toString(){
        return "The circle's radius is " + radius + " and its area is " + findArea();
    }
}
