use coffee_store;

-- insert into position values(1,'Quản Lý'),(2,'Phục Vụ'),(3,'Bảo Vệ'),(4,'Thu Ngân');

-- insert into app_user values(1,'1990-01-01',0,'sadasdsadasda','admin'),
-- (2,'1990-01-01',0,'sadasdsadasda','user1'),
-- (3,'1990-01-01',0,'sadasdsadasda','uemployeeser2'),
-- (4,'1990-01-01',0,'sadasdsadasda','user3'),
-- (5,'1990-01-01',0,'sadasdsadasda','user4'),
-- (6,'1990-01-01',0,'sadasdsadasda','user5'),
-- (7,'1990-01-01',0,'sadasdsadasda','user6');


-- insert into employee values
-- (1, 'Đà Nẵng', '1990-01-01', 'abc@gmail.com',1,'aaaaaaa', 0, 'Tuyến', '0935933888', 1500000, 1,1,1),
-- (2, 'Đà Nẵng 1', '1990-01-01', 'abc1@gmail.com',1,'aaaaaaa', 0, 'Tuyến 1', '0935912341', 1500000, 1,2,1),
-- (3, 'Đà Nẵng 2', '1990-01-01', 'abc2@gmail.com',0,'aaaaaaa', 0, 'Tuyến 2', '0935943678', 1500000, 2,2,1),
-- (4, 'Đà Nẵng 3', '1990-01-01', 'abc3@gmail.com',0,'aaaaaaa', 0, 'Tuyến 3', '0935980756', 1500000, 3,2,0),
-- (5, 'Đà Nẵng 4', '1990-01-01', 'abc4@gmail.com',1,'aaaaaaa', 0, 'Tuyến 4', '0935835435', 1500000, 4,1,1),
-- (6, 'Đà Nẵng 5', '1990-01-01', 'abc5@gmail.com',0,'aaaaaaa', 0, 'Tuyến 5', '0935980462', 1500000, 5,3,0),
-- (7, 'Đà Nẵng 6', '1990-01-01', 'abc6@gmail.com',1,'aaaaaaa', 0, 'Tuyến 6', '0935658679', 1500000, 6,4,1);

INSERT INTO app_role (role_name) VALUES ('ROLE_ADMIN');
INSERT INTO app_role (role_name) VALUES ('ROLE_STAFF');
INSERT INTO app_role (role_name) VALUES ('ROLE_USER');

INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'admin', '2022-08-08');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'user', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff1', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff2', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff3', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff4', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff5', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff6', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff7', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff8', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff9', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff10', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff11', '2022-08-09');
INSERT INTO app_user (password, user_name, creation_date) VALUES ('$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu', 'staff12', '2022-08-09');


INSERT INTO user_role (role_id, user_id) VALUES ('1', '1');
INSERT INTO user_role (role_id, user_id) VALUES ('2', '1');
INSERT INTO user_role (role_id, user_id) VALUES ('3', '1');
INSERT INTO user_role (role_id, user_id) VALUES ('2', '2');
INSERT INTO user_role (role_id, user_id) VALUES ('3', '2');
INSERT INTO user_role (role_id, user_id) VALUES ('3', '3');

insert into coffee_table value
(1,"A-01",1,1,1),
(2,"A-02",1,1,1),
(3,"A-03",0,1,1),
(4,"A-04",0,1,1);
insert into coffee_table value
(5,"A-05",0,1,1),
(6,"A-06",0,1,1),
(7,"A-07",0,1,1),
(8,"A-08",0,1,1);
insert into dish_type value
(1,"DT-01",1,"Cà phê"),
(2,"DT-02",1,"Sữa"),
(3,"DT-03",1,"Trà");

insert into bill value
(1,"123","2022-02-03",0),
(2,"1231","2022-02-03",0),
(3,"12351","2022-02-03",0);

insert into dish value
(1,"D-01","2022-02-03","abc",1,"Cà phê đen",15000,1),
(2,"D-21","2022-02-03","abc",1,"Trà sữa",15000,2),
(3,"D-31","2022-02-03","abc",1,"Sữa tươi",15000,2),
(4,"D-41","2022-02-03","abc",1,"Trà chanh",15000,3);

insert into position values
(1,'Quản Lý'),(2,'Phục Vụ'),(3,'Bảo Vệ'),(4,'Thu Ngân');

-- insert into app_user values(1,'1990-01-01',0,'sadasdsadasda','admin'),
-- (2,'1990-01-01',0,'sadasdsadasda','user1'),
-- (3,'1990-01-01',0,'sadasdsadasda','user2'),
-- (4,'1990-01-01',0,'sadasdsadasda','user3'),
-- (5,'1990-01-01',0,'sadasdsadasda','user4'),
-- (6,'1990-01-01',0,'sadasdsadasda','user5'),
-- (7,'1990-01-01',0,'sadasdsadasda','user6');
-- insert into app_user values(8,'1990-01-01',0,'sadasdsadasda','user7'),
-- (9,'1990-01-01',0,'sadasdsadasda','user8'),
-- (10,'1990-01-01',0,'sadasdsadasda','user9'),
-- (11,'1990-01-01',0,'sadasdsadasda','user10'),
-- (12,'1990-01-01',0,'sadasdsadasda','user11'),
-- (13,'1990-01-01',0,'sadasdsadasda','user12'),
-- (14,'1990-01-01',0,'sadasdsadasda','user13');


 insert into employee values
