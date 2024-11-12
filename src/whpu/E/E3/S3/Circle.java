package whpu.E.E3.S3;

public class Circle implements Cloneable{
    private Point center;
    private double radius;
    public Circle()
    {
        this(new Point(10,10),10.0);
    }
    public Circle(Point center,double radius)
    {
        this.center=center;
        this.radius=radius;
    }
    public Point getCenter()
    {
        return center;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setCenter(Point center)
    {
        this.center=center;
    }
    public void setRadius(double radius)
    {
        this.radius=radius;
    }
    public double area()
    {
        return 3.1415*radius*radius;
    }
    @Override
    public Object clone()
    {
        Object o;
        try
        {
            o=super.clone();
            System.out.println(o);
            return o;
        }
        catch (CloneNotSupportedException e)
        {
        }
        //System.out.println(o);
        return null;
    }
}

