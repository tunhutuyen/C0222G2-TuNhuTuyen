package ss17_io_binary_file_and_serialization.bai_tap.controller;

import java.util.Scanner;

public class ProductControll {
    public void displayMain(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Chào mừng bạn đến chương trình quản lý Furama resort!!!");
            System.out.println("Chọn chức năng: \n" +
                    "1.\tThêm sản phẩm\n" +
                    "2.\tHiển thị sản phẩm\n" +
                    "3.\tTìm kiếm \n" +
                    "4.\tExit\n");
            System.out.print("xin lựa chon: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("add ok");
                    break;
                case 2:
                    System.out.println("display ok");
                    break;
                case 3:
                    System.out.println("xóa ok");
                    break;
                case 4:
                    System.out.println("exit ok");
                    flag = false;
                    break;
                default:
                    System.out.println("Xin nhập Chính xác!!!");
            }
        }
    }
}
