drop database if exists exam_md6_new;
create database exam_md6_new;
use exam_md6_new;


CREATE TABLE `type_product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

create table `product`(
`id` int NOT NULL AUTO_INCREMENT,
  `code` varchar(255) not NULL unique,
  `date_start` date DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
   `status` varchar(255) DEFAULT NULL ,
  `is_deleted` bit(1) DEFAULT b'0',
  `country` varchar(255) ,
  `sugar_cake` varchar(255) ,
  `no_have_gas` varchar(255) ,
   `date_writer` varchar(255),
	`written` varchar(255),
	`type_comic` varchar(255),
    `type_product_id` int,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`type_product_id`) REFERENCES `type_product` (`id`)
);
-- type-comic
INSERT INTO `type_product`(`name`) VALUES
('Thức Uống'),('Đồ Ăn'),('Sách Truyện');


insert into `product`(`id` ,`code`,`date_start`,`name`,`price`,`status`,`is_deleted`,`country`,`sugar_cake`,
`no_have_gas`,`written`,`type_comic`,`date_writer`,`type_product_id`) values
(1,'M0001','2002-12-02','Thạch Sanh',1500000,'Mới',b'0','','','','Thích Nhiều Chuyện','Dân gian','2021-02-12',3),
(2,'M0002','2002-12-12','Doremon',1500000,'Mới',b'0','','','','A Pháo','Truyện trẻ em','2021-02-12',3),
(3,'M0003','2002-12-22','Vua Bóng Đá',1500000,'Mới',b'0','','','','Nam Anh','Truyện trẻ em','2021-02-12',3),
(4,'M0004','2002-12-04','Vua Bánh Mì',1500000,'Mới',b'0','','','','Nguyên Thần','Truyện trẻ em','2021-02-12',3);
insert into `product`(`id` ,`code`,`date_start`,`name`,`price`,`status`,`is_deleted`,`country`,`sugar_cake`,
`no_have_gas`,`written`,`type_comic`,`date_writer`,`type_product_id`) values
(5,'C0001','2002-12-02','Bánh Mì',1500000,'Mới',b'0','Việt Nam','Bánh mặn','','','','',2),
(6,'C0002','2002-12-12','Bánh Kem',1500000,'Mới',b'0','Việt Nam','Bánh ngọt','','','','',2),
(7,'C0003','2002-12-22','Bánproducth Bao',1500000,'Mới',b'0','Việt Nam','Bánh mặn','','','','',2),
(8,'C0004','2002-12-04','Mì Tôm',1500000,'Mới',b'0','Việt Nam','Mặn','','','','',2);

 insert into `product`(`id` ,`code`,`date_start`,`name`,`price`,`status`,`is_deleted`,`country`,`sugar_cake`,
 `no_have_gas`,`written`,`type_comic`,`date_writer`,`type_product_id`) values
 (9,'D0003','2002-12-22','Ô Long',1500000,'Mới',b'0','Việt Nam','','Không','','','',1),
(10,'D0004','2002-12-04','String',1500000,'Mới',b'0','Việt Nam','','Có','','','',1);


-- 0	88	13:23:20	insert into `product`(`id` ,`code`,`date_start`,`name`,`price`,`status`,`is_deleted`,`country`,`sugar_cake`,
--  `no_have_gas`,`written`,`type_comic`,`date_writer`,`type_product_id`) values
--  (5,'C0001','2002-12-02','Bánh Mì',1500000,'Mới',b'0','Việt Nam','Bánh mặn','','','','',2),
--  (6,'C0002','2002-12-12','Bánh Kem',1500000,'Mới',b'0','Việt Nam','Bánh ngọt','','','','',2),
--  (7,'C0003','2002-12-22','Bánproducth Bao',1500000,'Mới',b'0','Việt Nam','Bánh mặn','','','','',2),
--  (8,'C0004','2002-12-04','Mì Tôm',1500000,'Mới',b'0','Việt Nam','Mặn','','','','',2)	Error Code: 1292. Incorrect date value: '' for column 'date_writer' at row 1	0.000 sec
-- create table `comic`(
-- `id` int NOT NULL AUTO_INCREMENT,
--   `code` varchar(255) not NULL unique,
--   `date_in` date DEFAULT NULL,
--   `date_start` date DEFAULT NULL,
--   `name` varchar(255) DEFAULT NULL,
--   `is_deleted` bit(1) DEFAULT b'0',
--   `written` varchar(255) DEFAULT NULL,
--   `status` varchar(255) DEFAULT NULL ,
--   `price` double DEFAULT NULL,
--   `type_comic_id` int DEFAULT NULL,
--   PRIMARY KEY (`id`),
--   FOREIGN KEY (`type_comic_id`) REFERENCES `type_comic` (`id`)
-- );

-- create table `cake`(
-- `id` int NOT NULL AUTO_INCREMENT,
--   `code` varchar(255) not NULL unique,
--   `date_start` date DEFAULT NULL,
--   `name` varchar(255) DEFAULT NULL,
--   `price` double DEFAULT NULL,
--    `status` varchar(255) DEFAULT NULL ,
--   `is_deleted` bit(1) DEFAULT b'0',
--   `country` varchar(255) DEFAULT NULL,
--   `sugar_cake` bit(1) default null,
--   PRIMARY KEY (`id`)
-- );

-- create table `drink`(
-- `id` int NOT NULL AUTO_INCREMENT,
--   `code` varchar(255) not NULL unique,
--   `date_start` date DEFAULT NULL,
--   `name` varchar(255) DEFAULT NULL,
--   `price` double DEFAULT NULL,
--    `status` varchar(255) DEFAULT NULL ,
--   `is_deleted` bit(1) DEFAULT b'0',
--   `country` varchar(255) DEFAULT NULL,
--   `is_gas` bit(1) default null,
--   PRIMARY KEY (`id`)
-- );


-- type-comic
-- INSERT INTO `type_comic`(`name`) VALUES
-- ('Trẻ Em'),('Người Lớn'),('Khoa Học');

-- insert into `drink`(`id` ,`code`,`date_start`,`name`,`price`,`status`,`is_deleted`,`country`,`is_gas`) values
-- (1,'D0001','2002-12-02','Lúa Nếp',1500000,'Mới',b'0','Việt Nam',b'0'),
-- (2,'D0002','2002-12-12','drinkTrà Đào',1500000,'Mới',b'0','Việt Nam',b'0'),
-- (3,'D0003','2002-12-22','Ô Long',1500000,'Mới',b'0','Việt Nam',b'0'),
-- (4,'D0004','2002-12-04','String',1500000,'Mới',b'0','Việt Nam',b'1');

-- insert into `cake`(`id` ,`code`,`date_start`,`name`,`price`,`status`,`is_deleted`,`country`,`sugar_cake`) values
-- (1,'C0001','2002-12-02','Bánh Mì',1500000,'Mới',b'0','Việt Nam',b'0'),
-- (2,'C0002','2002-12-12','Bánh Kem',1500000,'Mới',b'0','Việt Nam',b'0'),
-- (3,'C0003','2002-12-22','Bánh Bao',1500000,'Mới',b'0','Việt Nam',b'0'),
-- (4,'C0004','2002-12-04','Mì Tôm',1500000,'Mới',b'0','Việt Nam',b'1');

-- insert into `comic`(`id` ,`code`,`date_start`,`name`,`price`,`status`,`is_deleted`,`written`,`type_comic_id`,`date_in`) values
-- (1,'M0001','2002-12-02','Thạch Sanh',1500000,'Mới',b'0','Thích Nhiều Chuyện',1,'2021-02-12'),
-- (2,'M0002','2002-12-12','Doremon',1500000,'Mới',b'0','A Pháo',2,'2021-02-12'),
-- (3,'M0003','2002-12-22','Vua Bóng Đá',1500000,'Mới',b'0','Nam Anh',3,'2021-02-12'),
-- (4,'M0004','2002-12-04','Vua Bánh Mì',1500000,'Mới',b'0','Nguyên Thần',1,'2021-02-12');
