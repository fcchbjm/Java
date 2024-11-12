package whpu.E.E3.E1;

public class Rectangle extends GeometricObject{
    private double height;
    private double width;
    Rectangle(){
        height = 0.0;
        width = 0.0;
    }
    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public double getWidth(){
        return width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double findArea(){
        return  height * width;
    }
    public double findPerimeter(){
        return 2 * (height + width);
    }
    @Override
    public String toString() {
        return "该矩形的长是 " + getHeight() + " ,宽是 " + getWidth() + " ,面积为 " + findArea() + " ,周长为 " + findPerimeter();
    }
}
