package quan_ly_phuong_tien_giao_thong.controller;

import quan_ly_phuong_tien_giao_thong.service.VehicleOfService;

import java.util.Scanner;

public class VehicleController {
    public static void menu() {
        System.out.print("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIÊN GIAO THÔNG \n" +
                "Chọn chức năng: \n"+
                "1.Thêm \n" +
                "2.Hiển thị \n" +
                "3.Xóa \n" +
                "4.Tìm theo biển số \n" +
                "0.Thoát \n" +
                "Xin lựa chọn: ");
    }
    public static void danhMucPhuongTien() {
        System.out.println("1.*****Car: "+"\n" +
                "2.*****Moto: "+"\n" +
                "3.*****Truck: "+"\n" +
                "0.*****Exit"+"\n" +
                "Xin lựa chọn: ");
    }

    public void hienThiChucNang() {
        VehicleOfService vehicleOfService = new VehicleOfService();
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chọn loại phương tiện cần thêm: ");
                    danhMucPhuongTien();
                    vehicleOfService.themMoi();
                    break;
                case 2:
                    System.out.println("Chọn loại phương tiện cần xóa: ");
                    danhMucPhuongTien();
                    vehicleOfService.hienThi();
                    break;
                case 3:
                    vehicleOfService.xoa();
                    break;
                case 4:
                    vehicleOfService.suaDoi();
                    break;
                case 5:
                    System.out.println("see you again");
                    break;
                default:
                    System.out.println("Bạn nhập sai mời nhập lại ");
            }
        }
    }
}
