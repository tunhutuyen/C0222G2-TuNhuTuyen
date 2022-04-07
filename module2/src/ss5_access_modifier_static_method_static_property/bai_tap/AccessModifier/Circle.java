package ss5_access_modifier_static_method_static_property.bai_tap.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color) {
        this(radius);
        this.color = color;
    }
    public Circle(){

    }

    public String getColor() {
        return color;
    }

    //    private double getRadius() {
//        return radius;
//    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
