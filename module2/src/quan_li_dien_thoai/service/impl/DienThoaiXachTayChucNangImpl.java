package quan_li_dien_thoai.service.impl;

import quan_li_dien_thoai.common.MyException;
import quan_li_dien_thoai.common.ReadAndWrite;
import quan_li_dien_thoai.model.DienThoaiXachTay;
import quan_li_dien_thoai.service.IDienThoaiXachTayChucNang;
import quan_li_dien_thoai.common.CheckException;
import quan_li_sinh_vien.models.Student;

import java.util.List;
import java.util.Scanner;

public class DienThoaiXachTayChucNangImpl implements IDienThoaiXachTayChucNang {
    private static Scanner scanner = new Scanner(System.in);
    private static List<DienThoaiXachTay> phoneHandleList;

    static {
        phoneHandleList = ReadAndWrite.readFileCsvToListPhoneHandle();
    }
    @Override
    public void addNew() {

        System.out.println("nhập mã sinh viên:");
        Integer id = 0;
        id = CheckException.checkParseIntEx(id);
        System.out.println("nhập tên điện thoại:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá bán:");
        Double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng:");
        Integer number = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập thời quốc gia xách tay");
        String national = scanner.nextLine();
        System.out.println("nhập trạng thái");
        String status = scanner.nextLine();

        DienThoaiXachTay phoneHandle = new DienThoaiXachTay(id, name, price, number, manufacturer,national,status);
        phoneHandleList.add(phoneHandle);
        ReadAndWrite.writePhoneHandleToCsv(phoneHandleList, false);
        System.out.println("Thêm điện thoại xách tay ok rồi");
    }

    @Override
    public void delete() {
        phoneHandleList = ReadAndWrite.readFileCsvToListPhoneHandle();
        System.out.println("nhập id");
        Integer id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < phoneHandleList.size(); i++) {
            if (phoneHandleList.get(i).getId().equals(id)) {

                System.out.println("bạn có muốn xóa khỏi danh sách không\n" +
                        "1: yes\n" +
                        "2: no");
                Integer choice = 0;
                choice = CheckException.checkParseIntEx(choice);
                switch (choice) {
                    case 1:
                        phoneHandleList.remove(i);
                        System.out.println(" xóa thành công");
                        ReadAndWrite.writePhoneHandleToCsv(phoneHandleList,false);
                        break;
                    case 2:
                        System.out.println("bạn đã không xóa");
                        break;
                    default:
                        System.out.println(" bạn nhập sai! xin mời nhập lại");
                        break;
                }
                return;
            }
        }
        try {
            throw new MyException("không có id " + id + " ở trong danh sách");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void displayList() {
        if (phoneHandleList.isEmpty()){
            System.out.println("Danh sách rỗng");
        }else {
            for (DienThoaiXachTay phone : phoneHandleList) {
                System.out.println(phone);
            }
        }
    }

    @Override
    public void find() {
        System.out.println("nhập name");
        String name = scanner.nextLine();

        boolean flag = false;
        for (DienThoaiXachTay phone: phoneHandleList) {
            if (phone.getName().contains(name)) {
                flag = true;
                break;
            }
        }

        if (flag) {
            for (DienThoaiXachTay phone: phoneHandleList) {
                if (phone.getName().contains(name)) {
                    System.out.println(phone);
                }
            }
        } else {
            try {
                throw new MyException(" không có id " + name + " ở trong danh sách");
            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
