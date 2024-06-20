package Problem2;

public class Circle extends Shape{
    double radius = 1.0;

    public Circle(){
        radius = 1.0;
    }

    public Circle(double newRadius){
        radius = newRadius;
    }

    public Circle(String color, boolean filled, double newRadius){
        super(color, filled);
        radius = newRadius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return Math.PI * (2*radius);
    }

    public String toString(){
        return "A Circle with a radius of "+radius+" which is a subclass of "+super.toString();
    }
}
