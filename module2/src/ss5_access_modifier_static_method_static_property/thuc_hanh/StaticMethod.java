package ss5_access_modifier_static_method_static_property.thuc_hanh;

public class StaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"hoàng");
        Student s2 = new Student(222,"nguyên");

        s1.display();
        s2.display();
    }
}
