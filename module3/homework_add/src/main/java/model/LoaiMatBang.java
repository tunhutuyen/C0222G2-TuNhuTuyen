package model;

public class LoaiMatBang {
    private int idLoaiMatBang;
    private String tenLoaiTrangThai;

    public LoaiMatBang() {
    }

    public LoaiMatBang(int idLoaiMatBang, String tenLoaiTrangThai) {
        this.idLoaiMatBang = idLoaiMatBang;
        this.tenLoaiTrangThai = tenLoaiTrangThai;
    }

    public int getIdLoaiMatBang() {
        return idLoaiMatBang;
    }

    public void setIdLoaiMatBang(int idLoaiMatBang) {
        this.idLoaiMatBang = idLoaiMatBang;
    }

    public String getTenLoaiTrangThai() {
        return tenLoaiTrangThai;
    }

    public void setTenLoaiTrangThai(String tenLoaiTrangThai) {
        this.tenLoaiTrangThai = tenLoaiTrangThai;
    }
}
