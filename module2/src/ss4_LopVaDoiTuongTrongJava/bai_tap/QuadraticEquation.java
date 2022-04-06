package ss4_LopVaDoiTuongTrongJava.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){

    }
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c;
    }
    public double getRoot1(){
        return (-(this.b) + Math.pow(Math.pow((this.b),2) -4*this.a*this.c, 0.5)) / (2*this.a);
    }
    public double getRoot2(){
        return (-(this.b) - Math.pow(Math.pow((this.b),2) -4*this.a*this.c, 0.5)) / (2*this.a);
    }
    public String display(){
        return "Hiển thị phương trình bậc 2: "+this.a+"* x^2 + "+this.b+" * x "+this.c+" =0";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập c: ");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() > 0){
            System.out.print("Phương trình có 2 nghiệm: x1 = "+quadraticEquation.getRoot1()+" và x2 = "+quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() == 0){
            System.out.print("Phương trình có nghiệm kép: x= "+quadraticEquation.getRoot1());
        }else {
            System.out.print("Phương trình vô nghiệm");
        }
    }
}
