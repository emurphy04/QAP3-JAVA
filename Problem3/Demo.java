package Problem3;

public class Demo {
    public static void main(String[] args) {
        Point point1 = new Point(2.3f, 5.9f);
        MoveablePoint point2 = new MoveablePoint(3.3f, 2.3f);
        System.out.println(point2);
        point2.Move();
        System.out.println(point2);
        point2.Move();
        System.out.println(point2);
    }
}
