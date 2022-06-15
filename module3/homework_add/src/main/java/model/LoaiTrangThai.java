package model;

public class LoaiTrangThai {
    private int idLoaiTrangThai;
    private String tenLoaiTrangThai;

    public LoaiTrangThai() {
    }

    public LoaiTrangThai(int idLoaiTrangThai, String tenLoaiTrangThai) {
        this.idLoaiTrangThai = idLoaiTrangThai;
        this.tenLoaiTrangThai = tenLoaiTrangThai;
    }

    public int getIdLoaiTrangThai() {
        return idLoaiTrangThai;
    }

    public void setIdLoaiTrangThai(int idLoaiTrangThai) {
        this.idLoaiTrangThai = idLoaiTrangThai;
    }

    public String getTenLoaiTrangThai() {
        return tenLoaiTrangThai;
    }

    public void setTenLoaiTrangThai(String tenLoaiTrangThai) {
        this.tenLoaiTrangThai = tenLoaiTrangThai;
    }
}
