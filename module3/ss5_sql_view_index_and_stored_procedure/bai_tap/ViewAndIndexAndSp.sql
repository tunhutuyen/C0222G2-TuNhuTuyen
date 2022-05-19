drop database if exists products;
create database products;
use products;

create table product(
id int primary key auto_increment,
product_code int,
product_name varchar(255),
product_price double,
product_amount int default 10,
product_description varchar(255) default "good",
product_status bit(1) default 1);

insert into product(product_code,product_name,product_price,product_amount,
product_description,product_status)
values(1,"sua",10000,15,"hang moi",0),(2,"xa bong",6000,7,"hang moi",1),(3,"sua",10000,15,"hang moi",0),
(4,"dau goi",10000,15,"hang moi",0),(5,"gao",10000,15,"hang moi",1),(6,"coffee",55000,4,"hang moi",0);
-- c1 tao index
create unique index idx_product_code on product(product_code);
create index idx_product_name_and_price on product(product_name,product_price);

-- c2 them moi index
drop index idx_product_code on product;

select product_code,product_name,product_price from product; 

select product_code,product_name,product_price from product where product_code = 3; 
-- c2 them moi index
alter table product add unique index idx_product_code(product_code);

explain select product_code,product_name,product_price from product where product_code = 3; 

create view product_view as select product_code,product_name,product_price,product_status from product;
select * from product_view;

update product_view set product_price = 10000 where product_name ="xa bong";

delete from product_view where product_name ="xa bong";
select * from product_view;

-- sp xem
DELIMITER //
create procedure select_all_product()
begin 
select * from product;
end //
DELIMITER ; 
call select_all_product();
drop procedure if exists insert_product;

-- sp them moi
DELIMITER //
create procedure insert_product(p_code int,p_name varchar(255),p_price double,p_amount int ,
p_description varchar(255) ,p_status bit(1))
begin
insert into product(product_code,product_name,product_price,product_amount,product_description,product_status) 
values(p_code,p_name,p_price,p_amount,p_description ,p_status);
end //
DELIMITER ;
call insert_product(11,"dau an",111111,1,"nhap khau",1);
call select_all_product;

-- sp sua
DELIMITER //
create procedure edit_product(`number` int, name_new varchar(255))
begin
update product set product_name = name_new where id = `number`;
end //
DELIMITER ;
call edit_product(3,"sua tuoi");
call select_all_product;

-- sp xoa
DELIMITER //
create procedure delete_product(`number` int)
begin
delete from product where id = `number`;
end //
DELIMITER ;
call delete_product(7);
call select_all_product;