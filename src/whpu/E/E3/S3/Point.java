package whpu.E.E3.S3;

public class Point {
    private int x;
    private int y;
    public Point()
    {
        x=10;
        y=10;
    }
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void setX(int x)
    {
        if(x>0)
            this.x=x;
    }
    public void setY(int y)
    {
        if(y>0)
            this.y=y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public Object clone(){
        Object obj=null;
        try{
            obj=super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
}

