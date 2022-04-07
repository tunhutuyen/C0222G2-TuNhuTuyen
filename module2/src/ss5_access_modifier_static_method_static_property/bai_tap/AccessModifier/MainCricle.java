package ss5_access_modifier_static_method_static_property.bai_tap.AccessModifier;

public class MainCricle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(10,"blue");
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getRadius());
        System.out.println(circle3.getColor());

    }
}
