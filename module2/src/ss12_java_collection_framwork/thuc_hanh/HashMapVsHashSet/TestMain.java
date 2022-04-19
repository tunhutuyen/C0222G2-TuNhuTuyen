package ss12_java_collection_framwork.thuc_hanh.HashMapVsHashSet;

import java.util.HashMap;
import java.util.*;

public class TestMain {
    public static void main(String[] args) {
        Student student1 = new Student("toàn",14,"ĐN");
        Student student2= new Student("tâm",21,"ĐLak");
        Student student3 = new Student("ý",32,"HNoi");

        Map<Integer,Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        for (Map.Entry<Integer,Student> studen: studentMap.entrySet()) {
            System.out.println(studen.toString());
        }

        System.out.println("----------------set--------------------");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);

        for (Student student:studentSet) {
            System.out.println(student.toString());
        }


    }
}
