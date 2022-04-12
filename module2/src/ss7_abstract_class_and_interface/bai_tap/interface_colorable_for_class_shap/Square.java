package ss7_abstract_class_and_interface.bai_tap.interface_colorable_for_class_shap;

import ss7_abstract_class_and_interface.bai_tap.Resizeable_for_class_shap.Shape;

public class Square extends Shape implements Colorable{
    private double size =1.0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
    public double getArea(){
        return Math.pow(size,2);
    }
    @Override
    public void resize(double percent) {
        this.size *= percent;
    }


    @Override
    public String toString() {
        return "Square{" +
                "size=" + size +
                "filled=" + super.isFilled() +
                "color=" + super.getColor() +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
