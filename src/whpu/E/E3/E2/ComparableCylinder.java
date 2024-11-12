package whpu.E.E3.E2;

public class ComparableCylinder extends Cylinder implements Comparable< ComparableCylinder >{
    @Override
    public int compareTo(ComparableCylinder o) {
        if(radius>o.radius)
            return 1;
        else if(radius<o.radius)
            return -1;
        else
            return 0;
    }
    ComparableCylinder(){
        radius = 0.0;
        hight = 0.0;
    }
    ComparableCylinder(double radius, double hight){
        this.radius = radius;
        this.hight = hight;
    }
}
