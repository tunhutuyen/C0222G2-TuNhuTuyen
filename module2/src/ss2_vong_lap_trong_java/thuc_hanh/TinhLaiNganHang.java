package ss2_vong_lap_trong_java.thuc_hanh;

import java.util.Scanner;

public class TinhLaiNganHang {
    public static void main(String[] args) {
        double interestRate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the amount u want to send: ");
        int money = Integer.parseInt(scanner.nextLine());
        System.out.print("enter number of months u want to send: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("enter annual interest rate in percentage: ");
        interestRate = scanner.nextDouble();
        double total = 0;
        for (int i = 0; i < month; i++) {
            total += money * (interestRate / 100 / 12) * month;
        }
        System.out.print("Total of interest: "+total);
    }
}
