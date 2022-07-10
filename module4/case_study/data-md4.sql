use data_furama_md4;
insert into rent_type value
(1,'year'),
(2,'month'),
(3,'day'),
(4,'hour');
insert into facility_type value
(1,'villa'),
(2,'house'),
(3,'room');
insert into facility value
(1,100,1000,"Có hồ bơi","buffe sáng",10,"Villa Beach Front",2,100,"vip",1,1),
(2,1111,1111,"1","1",11,"vinpearland hoi an",1,1,"1",2,2),
(3,100,2000,"Có thêm bếp nướng","cafe sáng",10,"Villa Beach Front",0,100,"vip",3,2),
(4,50,3000,"Có hồ bơi","buffe trưa",10,"Room Beach Front",2,100,"vip",3,3),
(5,50,4500,"Có thêm bếp nướng","buffe sáng",10,"Room Twin 01",0,100,"vip",3,3),
(6,200,5000,"Có thêm bếp nướng","bữa sáng",10,"Villa Twin 01",0,100,"vip",2,1),
(7,150,6000,"Có hồ bơi","bufe trưa",10,"Villa Beach Front",2,100,"vip",2,1),
(8,320,7500,"Có tivi","buffe tối",10,"Hours Beach Front",2,100,"vip",1,2),
(9,300,2300,"Có thêm bếp nướng","bữa sáng",10,"Room Beach Front",2,100,"vip",2,3),
(10,100,8100,"Có hồ bơi","cafe sáng",10,"Villa Beach Front",2,100,"vip",1,1);

insert into customer_type(name_customer_type) values("Diamond");
insert into customer_type(name_customer_type) values("Platinium");
insert into customer_type(name_customer_type) values("Gold");
insert into customer_type(name_customer_type) values("Silver");
insert into customer_tyemployeepe(name_customer_type) values("Member");

insert into customer(name_customer,date_of_birth,gender,id_card,phone_number,email,address,id_customer_type) values
('Nguyễn Thị Hào','1970-11-07',b'0','643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng',5),
('Phạm Xuân Diệu','1992-08-08',b'1','865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị',3),
('Trương Đình Nghệ','1990-02-27',b'1','488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh',1),
('Dương Văn Quan','1981-07-08',b'1','543432111','0490039241','duongquan@gmail.com','K453/12 Lê Lợi, Đà Nẵng',1),
('Hoàng Trần Nhi Nhi','1995-12-09',b'0','795453345','0312345678','nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai',4),
('Tôn Nữ Mộc Châu','2005-12-06',b'0','732434215','0988888844','tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng',4),
('Nguyễn Mỹ Kim','1984-04-08',b'0','856453123','0912345698','kimcuong84@gmail.com','K123/45 Lê Lợi, Hồ Chí Minh',1),
('Nguyễn Thị Hào','1999-04-08',b'0','965656433','0763212345','haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum',3),
('Trần Đại Danh','1994-07-01',b'1','432341235','0643343433','danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi',1),
('Nguyễn Tâm Đắc','1989-07-01',b'1','344343432','0987654321','dactam@gmail.com','22 Ngô Quyền, Đà Nẵng',2);

insert into position values(1,"Quản Lý");
insert into position values(2,"Nhân Viên");
 insert into position values(3,"Lễ Tân"); 
 insert into position values(4,"Giám Sát");
 insert into position values(5,"Giám Đốc");
----- thêm trình độ
insert into education_degree values(1,"Trung Cấp");
insert into education_degree values(2,"Cao Đẳng");
insert into education_degree values(3,"Đại Học");
insert into education_degree values(4,"Sau Đại Học");
----- thêm bộ phận 
insert into division values(1,"Sale-Marketing");
insert into division values(2,"Hành Chính");
insert into division values(3,"Phục Vụ");
insert into division values(4,"Quản Lí");

