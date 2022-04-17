package quan_ly_phuong_tien_giao_thong.controller;

import quan_ly_phuong_tien_giao_thong.service.VehicleOfService;

import java.util.Scanner;

public class VehicleController {
    public static void chonChucNang() {
        System.out.print("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIÊN GIAO THÔNG \n" +
                "Chọn chức năng: \n"+
                "1.Thêm \n" +
                "2.Hiển thị \n" +
                "3.Xóa \n" +
                "4.Tìm theo biển số \n" +
                "5.Thoát \n" +
                "Xin lựa chọn: ");
    }
    public static void chonPhuongTien() {
        System.out.println("1. Ô tô: "+"\n" +
                "2. Xe máy: "+"\n" +
                "3. Xe tải: "+"\n" +
                "0. Thoát"+"\n" +
                "Xin lựa chọn: ");
    }

    public void hienThiChucNang() {
        VehicleOfService vehicleOfService = new VehicleOfService();
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean flag = true;
        while (flag) {
            chonChucNang();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại phương tiện cần thêm: ");
                    chonPhuongTien();
                    vehicleOfService.themMoi();
                    break;
                case 2:
                    System.out.println("Chọn loại phương tiện cần xóa: ");
                    chonPhuongTien();
                    vehicleOfService.hienThi();
                    break;
                case 3:
                    vehicleOfService.xoa();
                    break;
                case 4:
                    vehicleOfService.timKiemTheoBienKiemXoat();
                    break;
                case 5:
                    System.out.println("Kết thúc!!!");
                    flag= false;
                    break;
                default:
                    System.out.println("Bạn nhập sai mời nhập lại ");
                    break;
            }
        }
    }
}
