package ss7_abstract_class_and_interface.bai_tap.interface_colorable_for_class_shap;

import ss7_abstract_class_and_interface.bai_tap.Resizeable_for_class_shap.Circle;
import ss7_abstract_class_and_interface.bai_tap.Resizeable_for_class_shap.Rectangle;
import ss7_abstract_class_and_interface.bai_tap.Resizeable_for_class_shap.Shape;

public class Main {
    public static void main(String[] args) {
        Shape[] arrayShape = new Shape[5];
        arrayShape[0] = new Circle();
        arrayShape[1] = new Square();
        arrayShape[2] = new Rectangle();
        System.out.println(arrayShape[1] instanceof Square);
        System.out.println(arrayShape[1] instanceof Colorable);
        for (Shape shape:arrayShape) {
            if (shape instanceof Circle){
                System.out.println("areaCircle = "+((Circle)shape).getArea());
            }
            if (shape instanceof Colorable){
                System.out.println("areaSquare = "+((Square)shape).getArea());
                ((Square) shape).howToColor();;
            }
            if (shape instanceof Rectangle){
                System.out.println("areaCircle = "+((Rectangle)shape).getArea());
            }
        }

    }
}
