package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle.color = "yellow";
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
        System.out.println(circle instanceof Circle);
        circle = new Cylinder();
        System.out.println(circle instanceof Cylinder);
        ((Cylinder) circle).height= 1;
        System.out.println(circle.toString());
    }
}
