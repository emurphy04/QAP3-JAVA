package Problem2;

public class Rectangle extends Shape{
    double width = 1.0;
    double length = 1.0;

    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double newWidth, double newLength){
        width = newWidth;
        length = newLength;
    }

    public Rectangle(String color, boolean filled, double newLength, double newWidth){
        super(color, filled);
        width = newWidth;
        length = newLength;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(length + width);
    }

    public String toString(){
        return "A Rectangle with a length of "+length+" and a width of "+width+" which is a subclass of "+super.toString();
    }

}
