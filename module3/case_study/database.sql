drop database data_furama;
create database if not exists data_furama;
use data_furama;

create table vi_tri(
ma_vi_tri int primary key auto_increment,
ten_vi_tri varchar(50) );

create table trinh_do(
ma_trinh_do int primary key auto_increment,
ten_trinh_do varchar(50));

create table bo_phan(
ma_bo_phan int primary key auto_increment,
ten_bo_phan varchar(50));

create table nhan_vien(
ma_nhan_vien INT primary key auto_increment,
ho_ten varchar(50) NOT NULL,
ngay_sinh date NOT NULL,
so_cmnd varchar(50) NOT NULL,
luong double NOT NULL,
so_dien_thoai varchar(50) NOT NULL,
email varchar(50),
dia_chi varchar(50),
ma_vi_tri int NOT NULL,
ma_trinh_do int NOT NULL,
ma_bo_phan int NOT NULL,
foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
foreign key(ma_bo_phan) references bo_phan(ma_bo_phan),
foreign key(ma_vi_tri) references vi_tri(ma_vi_tri));

create table kieu_thue(
ma_kieu_thue int primary key auto_increment,
ten_kieu_thue varchar(50));

create table loai_dich_vu(
ma_loai_dich_vu int primary key auto_increment,
ten_loai_dich_vu varchar(50));

create table dich_vu(
ma_dich_vu int primary key auto_increment,
ten_dich_vu varchar(50) NOT NULL,
dien_tich int,
chi_phi_thue double NOT NULL,
so_nguoi_toi_da int,
ma_kieu_thue int NOT NULL,
ma_loai_dich_vu int NOT NULL,
tieu_chuan_phong varchar(50) ,
mo_ta_tien_nghi_khac varchar(50),
dien_tich_ho_boi double,
so_tang int,
foreign key(ma_kieu_thue) references kieu_thue(ma_kieu_thue),
foreign key(ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu));

create table loai_khach(
ma_loai_khach int primary key auto_increment,
ten_loai_khach varchar(50));

create table khach_hang(
ma_khach_hang int primary key auto_increment,
ma_loai_khach int NOT NULL,
ho_ten varchar(50) NOT NULL,
ngay_sinh date NOT NULL,
gioi_tinh bit(1) NOT NULL,
so_cmnd varchar(50) NOT NULL,
so_dien_thoai varchar(50) NOT NULL,
email varchar(50),
dia_chi varchar(50),
foreign key(ma_loai_khach) references loai_khach(ma_loai_khach));

create table hop_dong(
ma_hop_dong int primary key auto_increment,
ngay_lam_hop_dong datetime NOT NULL,
ngay_ket_thuc datetime NOT NULL,
tien_dat_coc double NOT NULL,
ma_nhan_vien int NOT NULL,
ma_khach_hang int NOT NULL,
ma_dich_vu int NOT NULL,
foreign key(ma_nhan_vien) references nhan_vien(ma_nhan_vien),
foreign key(ma_khach_hang) references khach_hang(ma_khach_hang),
foreign key(ma_dich_vu) references dich_vu(ma_dich_vu));

create table dich_vu_di_kem(
ma_dich_vu_di_kem int primary key auto_increment,
ten_dich_vu_di_kem varchar(50) NOT NULL,
gia double NOT NULL,
don_vi varchar(10) NOT NULL,
trang_thai varchar(50));

create table hop_dong_chi_tiet(
ma_hop_dong_chi_tiet int primary key auto_increment,
ma_hop_dong int NOT NULL,
ma_dich_vu_di_kem int NOT NULL,
so_luong int NOT NULL,
foreign key(ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem),
foreign key(ma_hop_dong) references hop_dong(ma_hop_dong));

