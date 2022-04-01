package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập width: ");
        width = input.nextFloat();

        System.out.println("Nhập height: ");
        height = input.nextFloat();
        float area = width * height;

        System.out.println("Diện tích hcn là: "+area);
    }
}
