package model;

import java.sql.Struct;

public class MatBang {
    private String idMatBang;
    private double dienTich;
    private double giaCa;
    private String ngayBatDau;
    private String ngayKetThuc;
    private int idLoaiMatBang;
    private int idTrangThai;
    private int tang;
    private int status;

    public MatBang() {
    }

    public MatBang(String idMatBang, double dienTich, double giaCa, String ngayBatDau, String ngayKetThuc, int idLoaiMatBang, int idTrangThai, int tang) {
        this.idMatBang = idMatBang;
        this.dienTich = dienTich;
        this.giaCa = giaCa;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.idLoaiMatBang = idLoaiMatBang;
        this.idTrangThai = idTrangThai;
        this.tang = tang;
    }

    public MatBang(String idMatBang, double dienTich, double giaCa, String ngayBatDau, String ngayKetThuc, int idLoaiMatBang, int idTrangThai, int tang, int status) {
        this.idMatBang = idMatBang;
        this.dienTich = dienTich;
        this.giaCa = giaCa;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.idLoaiMatBang = idLoaiMatBang;
        this.idTrangThai = idTrangThai;
        this.tang = tang;
        this.status = status;
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

    public int getIdLoaiMatBang() {
        return idLoaiMatBang;
    }

    public void setIdLoaiMatBang(int idLoaiMatBang) {
        this.idLoaiMatBang = idLoaiMatBang;
    }

    public int getIdTrangThai() {
        return idTrangThai;
    }

    public void setIdTrangThai(int idTrangThai) {
        this.idTrangThai = idTrangThai;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
