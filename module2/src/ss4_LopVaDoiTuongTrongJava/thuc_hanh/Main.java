package ss4_LopVaDoiTuongTrongJava.thuc_hanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhập dài: ");
        double height = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập rộng: ");
        double width = Double.parseDouble(scanner.nextLine());

        Rectangle rectangle = new Rectangle(width,height);
        System.out.print("thông tin hình chữ nhật:\n"+rectangle.display());
        System.out.print("\n Chu vi: "+rectangle.getPerimeter());
        System.out.print("\nDiện tích: "+rectangle.getArea());
    }
}
