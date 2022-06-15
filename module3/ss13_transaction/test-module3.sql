drop database if exists test_module3;
create database test_module3;
use test_module3;

create table type_customer(
id_type_customer int primary key auto_increment,
name_type_customer varchar(50),
`status` int default 0);

create table customer(
id_customer int primary key auto_increment,
id_type_customer int NOT NULL,
`name` varchar(50) NOT NULL,
day_of_birth date NOT NULL,
gender int NOT NULL,
money double,
email varchar(50),
`status` int default 0,
foreign key(id_type_customer) references type_customer(id_type_customer));

insert into type_customer(name_type_customer) values("Diamond");
insert into type_customer(name_type_customer) values("Platinium");
insert into type_customer(name_type_customer) values("Gold");
insert into type_customer(name_type_customer) values("Silver");
insert into type_customer(name_type_customer) values("Member");

insert into customer(`name`,day_of_birth,gender,money,email,id_type_customer) values
('Nguyễn Thị Hào','1970-11-07',0,1000000,'thihao07@gmail.com',5),
('Phạm Xuân Diệu','1992-08-08',1,5000000,'xuandieu92@gmail.com',3),
('Trương Đình Nghệ','1990-02-27',1,4000000,'nghenhan2702@gmail.com',1),
('Dương Văn Quan','1981-07-08',1,55000000,'duongquan@gmail.com',1),
('Hoàng Trần Nhi Nhi','1995-12-09',0,6000000,'nhinhi123@gmail.com',4),
('Tôn Nữ Mộc Châu','2005-12-06',0,23500000,'tonnuchau@gmail.com',4),
('Nguyễn Mỹ Kim','1984-04-08',0,6000000,'kimcuong84@gmail.com',1),
('Nguyễn Thị Hào','1999-04-08',0,6000000,'haohao99@gmail.com',3),
('Trần Đại Danh','1994-07-01',1,23500000,'danhhai99@gmail.com',1),
('Nguyễn Tâm Đắc','1989-07-01',1,1000000,'dactam@gmail.com',2);