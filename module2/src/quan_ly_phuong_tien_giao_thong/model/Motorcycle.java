package quan_ly_phuong_tien_giao_thong.model;

import java.util.Scanner;

public class Motorcycle extends Vehicle{
    private int congSuat;

    public Motorcycle() {
    }

    public Motorcycle(String bienKiemSoat, Manufacturer tenHangSanXuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void nhapVao() {
        super.nhapVao();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào công suất: ");
        this.congSuat = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                 super.toString() +
                "congSuat=" + congSuat +
                '}';
    }
}
