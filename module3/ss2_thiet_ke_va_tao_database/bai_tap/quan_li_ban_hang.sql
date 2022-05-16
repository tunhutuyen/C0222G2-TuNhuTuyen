create database quan_li_ban_hang;
use quan_li_ban_hang;

create table customer(
c_id int primary key,
c_name varchar(55) not null,
c_age int not null);

create table `order`(
o_id int primary key,
c_id int,
o_date datetime,
o_total_price double,
foreign key (c_id) references customer(c_id)
);

create table product(
p_id int primary key,
p_name varchar(50) not null,
p_price double not null);

create table order_detail(
o_id int,
p_id int,
od_qty varchar(255),
primary key(o_id,p_id),
foreign key (o_id) references `order`(o_id),
foreign key (p_id) references product(p_id));