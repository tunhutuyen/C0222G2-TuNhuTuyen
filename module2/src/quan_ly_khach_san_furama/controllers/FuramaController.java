package quan_ly_khach_san_furama.controllers;

import quan_ly_khach_san_furama.services.ICustomerService;
import quan_ly_khach_san_furama.services.IEmployeeService;
import quan_ly_khach_san_furama.services.IFacilityService;
import quan_ly_khach_san_furama.services.impl.CustomerServiceImpl;
import quan_ly_khach_san_furama.services.impl.EmployeeServiceImpl;
import quan_ly_khach_san_furama.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    private static Scanner scanner = new Scanner(System.in);
    private static  IEmployeeService iEmployeeService = new EmployeeServiceImpl();
    private static  ICustomerService iCustomerService = new CustomerServiceImpl();
    private static  IFacilityService iFacilityService = new FacilityServiceImpl();
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
                    break;
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
                    iEmployeeService.displayList();
                    break;
                case 2:
                    iEmployeeService.addNew();
                    break;
                case 3:
                    iEmployeeService.edit();
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
    public void customerManagementDisplay() {
        do {
            System.out.println("Chọn chức năng: \n" +
                    "1\tDisplay list customer\n" +
                    "2\tAdd new customer\n" +
                    "3\tEdit customer\n" +
                    "4\tDelete customer\n" +
                    "5\tReturn main menu\n");

            System.out.print("Xin lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iCustomerService.displayList();
                    break;
                case 2:
                    iCustomerService.addNew();
                    break;
                case 3:
                    iCustomerService.edit();
                    break;
                case 4:
                    iCustomerService.deleteCustomer();
                    break;
                case 5:
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
                    "3\tDisplay list facility maintenance\n" +
                    "4\tDisplay list facility map\n"+
                    "5\tReturn main menu\n");
            System.out.print("Xin lựa chọn facility: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    iFacilityService.display();
                    break;
                case 2:
                    typeFacilityDisplay();
                    break;
                case 3:
                    iFacilityService.displayListMaintenance();
                    break;
                case 4:
                    iFacilityService.displayFacilityList();
                    break;
                case 5:
                    System.out.println("Trở lại menu chính!!!");
                    return;
                default:
                    System.out.println("xin chọn lại");
                    break;
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
    private void typeFacilityDisplay(){
        do {
            System.out.println("Chọn loại hình cơ sở cần thêm:\n" +
                    "1.\tAdd New Villa\n" +
                    "2.\tAdd New House\n" +
                    "3.\tAdd New Room\n" +
                    "4.\tBack to menu");
            System.out.println("nhập lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    iFacilityService.addVilla();
                    break;
                case 2:
                    iFacilityService.addHouse();
                    break;
                case 3:
                    iFacilityService.addRoom();
                    break;
                case 4:
                    System.out.println("kêt thúc phiên!!!");
                    return;
                default:
                    System.out.println("chọn ngu chọn lại!!!!!!");
                    break;
            }
        }while (true);
    }
}
