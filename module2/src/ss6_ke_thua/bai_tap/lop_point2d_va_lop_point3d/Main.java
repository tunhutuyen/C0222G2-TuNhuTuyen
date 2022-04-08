package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D.setX(5);
        System.out.println(point2D);
        Point3D point3D =new Point3D();
        System.out.println(point3D);
        point3D.setXYZ(3,3,3);
        System.out.println(point3D);
        System.out.println(point2D instanceof Point2D);
        System.out.println(point2D instanceof Point3D);
        System.out.println(point3D instanceof Point3D);
        System.out.println(point3D instanceof Point2D);
        System.out.println(point3D instanceof Point3D);
        System.out.println(point3D instanceof Point2D);

    }

}
