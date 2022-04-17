package quan_ly_phuong_tien_giao_thong.model;

public class Manufacturer {
    private String maHangSanXuat;
    private String hangSanXuat;
    private String quocGia;

    public Manufacturer() {
    }

    public Manufacturer(String maHangSanXuat, String hangSanXuat, String quocGia) {
        this.maHangSanXuat = maHangSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.quocGia = quocGia;
    }

    public String getMaHangSanXuat() {
        return maHangSanXuat;
    }

    public void setMaHangSanXuat(String maHangSanXuat) {
        this.maHangSanXuat = maHangSanXuat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "maHangSanXuat='" + maHangSanXuat + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }
}
