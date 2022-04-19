package ss12_java_collection_framwork.thuc_hanh.SortWithComparableAndComparator;

import ss12_java_collection_framwork.thuc_hanh.HashMapVsHashSet.Student;

import java.util.Comparator;

public class AgeComparable implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}
