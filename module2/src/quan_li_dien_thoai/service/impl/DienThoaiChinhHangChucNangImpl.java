package quan_li_dien_thoai.service.impl;

import quan_li_dien_thoai.common.CheckException;
import quan_li_dien_thoai.common.MyException;
import quan_li_dien_thoai.common.ReadAndWrite;
import quan_li_dien_thoai.model.DienThoai;
import quan_li_dien_thoai.model.DienThoaiChinhHang;
import quan_li_dien_thoai.model.DienThoaiXachTay;
import quan_li_dien_thoai.service.IDienThoaiChinhHangChucNang;
import quan_li_sinh_vien.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangChucNangImpl implements IDienThoaiChinhHangChucNang {
    private static Scanner scanner = new Scanner(System.in);
    private static List<DienThoai> phoneList = new ArrayList<>();
    private static List<DienThoaiXachTay> phoneHandleList = new ArrayList<>();
    private static List<DienThoaiChinhHang> phoneGenunisList;

    static {
        phoneGenunisList = ReadAndWrite.readFileCsvToListPhoneGenunis();
    }
    @Override
    public void addNew() {
        System.out.println("nhập mã điện thoại:");
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
        System.out.println("Nhập thời gian bảo hành");
        String time = scanner.nextLine();
        System.out.println("Nhập phạm vi bảo hành");
        String areas = scanner.nextLine();

        DienThoaiChinhHang phoneGenunis = new DienThoaiChinhHang(id, name, price, number, manufacturer,time,areas);
        phoneGenunisList.add(phoneGenunis);
        ReadAndWrite.writePHONEGENUNINToCsv(phoneGenunisList, false);
        System.out.println("Thêm điện thoại chính hãng ok rồi");
    }

    @Override
    public void delete() {
        phoneGenunisList = ReadAndWrite.readFileCsvToListPhoneGenunis();
        System.out.println("nhập id");
        Integer id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < phoneGenunisList.size(); i++) {
            if (phoneGenunisList.get(i).getId().equals(id)) {
                System.out.println("bạn có muốn xóa khỏi danh sách không\n" +
                        "1: yes\n" +
                        "2: no");
                Integer choice = 0;
                choice = CheckException.checkParseIntEx(choice);
                switch (choice) {
                    case 1:
                        phoneGenunisList.remove(i);
                        System.out.println(" xóa thành công");
                        ReadAndWrite.writePHONEGENUNINToCsv(phoneGenunisList,false);
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
        if (phoneGenunisList.isEmpty()){
            System.out.println("Danh sách rỗng");
        }else {
            for (DienThoaiChinhHang phone : phoneGenunisList) {
                System.out.println(phone);
            }
        }
    }

    @Override
    public void find() {

    }
}
