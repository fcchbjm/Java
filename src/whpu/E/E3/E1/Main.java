package whpu.E.E3.E1;

public class Main {
    static boolean equalArea(GeometricObject object1, GeometricObject object2){
        return object1.findArea() == object2.findArea();
    }
    static String displayGeometricObject(GeometricObject object){
        return object.toString();
    }
    public static void  main(String args[]) {
        GeometricObject c = new Circle(3);
        GeometricObject r = new Rectangle(3, 4);
        System.out.println("面积是否相等:" + equalArea(c, r));
        System.out.println(displayGeometricObject(c));
        System.out.println(displayGeometricObject(r));
    }
}
