package quan_li_sinh_vien.controllers;



import quan_li_sinh_vien.common.CheckException;
import quan_li_sinh_vien.services.IStudentService;
import quan_li_sinh_vien.services.ITeacherService;
import quan_li_sinh_vien.services.Impl.StudentServiceImpl;
import quan_li_sinh_vien.services.Impl.TeacherServiceImpl;

import java.util.Scanner;

public class ManagmentControllers {
    private static Scanner scanner = new Scanner(System.in);
    private static IStudentService iStudentService = new StudentServiceImpl();
    private static ITeacherService iTeacherService = new TeacherServiceImpl();
    public void displayMainMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("Chào mừng bạn đến chương trình quản lý sinh viên!!!");
            System.out.println("Chọn chức năng: \n" +
                    "1.\tAdd new teacher or student\n" +
                    "2.\tDelete teacher or student\n" +
                    "3.\tDisplay teacher or student\n" +
                    "4.\tTìm kiếm teacher or student\n" +
                    "5.\tExit\n");
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
                    "1\tAdd teacher\n" +
                    "2\tAdd student\n" +
                    "3\tReturn main menu\n");
            System.out.print("Xin lựa chọn chức năng: ");
            Integer choice = 0;
            choice = CheckException.checkParseIntEx(choice);

            switch (choice) {
                case 1:
                    iTeacherService.addNew();
                    break;
                case 2:
                    iStudentService.addNew();
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
                    "1\tDelete teacher\n" +
                    "2\tDelete student\n" +
                    "3\tReturn main menu\n");
            System.out.print("Xin lựa chọn chức năng: ");
            int choice = 0;
            choice = CheckException.checkParseIntEx(choice);

            switch (choice) {
                case 1:
                    iTeacherService.delete();
                    break;
                case 2:
                    iStudentService.delete();
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
                    "1\tDisplay teacher\n" +
                    "2\tDisplay student\n" +
                    "3\tReturn main menu\n");
            System.out.print("Xin lựa chọn chức năng: ");
            int choice = 0;
            choice = CheckException.checkParseIntEx(choice);

            switch (choice) {
                case 1:
                    iTeacherService.displayList();
                    break;
                case 2:
                    iStudentService.displayList();
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
                    "1\tFind teacher\n" +
                    "2\tFind student\n" +
                    "3\tReturn main menu\n");
            System.out.print("Xin lựa chọn chức năng: ");
            int choice = 0;
            choice = CheckException.checkParseIntEx(choice);

            switch (choice) {
                case 1:
                    iTeacherService.find();
                    break;
                case 2:
                    iStudentService.find();
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
