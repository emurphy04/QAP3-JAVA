package Problem2;

public class Shape {
    String color = "red";
    boolean filled = true;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String shapeColor, boolean isFilled){
        color = shapeColor;
        filled = isFilled;
    }

    public void setColor(String newColor){
        color = newColor;
    }

    public void setFilled(boolean isFilled){
        filled = isFilled;
    }

    public String getColor(){
        return color;
    }

    public boolean isFilled(){
        return filled;
    }

    public String toString(){
        if(filled == true){
            return "A Shape with color of "+color+" and filled.";
        } else {
            return "A Shape with color of "+color+" and is not filled.";
        }
        
    }
}

