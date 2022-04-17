package quan_ly_phuong_tien_giao_thong.model;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Vehicle {
    private String bienKiemSoat;
    private Manufacturer tenHangSanXuat;
    private int namSanXuat;
    private String chuSoHuu;

    public Vehicle() {
    }

    public Vehicle(String bienKiemSoat, Manufacturer tenHangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public Manufacturer getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(Manufacturer tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }
    public void nhapVao(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập biển kiểm soát: ");
        this.bienKiemSoat = scanner.nextLine();
        this.tenHangSanXuat = chonHangSanXuat();
        System.out.print("\n Nhập năm sản xuất: ");
        this.namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vào chủ sở hữu: ");
        this.chuSoHuu = scanner.nextLine();
    }
    public Manufacturer chonHangSanXuat(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Manufacturer> danhSachHangSanXuat = new ArrayList<>();
        danhSachHangSanXuat.add(new Manufacturer("M1","toyota","japan"));
        danhSachHangSanXuat.add(new Manufacturer("M2","innova","korea"));
        danhSachHangSanXuat.add(new Manufacturer("M3","vinfast","vietnamese"));
        System.out.println("chọn hãng sản xuất: \n");
        do {
            for (int i = 0; i < danhSachHangSanXuat.size(); i++) {
                System.out.println((i+1)+" : "+danhSachHangSanXuat.get(i).getHangSanXuat());
            }
            System.out.println("nhập lựa chọn: ");
            int luaChon = Integer.parseInt(scanner.nextLine());
            if ((luaChon >0 && luaChon<danhSachHangSanXuat.size())){
                return danhSachHangSanXuat.get(luaChon -1);
            }else {
                System.out.println("Chọn lại");
            }
        }while (true);
    }
    @Override
    public String toString() {
        return "bks='" + bienKiemSoat + '\'' +
                ", hangSX'=" + tenHangSanXuat + '\'' +
                ", namSX=" + namSanXuat +
                ", chuSoHuu='" + chuSoHuu + '\''+",";
    }
}
