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

----- th??m v??? tr??
insert into vi_tri(ten_vi_tri) values("Qu???n L??");
insert into vi_tri(ten_vi_tri) values("Nh??n Vi??n");
insert into vi_tri(ten_vi_tri) values("L??? T??n");
insert into vi_tri(ten_vi_tri) values("Gi??m S??t");
insert into vi_tri(ten_vi_tri) values("Gi??m ?????c");
----- th??m tr??nh ?????
insert into trinh_do(ten_trinh_do) values("Trung C???p");
insert into trinh_do(ten_trinh_do) values("Cao ?????ng");
insert into trinh_do(ten_trinh_do) values("?????i H???c");
insert into trinh_do(ten_trinh_do) values("Sau ?????i H???c");
----- th??m b??? ph???n 
insert into bo_phan(ten_bo_phan) values("Sale-Marketing");
insert into bo_phan(ten_bo_phan) values("H??nh Ch??nh");
insert into bo_phan(ten_bo_phan) values("Ph???c V???");
insert into bo_phan(ten_bo_phan) values("Qu???n L??");
insert into bo_phan(ten_bo_phan) values("Qu???n L??");
----- th??m nh??n vi??n
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("Nguy???n V??n An","1970-11-07","456231786",10000000,"0901234121","annguyen@gmail.com",
"295 Nguy???n T???t Th??nh,???? N???ng",1,3,1);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("L?? V??n B??nh","2000-09-01","654231234",10000000,"090999999","binhlv@gmail.com",
"22 Y??n B??i, ???? N???ng",1,2,2);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("nguy???n trung ","2000-09-01","12325ar12312",15000000,"090999999","thiyen@gmail.com",
"???? n???ng",1,3,2);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("V?? C??ng To???n","2000-09-01","12325ar12312",21000000,"95555555555",
"toan0404@gmail.com","K234/11 ??i???n Bi??n Ph???, Gia Lai",1,2,3);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("Nguy???n B???nh Ph??t","1995-09-11","312213123122",7000000,"888888888","phatphat@gmail.com",
"43 Y??n B??i, ???? N???ng",2,2,3);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("nguy???n trung","2000-11-08","166123123",5000000,"777777777","annghi20@gmail.com",
"111 H??ng V????ng, H?? N???i",3,4,3);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("nguy???n trung","1994-01-08","478686757575",11000000,"033333333","donghanguyen@gmail.com",
"???? n???ng",3,2,2);
insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,
email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
values("C??ng t???ng th??? t??n n??? t??? th??? nh?????c loan","1996-01-08","478687777575",15000000,"0678545635","donghanguyen@gmail.com",
"???? n???ng",5,2,2);

insert into loai_khach(ten_loai_khach) values("Diamond");
insert into loai_khach(ten_loai_khach) values("Platinium");
insert into loai_khach(ten_loai_khach) values("Gold");
insert into loai_khach(ten_loai_khach) values("Silver");
insert into loai_khach(ten_loai_khach) values("Member");

insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(4,"Nguy???n Th??? H??o","1970-11-07",0,"123123123123","09342592359","thihao07@gmail.com","23 Nguy???n Ho??ng, ???? N???ng");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(3,"Ph???m Xu??n Di???u","1992-08-08",1,"3236345423124","0993942921","xuandieu92@gmail.com","K77/22 Th??i Phi??n, Qu???ng Tr???");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(5,"Tr????ng ????nh Ngh???","1990-02-27",1,"56756838345","0966666669","nghenhan2702@gmail.com","K323/12 ??ng ??ch Khi??m, Vinh");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(1,"D????ng V??n Quan","1981-07-08",1,"123123123123","09342592359","tduongquan@gmail.com","K453/12 L?? L???i, ???? N???ng");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(2,"Ho??ng Tr???n Nhi Nhi","1995-12-09",0,"88888888888","0952342342","nhinhi123@gmail.com","224 L?? Th??i T???, Gia Lai");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(4,"T??n N??? M???c Ch??u","2005-12-06",0,"548346345434","09753473735","tonnuchau@gmail.com","37 Y??n Th???, ???? N???ng");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(5,"Nguy???n M??? Kim","1984-04-08",0,"67853224323i","088345341123","kimcuong84@gmail.com","K123/45 L?? L???i, H??? Ch?? Minh");
insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) 
values(3,"Tr???n ?????i Danh","1970-11-07",1,"457345234234","04574967065757","danhhai99@gmail.com","24 L?? Th?????ng Ki???t, Qu???ng Ng??i");

insert into kieu_thue(ten_kieu_thue) values("year");
insert into kieu_thue(ten_kieu_thue) values("month");
insert into kieu_thue(ten_kieu_thue) values("day");
insert into kieu_thue(ten_kieu_thue) values("hour");

insert into loai_dich_vu(ten_loai_dich_vu) values("Villa");
insert into loai_dich_vu(ten_loai_dich_vu) values("House");
insert into loai_dich_vu(ten_loai_dich_vu) values("Room");

insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) 
values("Karaoke",10000,"gi???","ti???n nghi, hi???n t???i");
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) 
values("Thu?? xe m??y",10000,"chi???c","h???ng 1 xe");
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) 
values("Thu?? xe ?????p",20000,"chi???c","t???t");
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) 
values("Buffet bu???i s??ng",15000,"su???t","?????y ????? ????? ??n, tr??ng mi???ng");
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) 
values("Buffet bu???i tr??a",90000,"su???t","?????y ????? ????? ??n, tr??ng mi???ng");
insert into dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai) 
values("Buffet bu???i t???i",160000,"su???t","?????y ????? ????? ??n, tr??ng mi???ng");

insert into dich_vu(ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,ma_kieu_thue,ma_loai_dich_vu,
tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang)
value("Villa Beach Front",25000,10000000,10,3,1,"vip","c?? h??? b??i",500,3);
insert into dich_vu(ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,ma_kieu_thue,ma_loai_dich_vu,
tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang)
value("House Princess 01",15000,5000000,6,4,2,"vip","C?? th??m b???p n?????ng",null,4);
insert into dich_vu(ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,ma_kieu_thue,ma_loai_dich_vu,
tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang)
value("Room Twin 01",6000,6000000,4,2,2,"normal","C?? tivi",null,null);
insert into dich_vu(ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,ma_kieu_thue,ma_loai_dich_vu,
tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang)
value("Villa No Beach Front",22000,4100000,3,4,1,"normal","c?? h??? b??i",300,3);
insert into dich_vu(ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,ma_kieu_thue,ma_loai_dich_vu,
tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang)
value("House Princess 02",10000,4000000,12,1,3,"normal","C?? th??m b???p n?????ng",null,2);


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

select * from khach_hang where dia_chi like "%???? n???ng" or dia_chi like "%Qu???ng Tr???" and year(curdate()) -year(ngay_sinh) >18 and year(curdate())-year(ngay_sinh) <50;
select * from khach_hang where dia_chi like "%???? n???ng" or dia_chi like "%Qu???ng Tr???" and year(current_date()) -year(ngay_sinh) >18 and year(current_date())-year(ngay_sinh) <50;




