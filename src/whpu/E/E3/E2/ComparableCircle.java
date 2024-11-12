package whpu.E.E3.E2;

public class ComparableCircle extends Circle implements Comparable< ComparableCircle >{
    @Override
    public int compareTo(ComparableCircle o)
    {
        if(radius>o.radius)
            return 1;
        else if(radius<o.radius)
            return -1;
        else
            return 0;
    }
    ComparableCircle() {
        radius = 0.0;
    }
    ComparableCircle(double radius) {
        this.radius = radius;
    }
}
