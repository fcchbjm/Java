package whpu.E.E3.E3;

public class Point implements Cloneable{
    private int x;
    private int y;
    Point() {
        x = 0;
        y = 0;
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void setX(int x) {
        this.x = x;
    }
    void setY(int y) {
        this.y = y;
    }
    int getX() {
        return x;
    }
    int getY() {
        return y;
    }
//    @Override
//    public Object clone(){
//        Object obj = null;
//        obj = new Point(this.x, this.y);
//        return obj;
//    }
    @Override
    public Object clone(){
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        return obj;
    }
}