(1, '27-28, ngõ 294 Vạn Phúc, Kim Mã, Hà Nội', '1990-01-01', 'anhchangcan@gmail.com',1,'https://toigingiuvedep.vn/mau-anh-the-dep/', 0, 'Từ Như Tuyến', '0935933888', 15000000,1,1),
(2, '63 – 65 Nguyễn Kiệm, F.3, Q. Gò Vấp, Tp.HCM', '1999-11-21', 'cuocsongso@gmail.com',1,'https://firebasestorage.googleapis.com/v0/b/c0222g2-4cf09.appspot.com/o/16-08-2022-02%3A11%3A23ph%C3%BAc%20t%E1%BB%95ng.jpg?alt=media&token=5b885f19-cdc1-4451-adae-43dbf78d5c28', 0, 'Nguyễn Trung Thực', '0935912341', 7500000, 2,2),
(3, ' 237/6 Đỗ Ngọc Thạnh, F.6, Q.11, Tp.HCM', '1993-02-01', 'timdau@gmail.com',1,'https://firebasestorage.googleapis.com/v0/b/c0222g2-4cf09.appspot.com/o/16-08-2022-02%3A15%3A43Ph%C6%B0%C6%A1ng.jpg?alt=media&token=181900a4-f951-4526-beb6-50f61095abde', 0, 'Phạm Lê Long', '0935943678', 7500000, 3,2),
(4, ' 500 Nguyễn Thị Thập, Kp1, F. Tân Quy, Q.7, Tp.HCM', '2000-01-01', 'ngaynanglen@gmail.com',1,'https://firebasestorage.googleapis.com/v0/b/c0222g2-4cf09.appspot.com/o/16-08-2022-02%3A59%3A04B%C3%ACnh%20gold.jpg?alt=media&token=767b705f-dc8e-43e7-8de5-afd6179601ae', 0, 'Nguyễn Trung Kiên', '0935980756', 7500000, 4,2),
(5, '56-58 Nguyễn Trãi, F.7, TP. Mỹ Tho, Tiền Giang', '2002-01-01', 'timve@gmail.com',1,'aaaaaaa5', 0, 'Đỗ Huy Hoàng', '0935835435', 6500000, 5,1),
(6, '484 ĐL Bình Dương, Thủ Dầu Một, Tỉnh Bình Dương', '2001-12-10', 'cristiaronaldo@gmail.com',1,'aaaaaaa6', 0, 'Bùi Nhật Minh', '0935980462', 6500000, 6,3),
(7, '193/5 Tân Thới 3, Xã Tân Hiệp, H. Hóc Môn', '1998-01-09', 'messi@gmail.com',1,'aaaaaaa7', 0, 'Trần Trọng Cung', '0935658679', 8000000, 7,4),
(8, ' 14 Nguyễn Hữu Thọ, Phường Phước Trung, TP.Bà Rịa, Vũng Tàu', '1996-08-07', 'henry@gmail.com',1,'aaaaaaa1', 0, 'Nguyễn Minh Quang', '0931244225', 8500000,8,1),
(9, '21/4 Xuân Bình, Long Khánh, Đồng Nai', '1998-08-08', 'rooney@gmail.com',1,'aaaaaaa2', 0, 'Trần Xuân Cung', '0942627721', 1500000, 9,2),
(10, '136A Đường 30/4 Phường An Phú, Quận Ninh Kiều, TP. Cần Thơ', '1999-03-29', 'mohamett@gmail.com',1,'aaaaaaa3', 0, 'Phạm Huỳnh Nhật Vượng', '0965842525', 8000000, 10,2),
(11, 'Bãi Bắc, phường Thọ Quang, bán đảo Sơn Trà, Đà Nẵng', '1995-07-30', 'napoleon@gmail.com',1,'aaaaaaa4', 0, 'Nguyễn Nhật Trường Sinh', '0945757345', 7500000, 11,2),
(12, '35 Trường Sa, quận Ngũ Hành Sơn, Đà Nẵng', '1994-06-08', 'nangchangconxanh@gmail.com',1,'aaaaaaa5', 0, 'Dương Quang Sinh', '0933467342', 7500000, 12,1),
(13, 'Lô 5 -6 Võ Nguyên Giáp, Phước Mỹ, Đà Nẵng', '1997-02-09', 'ngaydaubuoisang@gmail.com',1,'aaaaaaa6', 0, 'Trần Trọng Sinh', '0765756753', 7500000, 13,3),
(14, '150 – 152 Bạch Đằng, quận Hải Châu, Đà Nẵng', '1993-02-01', 'luctungthungrac@gmail.com',1,'aaaaaaa7', 0, 'Nguyễn Quang Trực', '08065764334', 7500000, 14,4);
insert into dish_order value
(1,"DO-001",0,1,null,1,2,null),
(2,"DO-002",0,3,null,1,2,null),
(3,"DO-003",0,2,null,1,4,null);
insert into dish_order value
(4,"DO-001",0,1,null,1,2,null),
(5,"DO-002",0,3,null,2,2,null),
(6,"DO-003",0,2,null,3,4,null),
(7,"DO-003",0,2,null,3,1,null),
(8,"DO-003",0,2,null,3,4,null);
insert into dish_order value
(9,"DO-001",0,1,null,1,2,null),
(10,"DO-001",0,3,null,1,2,null);

insert into feedback (`code`, feedback_date, creator, email, content, rating, image)
         values ("FB0005", "2022-08-08", "DiepTT", "diep@gmail.com", "View đẹp", 3, "anh-quan-cafe-1.jpg"),
         ("FB0002", "2022-08-08", "DiepTT1", "diep1@gmail.com", "View đẹp", 4, "anh-quan-cafe-4.jpg"),
         ("FB0003", "2022-08-08", "DiepTT2", "diep2@gmail.com", "View đẹp", 5, "anh-quan-cafe-2.jpg"),
         ("FB0004", "2022-08-08", "DiepTT3", "diep3@gmail.com", "View đẹp", 6, "anh-quan-cafe-3.jpg");
