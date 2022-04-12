package ss6_ke_thua.thuc_hanh;

public class Circle extends Shape {
    private double radius = 2.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return " A Circle with radius= " + radius +"\n"+
                getRadius()+" , which is subclass of "+
                super.toString();
    }
}


