package quan_li_dien_thoai.controller;

import quan_li_dien_thoai.service.IDienThoaiChinhHangChucNang;
import quan_li_dien_thoai.service.IDienThoaiXachTayChucNang;
import quan_li_dien_thoai.service.impl.DienThoaiChinhHangChucNangImpl;
import quan_li_dien_thoai.service.impl.DienThoaiXachTayChucNangImpl;
import quan_li_sinh_vien.common.CheckException;
import quan_li_sinh_vien.services.IStudentService;
import quan_li_sinh_vien.services.ITeacherService;
import quan_li_sinh_vien.services.Impl.StudentServiceImpl;
import quan_li_sinh_vien.services.Impl.TeacherServiceImpl;

import java.util.Scanner;

public class QuanLiDienThoai {
    private static Scanner scanner = new Scanner(System.in);
    private static IDienThoaiChinhHangChucNang iDienThoaiChinhHangChucNang = new DienThoaiChinhHangChucNangImpl();
    private static IDienThoaiXachTayChucNang iDienThoaiXachTayChucNang = new DienThoaiXachTayChucNangImpl();
    public void displayMainMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Chào mừng bạn đến chương trình quản lý điện thoại!!!");
            System.out.println("Chọn chức năng: \n" +
                    "1.\tThêm mới điện thoại\n" +
                    "2.\tXóa điện thoại\n" +
                    "3.\tHIển thị điện thoại\n" +
                    "4.\tTìm kiếm điện thoại\n" +
                    "5.\tThoát\n");
            System.out.print("xin lựa chon: ");
            int choice = 0;
            choice = CheckException.checkParseIntEx(choice);
            switch (choice) {
                case 1:
                    addDisplay();
                    break;
                case 2:
                    deleteDisplay();
                    break;
                case 3:
                    displayManagmanetList();
                    break;
                case 4:
                    findList();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Xin nhập Chính xác!!!");
                    break;
            }
        }
    }
    public void addDisplay() {
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng: \n" +
                    "1\tThêm điện thoại chính hãng\n" +
                    "2\tThêm điện thoại xách tay\n" +
                    "3\tTrở lại menu\n");
            System.out.print("Xin lựa chọn chức năng: ");
            Integer choice = 0;
            choice = CheckException.checkParseIntEx(choice);

            switch (choice) {
                case 1:
                    iDienThoaiChinhHangChucNang.addNew();
                    break;
                case 2:
                    iDienThoaiXachTayChucNang.addNew();
                    break;
                case 3:
                    System.out.println("Trở lại menu chính!!!");
                    flag = false;
                    break;
                default:
                    System.out.println("xin chọn lại");
                    break;
            }
        }while (flag);
    }

    public void deleteDisplay() {
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng: \n" +
                    "1\tXóa điện thoại chính hãng\n" +
                    "2\tXóa điện thoại xách tay\n" +
                    "3\tTrở lại menu\n");
            System.out.print("Xin lựa chọn chức năng: ");
            int choice = 0;
            choice = CheckException.checkParseIntEx(choice);

            switch (choice) {
                case 1:
                    iDienThoaiChinhHangChucNang.delete();
                    break;
                case 2:
                    iDienThoaiXachTayChucNang.delete();
                    break;
                case 3:
                    System.out.println("Trở lại menu chính!!!");
                    flag = false;
                    break;
                default:
                    System.out.println("xin chọn lại");
                    break;
            }
        }while (flag);
    }
    public void displayManagmanetList() {
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng: \n" +
                    "1\tHiển thi điện thoại chính hãng\n" +
                    "2\tHiển thi điện thoại xách tay\n" +
                    "3\tReturn main menu\n");
            System.out.print("Xin lựa chọn chức năng: ");
            int choice = 0;
            choice = CheckException.checkParseIntEx(choice);

            switch (choice) {
                case 1:
                    iDienThoaiChinhHangChucNang.displayList();
                    break;
                case 2:
                    iDienThoaiXachTayChucNang.displayList();
                    break;
                case 3:
                    System.out.println("Trở lại menu chính!!!");
                    flag = false;
                    break;
//                    return;
                default:
                    System.out.println("xin chọn lại");
                    break;
            }
        }while (flag);
    }
    public void findList() {
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng: \n" +
                    "1\tTìm kiếm điện thoại chính hãng\n" +
                    "2\tTìm kiếm điện thoại xách tay\n" +
                    "3\tReturn main menu\n");
            System.out.print("Xin lựa chọn chức năng: ");
            int choice = 0;
            choice = CheckException.checkParseIntEx(choice);

            switch (choice) {
                case 1:
                    iDienThoaiChinhHangChucNang.find();
                    break;
                case 2:
                    iDienThoaiXachTayChucNang.find();
                    break;
                case 3:
                    System.out.println("Trở lại menu chính!!!");
                    flag = false;
                    break;
//                    return;
                default:
                    System.out.println("xin chọn lại");
                    break;
            }
        }while (flag);
    }
}
