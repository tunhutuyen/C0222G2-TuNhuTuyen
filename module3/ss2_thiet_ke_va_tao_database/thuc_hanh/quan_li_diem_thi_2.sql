CREATE DATABASE _quan_ly_diem_thi;
use _quan_ly_diem_thi;

CREATE TABLE hoc_sinh(
    ma_hoc_sinh VARCHAR(20) PRIMARY KEY,
    ten_hoc_sinh VARCHAR(50) not null,
    ngay_sinh DATETIME not null,
    lop VARCHAR(20) not null,
    GT VARCHAR(20)
);

CREATE TABLE mon_hoc(
    ma_mon_hoc VARCHAR(20) PRIMARY KEY,
    ten_mon_hoc VARCHAR(50)
);
CREATE TABLE bang_diem(
	ma_hoc_sinh VARCHAR(20),
    ma_mon_hoc VARCHAR(20),
    diem_thi INT,
    ngay_kiem_tra DATETIME,
    PRIMARY KEY (ma_hoc_sinh, ma_mon_hoc),
    FOREIGN KEY (ma_hoc_sinh) REFERENCES hoc_sinh(ma_hoc_sinh),
    FOREIGN KEY (ma_mon_hoc) REFERENCES mon_hoc(ma_mon_hoc)
);
CREATE TABLE giao_vien(
    ma_giao_vien VARCHAR(20) PRIMARY KEY,
    ten_giao_vien VARCHAR(20),
    so_dien_thoai VARCHAR(10)
);

ALTER TABLE mon_hoc ADD ma_giao_vien VARCHAR(20);
ALTER TABLE mon_hoc ADD CONSTRAINT FK_ma_giao_vien FOREIGN KEY (ma_giao_vien) REFERENCES giao_vien(ma_giao_vien);

CREATE DATABASE QuanLyDiemThi;
USE QuanLyDiemThi;
CREATE TABLE HocSinh(
    MaHS VARCHAR(20) PRIMARY KEY,
    TenHS VARCHAR(50),
    NgaySinh DATETIME,
    Lop VARCHAR(20),
    GT VARCHAR(20)
);
CREATE TABLE MonHoc(
    MaMH VARCHAR(20) PRIMARY KEY,
    TenMH VARCHAR(50)
);
CREATE TABLE BangDiem(
    MaHS VARCHAR(20),
    MaMH VARCHAR(20),
    DiemThi INT,
    NgayKT DATETIME,
    PRIMARY KEY (MaHS, MaMH),
    FOREIGN KEY (MaHS) REFERENCES HocSinh(MaHS),
    FOREIGN KEY (MaMH) REFERENCES MonHoc(MaMH)
);
CREATE TABLE GiaoVien(
    MaGV VARCHAR(20) PRIMARY KEY,
    TenGV VARCHAR(20),
    SDT VARCHAR(10)
);
ALTER TABLE MonHoc ADD MaGV VARCHAR(20);
ALTER TABLE MonHoc ADD CONSTRAINT FK_MaGV FOREIGN KEY (MaGV) REFERENCES GiaoVien(MaGV);