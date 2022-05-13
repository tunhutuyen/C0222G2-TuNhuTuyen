package quan_ly_khach_san_furama.services.impl;

import quan_ly_khach_san_furama.common.CheckRegex;
import quan_ly_khach_san_furama.common.ReadAndWrite;
import quan_ly_khach_san_furama.models.person.Employee;
import quan_ly_khach_san_furama.services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {
    private static  Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    static {
//        employeeList.add(new Employee(1,"Trương Hàn","12/3/1980","Nam","E22210111",
//                "0935465555","timthay@gmail.com","Hậu Đại học","Giám Đốc",20000000L));
//        employeeList.add(new Employee(2,"Trương Thanh","1/9/1990","Nữ","E52345232",
//                "0935443662","nguoinha@gmail.com","Đại học","Trưởng Phòng",10000000L));
        employeeList= ReadAndWrite.readFileCsvToListEmployee();
    }

    @Override
    public void displayList() {
        employeeList = ReadAndWrite.readFileCsvToListEmployee();
        System.out.println("Hiển thị danh sách nhân viên:");
        for (Employee employee:employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addNew() {

        System.out.println("nhập mã nhân viên:");
        boolean flag = true;
        Integer id =null;
        while (flag) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("nhập sai định dạng. Nhập lại");
            }
        }
        System.out.println("nhập tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.println("nhập ngày sinh:");
        String dateOfBirth = CheckRegex.isRegexAge(scanner.nextLine());
        System.out.println("nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.println("nhập CMND: ");
        String idCard = scanner.nextLine();
        System.out.println("nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("nhập email: ");
        String email = scanner.nextLine();
        System.out.println("nhập trình độ học vấn: ");
        String level = scanner.nextLine();
        System.out.println("nhập vị trí: ");
        String position = scanner.nextLine();
        System.out.println("nhập mức lương:");
        flag= true;
        Long salary= 0L;
        while (flag) {
            try {
                 salary = Long.parseLong(scanner.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("nhập sai định dạng. Nhập lại");
            }
        }
//        Long salary = Long.parseLong(scanner.nextLine());
        Employee employee = new Employee(id,name,dateOfBirth,gender,idCard,phoneNumber,email,level,position,salary);
        employeeList.add(employee);
        ReadAndWrite.writeEmployeeToCsv(employeeList,false);
        System.out.println("Thêm mới nhân viên thành công!!!");
    }

    @Override
    public void edit() {

        System.out.println("nhập mã nhân viên cần sửa:");
        Integer id = Integer.parseInt(scanner.nextLine());
        int i;
        boolean flag =false;
        for (i = 0;i  < employeeList.size(); i++) {
            if (employeeList.get(i).getId().equals(id)) {
                flag = true;
                break;
            }
        }
        if (flag){
            while (flag){
                flag = isFlagAndChooseEdit(i, flag);
                ReadAndWrite.writeEmployeeToCsv(employeeList,false);
            }
        }else {
            System.out.println("Không tìm thấy nhân viên có mã nhân viên là "+ id);
        }
    }

    private boolean isFlagAndChooseEdit(int i, boolean flag) {
        System.out.println("nhập lựa chọn: \n" +
                "1-Mã nhân viên \n" +
                "2-Họ tên \n" +
                "3-Ngày sinh\n" +
                "4-Giới tính\n" +
                "5-Số CMND \n" +
                "6-Số Điện Thoại\n" +
                "7- Email\n" +
                "8- Trình độ \n" +
                "9-Vị trí\n" +
                "10- lương\n"+
                "11-End \n");
        System.out.println("nhập lựa chọn:");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("nhập mã nhân viên cần sửa:");
                Integer idEmployee = Integer.parseInt(scanner.nextLine());
                employeeList.get(i).setId(idEmployee);
                System.out.println("Edit is successful!!!");
                break;
            case 2:
                System.out.println("nhập tên nhân viên:");
                String name = scanner.nextLine();
                employeeList.get(i).setName(name);
                System.out.println("Edit is successful!!!");
                break;
            case 3:
                System.out.println("nhập ngày sinh:");
                String date = scanner.nextLine();
                employeeList.get(i).setDateOfBirth(date);
                System.out.println("Edit is successful!!!");
                break;
            case 4:
                System.out.println("nhập giới tính: ");
                String gender = scanner.nextLine();
                employeeList.get(i).setGender(gender);
                System.out.println("Edit is successful!!!");
                break;
            case 5:
                System.out.println("nhập CMND: ");
                String idCard = scanner.nextLine();
                employeeList.get(i).setIdCard(idCard);
                System.out.println("Edit is successful!!!");
                break;
            case 6:
                System.out.println("nhập số điện thoại: ");
                String phoneNumber = scanner.nextLine();
                employeeList.get(i).setPhoneNumber(phoneNumber);
                System.out.println("Edit is successful!!!");
                break;
            case 7:
                System.out.println("nhập email: ");
                String email = scanner.nextLine();
                employeeList.get(i).setEmail(email);
                System.out.println("Edit is successful!!!");
                break;
            case 8:
                System.out.println("nhập trình độ học vấn: ");
                String level = scanner.nextLine();;
                employeeList.get(i).setLevel(level);
                System.out.println("Edit is successful!!!");
                break;
            case 9:
                System.out.println("nhập vị trí: ");
                String position = scanner.nextLine();
                employeeList.get(i).setPosition(position);
                System.out.println("Edit is successful!!!");
                break;
            case 10:
                System.out.println("nhập mức lương:");
                Long salary = Long.parseLong(scanner.nextLine());
                employeeList.get(i).setSalary(salary);
                System.out.println("Edit is successful!!!");
                break;
            case 11:
                flag = false;
                System.out.println("End edit!!!!");
                break;
            default:
                System.out.println("nhập qq gì vậy. Nhập lại đi!!!!!!!!!!!!!!");
        }
        return flag;
    }
}
