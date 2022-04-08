package ss5_access_modifier_static_method_static_property.bai_tap.AccessModifier;

import ss5_access_modifier_static_method_static_property.thuc_hanh.Student;

public class G1 extends Student {
    private String classG1111 = "G1";

    public G1() {
    }
    public G1(int r, String n) {
        super(r, n);
    }

//    public void setMethod(String classG1111,String roll,String name  ){
//        super.rollno = roll;
//        this.classG1111 = classG1111;
//
//    }
    public void display1(){
        System.out.print(super.rollno);

    }
    public static void main(String[] args) {

    }
}
