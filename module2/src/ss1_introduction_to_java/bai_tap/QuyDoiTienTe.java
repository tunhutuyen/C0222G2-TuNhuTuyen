package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class QuyDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn quy đổi: ");

        double money = scanner.nextDouble();
        double usd = money * 23000;
        System.out.println("Số tiền quy đổi là "+usd);
    }
}
