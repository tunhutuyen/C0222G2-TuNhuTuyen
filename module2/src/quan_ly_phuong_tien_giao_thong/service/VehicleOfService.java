package quan_ly_phuong_tien_giao_thong.service;

import quan_ly_phuong_tien_giao_thong.model.*;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class VehicleOfService implements VehicleOfServiceImpl{
    List<Vehicle> danhSachPhuongTien = new ArrayList<>();
     {
        Manufacturer hangSanXuat1 = new Manufacturer("K1","audi","germany");
        Manufacturer hangSanXuat2 = new Manufacturer("K2","camri","germany");
        Manufacturer hangSanXuat3 = new Manufacturer("K3","lambogini","germany");

        Vehicle oTo1 = new Car("43K-123",hangSanXuat1,2020,"Nguyễn Thanh",4,"cá nhân");
        Vehicle oTo2 = new Car("43D-321",hangSanXuat2,2022,"Nguyễn Tuân",7,"cá nhân");
        Vehicle xeTai1 = new Truck("51C-123",hangSanXuat3,2020,"Kim Thanh",1500.0);
        Vehicle xeTai2 = new Truck("59K-666",hangSanXuat1,2010,"Nam ANh",7500.0);
        Vehicle xeMay1 =new Motorcycle("92S-999",hangSanXuat2,2011,"Tân Tiến",150);
        Vehicle xeMay2 =new Motorcycle("82A-888",hangSanXuat3,2016,"Trần Cảnh",120);

        danhSachPhuongTien.add(oTo1);
        danhSachPhuongTien.add(oTo2);
        danhSachPhuongTien.add(xeMay1);
        danhSachPhuongTien.add(xeMay2);
        danhSachPhuongTien.add(xeTai1);
        danhSachPhuongTien.add(xeTai2);

    }
    @Override
    public void themMoi() {
        Scanner scanner = new Scanner(System.in);
        boolean flag =  true;
        do {
            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon){
                case 1:
                    System.out.println("Thêm mới ô tô: ");
                    Vehicle oToMoi = new Car();
                    oToMoi.nhapVao();
                    danhSachPhuongTien.add(oToMoi);
                    break;
                case 2:
                    System.out.println("THêm mới xe máy");
                    Vehicle xeMayMoi = new Motorcycle();
                    xeMayMoi.nhapVao();
                    danhSachPhuongTien.add(xeMayMoi);
                    break;
                case 3:
                    System.out.println("thêm mới xe tải: ");
                    Vehicle xeTaiMoi = new Truck();
                    xeTaiMoi.nhapVao();
                    danhSachPhuongTien.add(xeTaiMoi);
                case 0:
                    flag =false;
                    break;
                default:
                    System.out.println("xin chọn đúng quy đinh.");
                    break;
            }
        }while (flag);
    }

    @Override
    public void timKiemTheoBienKiemXoat() {
        System.out.println("sua ok");
    }

    @Override
    public void xoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Chọn biển kiểm soát muốn xóa: ");
        String bks = scanner.nextLine();
        boolean flag = false;
        int choice;
        int i;
        for (i = 0; i < danhSachPhuongTien.size(); i++) {
            if (bks.equalsIgnoreCase(danhSachPhuongTien.get(i).getBienKiemSoat())) {
                flag = true;
                break;
            }
        }
        if (flag) {
            do {
                System.out.println("Do you choice want delete: " + bks + "?");
                System.out.println("1. Yes" + "\n" +
                        "2. No");
                System.out.print("You choice: ");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        danhSachPhuongTien.remove(i);
                        System.out.println("Xóa thành công");
                        flag = false;
                        break;
                    case 2:
                        System.out.println("Bạn ko xóa");
                        flag = false;
                        break;
                    default:
                        System.out.println("chọn lại");
                        break;
                }
            } while (flag);
        } else {
            System.out.println("Biến kiểm soát: "+bks + "không tìm thấy");
        }
    }

    @Override
    public void hienThi() {
        Scanner scanner =new Scanner(System.in);
        boolean flag = true;
        do {
            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon){
                case 1:
                    System.out.println("Hiển thị xe ô tô");
                    for (Vehicle o: danhSachPhuongTien) {
                        if (o instanceof Car){
                            System.out.println(o);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Hiển thị xe máy");
                    for (Vehicle o: danhSachPhuongTien) {
                        if (o instanceof Motorcycle){
                            System.out.println(o);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Hiển thị xe tải");
                    for (Vehicle o: danhSachPhuongTien) {
                        if (o instanceof Truck){
                            System.out.println(o);
                        }
                    }
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("xin nhập đúng");
                    break;
            }
        }while (flag);
    }
}
