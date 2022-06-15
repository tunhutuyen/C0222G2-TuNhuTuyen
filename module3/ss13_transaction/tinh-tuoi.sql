drop database if exists friends;
create database friends;
use friends;
create table friend(
id int primary key  auto_increment,
namee varchar(55),
dateBirth date
);

insert into friend(namee,dateBirth) values("hoa","1990-06-15");
insert into friend(namee,dateBirth) values("hoa1","2004-06-11");
insert into friend(namee,dateBirth) values("hoa2","2004-06-09");
insert into friend(namee,dateBirth) values("hoa3","1999-06-15");
insert into friend(namee,dateBirth) values("hoa4","2000-06-15");


SELECT id, namee, ((YEAR(CURDATE()) - YEAR(dateBirth)) - (RIGHT(CURDATE(), 5) < RIGHT(dateBirth, 5))) AS years 
FROM friend where ((YEAR(CURDATE()) - YEAR(dateBirth)) - (RIGHT(CURDATE(), 5) < RIGHT(dateBirth, 5))) >= 18;

-- SELECT id,namee, ROUND(DATEDIFF(CURDATE(), dateBirth) / 365, 0) AS years
-- FROM friend
-- LIMIT 6;