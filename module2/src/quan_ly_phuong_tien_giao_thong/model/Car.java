package quan_ly_phuong_tien_giao_thong.model;

import java.util.Scanner;

public class Car extends Vehicle{
    private int soChoNgoi;
    private String kieuXe;

    public Car() {
    }

    public Car(int soChoNgoi, String kieuXe) {
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public Car(String bienKiemSoat, Manufacturer tenHangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }
    @Override
    public void nhapVao(){
        Scanner scanner =new Scanner(System.in);
        super.nhapVao();
        System.out.println("Nhập số chỗ ngồi");
        this.soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe: ");
        this.kieuXe = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                "soChoNgoi=" + soChoNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
