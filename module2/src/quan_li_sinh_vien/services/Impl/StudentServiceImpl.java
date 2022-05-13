package quan_li_sinh_vien.services.Impl;

import quan_li_sinh_vien.common.CheckException;
import quan_li_sinh_vien.common.ReadAndWrite;
import quan_li_sinh_vien.models.Student;
import quan_li_sinh_vien.services.IStudentService;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements IStudentService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList;

    static {
        studentList = ReadAndWrite.readFileCsvToListStudent();
    }

    @Override
    public void addNew() {
        System.out.println("nhập mã sinh viên:");
        Integer id = 0;
        id = CheckException.checkParseIntEx(id);
        System.out.println("nhập tên sinh viên:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        String dateOfBirth= scanner.nextLine();
        System.out.println("giới tính:");
        String gender= scanner.nextLine();
        System.out.println("Lớp học");
        String classStudent = scanner.nextLine();
        System.out.println("điểm");
        Double point = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, dateOfBirth, gender, classStudent,point);
        studentList.add(student);
        ReadAndWrite.writeStudentToCsv(studentList, false);
        System.out.println("Thêm customer ok rồi");
    }

    @Override
    public void delete() {
        System.out.println("Nhập id sinh viên muốn xóa: ");
        boolean flag = true;
        while (flag) {

            int i;
            Integer id = Integer.parseInt(scanner.nextLine());
            for (i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getId().equals(id)) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Bạn thật sự muốn xóa: \n" +
                        "1. Yes \n" +
                        "2. No \n");
                System.out.println("Lựa chọn của bạn: ");
                int choice =0;
                 choice = CheckException.checkParseIntEx(choice);
                switch (choice) {
                    case 1:
                        studentList.remove(studentList.get(i));
                        ReadAndWrite.writeStudentToCsv(studentList,false);
                        System.out.println("Xóa thành công");
                        break;
                    case 2:
                        System.out.println("Bạn không xóa");
                        flag = false;
                        break;
                    default:
                        System.out.println("bạn hãy nhập lại!!!");
                        break;
                }
            }else {
                System.out.println("không tìm thấy id");
            }
        }
    }

    @Override
    public void displayList() {
        if (studentList.isEmpty()){
            System.out.println("Danh sách rỗng");
        }else {
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

    @Override
    public void find() {
        System.out.print("nhập tên học sinh cần tìm kiếm: ");
        String name = scanner.nextLine();
        boolean flag = false;
        int i;
        for (i = 0; i <studentList.size() ; i++) {
            if (studentList.get(i).getName().contains(name)){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("kêt quả: "+ studentList.get(i));
        }else {
            System.out.println("không tìm thấy!!!");
        }
    }
}
