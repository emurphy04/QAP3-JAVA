package Problem2;

public class Demo {
    public static void main(String[] args) {
        Shape S = new Shape("Red", true);

        Circle C = new Circle(5.0);

        Circle C1 = new Circle("blue", true, 5.0);

        Rectangle R = new Rectangle(2.0, 3.0);

        Rectangle R1 = new Rectangle("green", false, 2.0, 3.0);

        Square Sq = new Square(4.0);

        Square Sq1 = new Square("yellow", true, 4.0);

        System.out.println(S.toString());
        System.out.println(C.toString());
        System.out.println(C.getArea()+" "+C.getPerimeter());

        System.out.println(C1.toString());
        System.out.println(C1.getArea()+" "+C1.getPerimeter());

        System.out.println(R.toString());
        System.out.println(R.getArea()+" "+R.getPerimeter());

        System.out.println(R1.toString());
        System.out.println(R1.getArea()+" "+R1.getPerimeter());

        System.out.println(Sq.toString());
        System.out.println(Sq.getArea()+" "+Sq.getPerimeter());

        System.out.println(Sq1.toString());
        System.out.println(Sq1.getArea()+" "+Sq1.getPerimeter());
    }
}
