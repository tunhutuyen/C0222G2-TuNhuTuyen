package ss7_abstract_class_and_interface.bai_tap.Resizeable_for_class_shap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        System.out.println("before: \n "+Arrays.toString(shapes));
        for (int i =0; i< shapes.length;i++){
            if (shapes[i] != null){
                shapes[i].resize((int)((Math.random()*99)+1));
            }
        }
        System.out.println("After: \n"+Arrays.toString(shapes));
    }
}