----- thêm vị trí
insert into vi_tri(ten_vi_tri) values("Quản Lý");
insert into vi_tri(ten_vi_tri) values("Nhân Viên");
insert into vi_tri(ten_vi_tri) values("Lễ Tân");
insert into vi_tri(ten_vi_tri) values("Giám Sát");
insert into vi_tri(ten_vi_tri) values("Giám Đốc");
----- thêm trình độ
insert into trinh_do(ten_trinh_do) values("Trung Cấp");
insert into trinh_do(ten_trinh_do) values("Cao Đẳng");
insert into trinh_do(ten_trinh_do) values("Đại Học");
insert into trinh_do(ten_trinh_do) values("Sau Đại Học");
----- thêm bộ phận 
insert into bo_phan(ten_bo_phan) values("Sale-Marketing");
insert into bo_phan(ten_bo_phan) values("Hành Chính");
insert into bo_phan(ten_bo_phan) values("Phục Vụ");
insert into bo_phan(ten_bo_phan) values("Quản Lí");
insert into bo_phan(ten_bo_phan) values("Quản Lí");
----- thêm nhân viên
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("Nguyễn Văn An","1970-11-07","456231786",10000000,"0901234121","annguyen@gmail.com",
"295 Nguyễn Tất Thành,Đà Nẵng",1,3,1);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("Lê Văn Bình","2000-09-01","654231234",10000000,"090999999","binhlv@gmail.com",
"22 Yên Bái, Đà Nẵng",1,2,2);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("nguyễn trung ","2000-09-01","12325ar12312",15000000,"090999999","thiyen@gmail.com",
"đà nẵng",1,3,2);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("Võ Công Toản","2000-09-01","12325ar12312",21000000,"95555555555",
"toan0404@gmail.com","K234/11 Điện Biên Phủ, Gia Lai",1,2,3);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("Nguyễn Bỉnh Phát","1995-09-11","312213123122",7000000,"888888888","phatphat@gmail.com",
"43 Yên Bái, Đà Nẵng",2,2,3);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("nguyễn trung","2000-11-08","166123123",5000000,"777777777","annghi20@gmail.com",
"111 Hùng Vương, Hà Nội",3,4,3);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("nguyễn trung","1994-01-08","478686757575",11000000,"033333333","donghanguyen@gmail.com",
"đà nẵng",3,2,2);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("Công tằng thị tôn nữ tạ thị nhược loan","1996-01-08","478687777575",15000000,"0678545635","donghanguyen@gmail.com",
"đà nẵng",5,2,2);

insert into loai_khach(ten_loai_khach) values("Diamond");
insert into loai_khach(ten_loai_khach) values("Platinium");
insert into loai_khach(ten_loai_khach) values("Gold");
insert into loai_khach(ten_loai_khach) values("Silver");
insert into loai_khach(ten_loai_khach) values("Member");

insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(4,"Nguyễn Thị Hào","1970-11-07",0,"123123123123","09342592359","thihao07@gmail.com","23 Nguyễn Hoàng, Đà Nẵng");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(3,"Phạm Xuân Diệu","1992-08-08",1,"3236345423124","0993942921","xuandieu92@gmail.com","K77/22 Thái Phiên, Quảng Trị");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(5,"Trương Đình Nghệ","1990-02-27",1,"56756838345","0966666669","nghenhan2702@gmail.com","K323/12 Ông Ích Khiêm, Vinh");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(1,"Dương Văn Quan","1981-07-08",1,"123123123123","09342592359","tduongquan@gmail.com","K453/12 Lê Lợi, Đà Nẵng");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(2,"Hoàng Trần Nhi Nhi","1995-12-09",0,"88888888888","0952342342","nhinhi123@gmail.com","224 Lý Thái Tổ, Gia Lai");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(4,"Tôn Nữ Mộc Châu","2005-12-06",0,"548346345434","09753473735","tonnuchau@gmail.com","37 Yên Thế, Đà Nẵng");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(5,"Nguyễn Mỹ Kim","1984-04-08",0,"67853224323i","088345341123","kimcuong84@gmail.com","K123/45 Lê Lợi, Hồ Chí Minh");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(3,"Trần Đại Danh","1970-11-07",1,"457345234234","04574967065757","danhhai99@gmail.com","24 Lý Thường Kiệt, Quảng Ngãi");

insert into kieu_thue(ten_kieu_thue) values("year");
insert into kieu_thue(ten_kieu_thue) values("month");
insert into kieu_thue(ten_kieu_thue) values("day");
insert into kieu_thue(ten_kieu_thue) values("hour");

insert into loai_dich_vu(ten_loai_dich_vu) values("Villa");
insert into loai_dich_vu(ten_loai_dich_vu) values("House");
insert into loai_dich_vu(ten_loai_dich_vu) values("Room");

insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) 
values("Karaoke",10000,"giờ","tiện nghi, hiện tại");
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) 
values("Thuê xe máy",10000,"chiếc","hỏng 1 xe");
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) 
values("Thuê xe đạp",20000,"chiếc","tốt");
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) 
values("Buffet buổi sáng",15000,"suất","đầy đủ đồ ăn, tráng miệng");
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) 
values("Buffet buổi trưa",90000,"suất","đầy đủ đồ ăn, tráng miệng");
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) 
values("Buffet buổi tối",160000,"suất","đầy đủ đồ ăn, tráng miệng");

insert into dich_vu(ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,ma_kieu_thue,ma_loai_dich_vu,
tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang)
value("Villa Beach Front",25000,10000000,10,3,1,"vip","có hồ bơi",500,3);
insert into dich_vu(ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,ma_kieu_thue,ma_loai_dich_vu,
tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang)
value("House Princess 01",15000,5000000,6,4,2,"vip","Có thêm bếp nướng",null,4);
insert into dich_vu(ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,ma_kieu_thue,ma_loai_dich_vu,
tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang)
value("Room Twin 01",6000,6000000,4,2,2,"normal","Có tivi",null,null);
insert into dich_vu(ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,ma_kieu_thue,ma_loai_dich_vu,
tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang)
value("Villa No Beach Front",22000,4100000,3,4,1,"normal","có hồ bơi",300,3);
insert into dich_vu(ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,ma_kieu_thue,ma_loai_dich_vu,
tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang)
value("House Princess 02",10000,4000000,12,1,3,"normal","Có thêm bếp nướng",null,2);


insert into hop_dong(ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) 
values("2020-12-08","2021-12-08",0,3,1,3);
insert into hop_dong(ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) 
values("2020-07-14","2020-07-21",2000000,7,3,3);
insert into hop_dong(ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) 
values("2021-03-15","2021-03-17",500000,3,4,2);
insert into hop_dong(ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) 
values("2021-01-14","2021-01-18",1000000,7,5,5);
insert into hop_dong(ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) 
values("2021-07-14","2021-07-15",500000,7,2,2);
insert into hop_dong(ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) 
values("2021-06-01","2021-06-03",100000,7,7,2);
insert into hop_dong(ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) 
values("2021-09-02","2021-09-05",1000000,7,4,4);
insert into hop_dong(ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) 
values("2021-06-17","2021-06-18",1500000,3,4,1);
insert into hop_dong(ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) 
values("2020-11-19","2020-11-19",800000,3,4,3);
insert into hop_dong(ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) 
values("2021-04-12","2021-04-14",100000,6,3,5);

insert into hop_dong_chi_tiet(ma_hop_dong,ma_dich_vu_di_kem,so_luong)
 values(5,2,4);
 insert into hop_dong_chi_tiet(ma_hop_dong,ma_dich_vu_di_kem,so_luong)
 values(6,1,11);
 insert into hop_dong_chi_tiet(ma_hop_dong,ma_dich_vu_di_kem,so_luong)
 values(2,4,15);
 insert into hop_dong_chi_tiet(ma_hop_dong,ma_dich_vu_di_kem,so_luong)
 values(3,5,10);
 insert into hop_dong_chi_tiet(ma_hop_dong,ma_dich_vu_di_kem,so_luong)
 values(8,2,4);
 insert into hop_dong_chi_tiet(ma_hop_dong,ma_dich_vu_di_kem,so_luong)
 values(7,4,1);
 insert into hop_dong_chi_tiet(ma_hop_dong,ma_dich_vu_di_kem,so_luong)
 values(5,2,1);

select * from nhan_vien where ho_ten like "N%" or ho_ten like "H%" or ho_ten like "c%" and length(ho_ten) <15;

select * from khach_hang where dia_chi like "%đà nẵng" or dia_chi like "%Quảng Trị" and year(curdate()) -year(ngay_sinh) >18 and year(curdate())-year(ngay_sinh) <50;
select * from khach_hang where dia_chi like "%đà nẵng" or dia_chi like "%Quảng Trị" and year(current_date()) -year(ngay_sinh) >18 and year(current_date())-year(ngay_sinh) <50;




