use demo;

DELIMITER $$
create procedure get_user_by_id(in user_id int)
begin
select users.id,users.`name`, users.email, users.country from users  where users.id = user_id;
end $$
DELIMITER ;

DELIMITER $$
create procedure insert_user(in user_name varchar(55),in user_email varchar(55),
 in user_country varchar(55))
begin
insert into users(`name`,email,country)
values(user_name,user_email,user_country);
end $$
DELIMITER ;