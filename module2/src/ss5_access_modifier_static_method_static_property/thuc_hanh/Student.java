package ss5_access_modifier_static_method_static_property.thuc_hanh;

public class Student {
    public int rollno;
    private String name;
    private static String college = "BBDIT";

    public Student() {
    }

    protected void method(){
        System.out.println("hello");
    }
     public Student(int r, String n){
        rollno = r;
        name = n;
    }
    static void change(){
        college = "codegym";
    }
    public void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
