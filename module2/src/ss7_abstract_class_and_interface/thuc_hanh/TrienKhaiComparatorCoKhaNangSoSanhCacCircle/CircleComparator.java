package ss7_abstract_class_and_interface.thuc_hanh.TrienKhaiComparatorCoKhaNangSoSanhCacCircle;

import ss6_ke_thua.thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2){
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
