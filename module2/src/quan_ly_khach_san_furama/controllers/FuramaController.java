package quan_ly_khach_san_furama.controllers;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    public void displayMainMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Chào mừng bạn đến chương trình quản lý Furama resort!!!");
            System.out.println("Chọn chức năng: \n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.print("xin lựa chon: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeManagementDisplay();
                    break;
                case 2:
                    customerManagementDisplay();
                    break;
                case 3:
                    facilityManagementDisplay();
                    break;
                case 4:
                    bookingManagementDisplay();
                    break;
                case 5:
                    promotionManagementDisplay();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.println("Xin nhập Chính xác!!!");
            }
        }
    }

    public void employeeManagementDisplay() {
        do {
        System.out.println("Chọn chức năng: \n" +
                "1\tDisplay list employees\n" +
                "2\tAdd new employee\n" +
                "3\tEdit employee\n" +
                "4\tReturn main menu\n");
            System.out.print("Xin lựa chọn: ");
        int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("display list");
                    break;
                case 2:
                    System.out.println("add employee");
                    break;
                case 3:
                    System.out.println("Edit employee");
                    break;
                case 4:
                    System.out.println("Trở lại menu chính!!!");
                    return;
                default:
                    System.out.println("xin chọn lại");
            }
        }while (true);
    }
    public void customerManagementDisplay() {
        do {
            System.out.println("Chọn chức năng: \n" +
                    "1\tDisplay list customer\n" +
                    "2\tAdd new customer\n" +
                    "3\tEdit customer\n" +
                    "4\tReturn main menu\n");
            System.out.print("Xin lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("display list customer");
                    break;
                case 2:
                    System.out.println("add customer");
                    break;
                case 3:
                    System.out.println("Edit customer");
                    break;
                case 4:
                    System.out.println("Trở lại menu chính!!!");
                    return;
                default:
                    System.out.println("xin chọn lại");
                    break;
            }
        }while (true);
    }
    public void facilityManagementDisplay() {
        do {
            System.out.println("Chọn chức năng: \n" +
                    "1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tEdit facility\n" +
                    "4\tReturn main menu\n");
            System.out.print("Xin lựa chọn facility: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("display list");
                    break;
                case 2:
                    System.out.println("add employee");
                    break;
                case 3:
                    System.out.println("Edit employee");
                    break;
                case 4:
                    System.out.println("Trở lại menu chính!!!");
                    return;
                default:
                    System.out.println("xin chọn lại");
            }
        }while (true);
    }
    public void bookingManagementDisplay() {
        do {
            System.out.println("Chọn chức năng" +
                    "1.\tDisplay list booking\n" +
                    "2.\tAdd list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            System.out.print("xin lựa chon: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("display list booking");
                    break;
                case 2:
                    System.out.println("add booking");
                    break;
                case 3:
                    System.out.println("Create new contracts");
                    break;
                case 4:
                    System.out.println("Display list contracts");
                    break;
                case 5:
                    System.out.println("Edit contracts");
                    break;
                case 6:
                    System.out.println("Trở lại menu chính!!!");
                    return;
                default:
                    System.out.println("xin chọn lại");
                    break;
            }
        }while (true);
    }
    public void promotionManagementDisplay() {
        do {
            System.out.println("Chọn chức năng: \n" +
                    "1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            System.out.print("xin lựa chon: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Display list customers use service");
                    break;
                case 2:
                    System.out.println("Display list customers get voucher");
                    break;
                case 3:
                    System.out.println("Trở lại menu chính!!!");
                    return;
                default:
                    System.out.println("xin chọn lại");
                    break;
            }
        }while (true);
    }
}
