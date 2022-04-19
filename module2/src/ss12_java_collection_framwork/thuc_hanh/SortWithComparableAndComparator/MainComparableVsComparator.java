package ss12_java_collection_framwork.thuc_hanh.SortWithComparableAndComparator;

import ss12_java_collection_framwork.thuc_hanh.HashMapVsHashSet.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparableVsComparator {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "HT");
        Student student1 = new Student("Nam", 26, "HN");
        Student student2 = new Student("Anh", 38, "HT" );
        Student student3 = new Student("Tung", 38, "HT" );

        List<Student> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);

        Collections.sort(lists);

        for(Student st : lists){
            System.out.println(st.toString());
        }
//      sai tên class AgeComparator
        AgeComparable ageComparator = new AgeComparable();
        Collections.sort(lists,ageComparator);

        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