insert into `user` values("a","123"),("b","123"),("c","123"),("d","123"),("e","123"),("f","123"),("g","123"),("h","123"),("i","123"),("k","123"); 
----- thêm nhân viên
insert into employee(name_employee,date_of_birth_employee,id_card_employee,salary_employee,phone_number_employee,
email_employee,address_employee,id_position,id_education_degree,id_division,user_user_name)
values('Nguyễn Văn An','1970-11-07','456231786',10000000,'0901234121','annguyen@gmail.com','295 Nguyễn Tất Thành, Đà Nẵng',1,3,1,"a"),
('Lê Văn Bình','1997-04-09','654231234',7000000,'0934212314','binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2,"b"),
('Hồ Thị Yến','1995-12-12','999231723',14000000,'0412352315','thiyen@gmail.com','K234/11 Điện Biên Phủ, Gia Lai',1,3,2,"c"),
('Võ Công Toản','1980-04-04','123231365',17000000,'0374443232','toan0404@gmail.com','77 Hoàng Diệu, Quảng Trị',1,4,4,"d"),
('Nguyễn Bỉnh Phát','1999-12-09','454363232',6000000,'0902341231','phatphat@gmail.com','43 Yên Bái, Đà Nẵng',2,1,1,"e"),
('Khúc Nguyễn An Nghi','2000-11-08','964542311',7000000,'0978653213','annghi20@gmail.com','294 Nguyễn Tất Thành, Đà Nẵng',2,2,3,"f"),
('Nguyễn Hữu Hà','1993-01-01','534323231',8000000,'0941234553','nhh0101@gmail.com','4 Nguyễn Chí Thanh, Huế',2,3,2,"g"),
('Nguyễn Hà Đông','1989-09-03','234414123',9000000,'0642123111','donghanguyen@gmail.com','111 Hùng Vương, Hà Nội',2,4,4,"h"),
('Tòng Hoang','1982-09-03','256781231',6000000,'0245144444','hoangtong@gmail.com','213 Hàm Nghi, Đà Nẵng',2,4,4,"i"),
('Nguyễn Công Đạo','1994-01-08','755434343',8000000,'0988767111','nguyencongdao12@gmail.com','6 Hoà Khánh, Đồng Nai',2,3,2,"k");

-- insert into contract (ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu) 
insert into contract(start_date,end_date,deposit,id_employee,id_customer,id_facility) values('2020-12-08','2020-12-08',0,13,1,3),
('2020-07-14','2020-07-21',200000,17,3,1),
('2021-03-15','2021-03-17',50000,13,4,4),
('2021-01-14','2021-01-18',100000,17,5,6),
('2021-07-14','2021-07-15',0,17,2,7),
('2021-06-01','2021-06-03',0,17,7,8),
('2021-09-02','2021-09-05',100000,17,4,4),
('2021-06-17','2021-06-18',150000,13,4,1),
('2020-11-19','2020-11-19',0,13,4,3),
('2021-04-12','2021-04-14',0,20,3,7),
('2021-04-25','2021-04-25',0,12,2,1),
('2021-05-25','2021-05-27',0,17,10,1);

insert into attach_facility(name_attach_facility,cost,unit,status_attach_facility) 
values("Karaoke",10000,"giờ","tiện nghi, hiện tại"),("Thuê xe máy",10000,"chiếc","hỏng 1 xe"),
("Thuê xe đạp",20000,"chiếc","tốt"),("Buffet buổi sáng",15000,"suất","đầy đủ đồ ăn, tráng miệng"),
("Buffet buổi trưa",90000,"suất","đầy đủ đồ ăn, tráng miệng"),("Buffet buổi tối",16000,"suất","đầy đủ đồ ăn, tráng miệng");

insert into contract_detail(quantity,id_contract,id_attach_facility)
 values(5,13,4),(8,15,5),(15,17,6),(1,13,1),(11,14,2),(1,21,3),(2,20,2),(2,17,2);







