package whpu.E.E3.E1;

abstract public class GeometricObject{
    protected String color;
    public double findArea(){
        System.out.println("GeometricObject.findArea()");
        return 0.0;
    }
    public double findPerimeter(){
        System.out.println("GeometricObject.findPerimeter()");
        return 0.0;
    }
    @Override
    public String toString() {
        return "GeometricObject.toString()";
    }
}
