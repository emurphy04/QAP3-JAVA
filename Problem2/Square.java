package Problem2;

public class Square extends Rectangle{
    double side = 1.0;

    public Square(){
        side = 1.0;
    }

    public Square(double side){
        super(side, side);
        super.setLength(side);
        super.setWidth(side);
    }

    public Square(String color, boolean filled, double side){
        this.color = color;
        this.filled = filled;
        this.side = side;
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public String toString(){
        return "A Square with all sides having a length of "+side+" which is a subclass of "+super.toString();
    }
}
