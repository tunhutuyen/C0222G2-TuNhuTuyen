create DATABASE IF not EXISTS my_database_new;
use my_database_new;
create table class(
id_class int primary key,
name_class varchar(50));
create table student(
id int primary key,
name_student VARCHAR(50),
age INT,
country VARCHAR(50),
id_class int,
foreign key(id_class) references class(id_class));
create table teacher(
id_teacher int primary key,
name_teacher varchar(50),
age int,
country varchar(50),
id_class int,
foreign key(id_class) references class(id_class));
