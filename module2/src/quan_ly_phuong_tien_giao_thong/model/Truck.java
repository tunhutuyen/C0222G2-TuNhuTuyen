package quan_ly_phuong_tien_giao_thong.model;

import java.util.Scanner;

public class Truck extends Vehicle{
    private double trongTai;

    public Truck() {
    }

    public Truck(String bienKiemSoat, Manufacturer tenHangSanXuat, int namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public void nhapVao() {
        super.nhapVao();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập trọng tải: ");
        this.trongTai = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString() +
                "trongTai=" + trongTai +
                '}';
    }
}
