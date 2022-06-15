package model;

public class MatBangDTO {
    private String idMatBang;
    private double dienTich;
    private double giaCa;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String tenLoaiMatBang;
    private String tenTrangThai;
    private int tang;

    public MatBangDTO() {
    }

    public MatBangDTO(String idMatBang, double dienTich, double giaCa, String ngayBatDau, String ngayKetThuc, String tenLoaiMatBang, String tenTrangThai, int tang) {
        this.idMatBang = idMatBang;
        this.dienTich = dienTich;
        this.giaCa = giaCa;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.tenLoaiMatBang = tenLoaiMatBang;
        this.tenTrangThai = tenTrangThai;
        this.tang = tang;
    }

    public String getIdMatBang() {
        return idMatBang;
    }

    public void setIdMatBang(String idMatBang) {
        this.idMatBang = idMatBang;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public double getGiaCa() {
        return giaCa;
    }

    public void setGiaCa(double giaCa) {
        this.giaCa = giaCa;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getTenLoaiMatBang() {
        return tenLoaiMatBang;
    }

    public void setTenLoaiMatBang(String tenLoaiMatBang) {
        this.tenLoaiMatBang = tenLoaiMatBang;
    }

    public String getTenTrangThai() {
        return tenTrangThai;
    }

    public void setTenTrangThai(String tenTrangThai) {
        this.tenTrangThai = tenTrangThai;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }
}
