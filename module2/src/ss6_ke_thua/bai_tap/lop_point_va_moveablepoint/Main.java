package ss6_ke_thua.bai_tap.lop_point_va_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4,5);
        System.out.println(point);
        MovablePoint movablePoint= new MovablePoint();
        movablePoint.setSpeed(1,2);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
