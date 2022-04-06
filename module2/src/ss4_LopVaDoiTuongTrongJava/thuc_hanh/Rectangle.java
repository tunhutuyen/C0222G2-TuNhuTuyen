package ss4_LopVaDoiTuongTrongJava.thuc_hanh;

public class Rectangle {
    double width;
    double height;

    public Rectangle(){
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.height + this.width) * 2;
    }
    public String display(){
        return "Rectangle có chiều dài = "+ height + "va chiều rộng là "+width;
    }
}
