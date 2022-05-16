drop database if exists quan_li_sinh_vien;
create database if not exists quan_li_sinh_vien;
use quan_li_sinh_vien;

create table class(
class_id int Primary key auto_increment,
class_name varchar(60) not null,
start_date datetime not null ,
status bit(1));

create table student(
student_id int Primary key auto_increment,
student_name varchar(30) not null,
address varchar(50),
phone varchar(20),
status bit,
class_id int ,
foreign key(class_id) references class(class_id));

create table subject(
sub_id int Primary key auto_increment,
sub_name varchar(30) not null,
credit tinyint default 1,
status bit(1) default 1,
constraint check_credit check (credit >=1)
);

create table mark(
mark_id int Primary key auto_increment,
sub_id int not null,
student_id int not null,
UNIQUE (sub_id,student_id),
mark float default 0 check (mark between 0 and 100),
exam_times tinyint default 1);

