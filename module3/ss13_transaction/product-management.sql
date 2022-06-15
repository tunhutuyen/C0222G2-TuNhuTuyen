drop database if exists product_management;
create database product_management;
use product_management;

create table product(
product_id int primary key,
product_name varchar(55),
price double,
quality int,
color varchar(55),
category_id int,
status int default 0
);

create table category(
category_id int primary key,
category_name varchar(55)
);

insert into product(product_id,product_name,price,quality,color,category_id) 
values(1,"ip11",799,12,"pup,yell,gree",1),(2,"ip11 pro",1199,10,"pup,yell,gree",1),
(3,"ipX",900,11,"pup,blu,gree",1),(4,"tivi",799,5,"black",2);

insert into category(category_id,category_name)
values(1,"phone"),(2,"tivi");