package ss7_abstract_class_and_interface.thuc_hanh.InterfaceComparableChoCacLopHinhHoc;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("blue",false,2.5);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);


        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
