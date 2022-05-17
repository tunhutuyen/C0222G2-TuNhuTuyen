use quan_li_ban_hang;

insert into customer
values(1,"Minh Quan",10),(2,"Ngoc Oanh",20),(3,"Hong Ha",50);

insert into `order`(o_id,c_id,o_date) 
values(1,1,"2006-03-21");
insert into `order`(o_id,c_id,o_date) 
values(2,2,"2006-03-23"),(3,1,"2006-03-16");

insert into product(p_name,p_price)
values("May Giat",3),("Tu Lanh",5),("Dieu Hoa",7),("Quat",1),("Bep Dien",2);

insert into order_detail
values(1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,3),(2,3,3);

select o_id,o_date,o_total_price from `order`;

select C.c_name, P.p_name from customer C
join `order` O on C.c_id = O.c_id
join order_detail Od on O.o_id = Od.o_id
join product P on P.p_id = Od.p_id;

select C.c_name, P.p_name from customer C
join `order` O on C.c_id = O.c_id
join order_detail Od on O.o_id = Od.o_id
join product P on P.p_id = Od.p_id
where Od.o_id is null;