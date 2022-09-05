drop database if exists exam_md6;
create database exam_md6;
use exam_md6;

-- CREATE TABLE `app_user` (
--   `id` int NOT NULL AUTO_INCREMENT,
--   `creation_date` date DEFAULT NULL,
--   `is_deleted` bit(1) DEFAULT b'0',
--   `password` varchar(255) NOT NULL,
--   `user_name` varchar(255) NOT NULL ,
--   PRIMARY KEY (`id`)
-- );

CREATE TABLE `position` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` int DEFAULT NULL,
  `image` text,
  `is_deleted` bit(1) DEFAULT b'0',
  `name` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL UNIQUE,
  `salary` double DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `position_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`position_id`) REFERENCES `position` (`id`)
);

-- Position
INSERT INTO `position` VALUES
(1,'Quản Lý'),(2,'Phục Vụ'),(3,'Thu Ngân'),(4,'Bảo Vệ');

-- Employee
INSERT INTO employee (`id`,`address`,`birthday`,`email`,`gender`,`image`,`is_deleted`,`name`,`phone_number`,`salary`,`position_id`) VALUES
(1, '27-28, ngõ 294 Vạn Phúc, Kim Mã, Hà Nội', '1998-11-21', 'kinhcan@gmail.com',0,'https://toigingiuvedep.vn/wp-content/uploads/2021/07/mau-anh-the-dep-chuan.jpg', 0, 'Trần Thiên Minh', '0905934232', 15000000,1),
(2, '27-28, ngõ 298 Vạn Phúc, Kim Mã, Hà Nội', '1990-01-01', 'tranthienminh1351@gmail.com',1,'https://kenh14cdn.com/thumb_w/660/2019/3/7/5301629225053921961409043040056750658027520n-1551924968498331276673.jpg', 0, 'Lê Thị Tài', '0914933888', 8000000,2),
(3, '63 – 65 Nguyễn Kiệm, F.3, Q. Gò Vấp, Tp.HCM', '1999-11-21', 'cuocsongso@gmail.com',1,'https://kenh14cdn.com/2020/6/30/img0096-1592366363868430058761-1593507888983990295582.jpeg', 0, 'Nguyễn Trung Thực', '0918912341', 8000000,2),
(4, '237/6 Đỗ Ngọc Thạnh, F.6, Q.11, Tp.HCM', '1998-02-01', 'timdau@gmail.com',1,'https://i.vietgiaitri.com/2021/3/28/ngam-nhung-buc-anh-the-lam-can-cuoc-cong-dan-cua-cac-co-cau-hoc-tro-than-thai-dinh-cua-chop-78e-5665478.jpg', 0, 'Phạm Lê Long', '0905943678', 7500000, 2),
(5, '500 Nguyễn Thị Thập, Kp1, F. Tân Quy, Q.7, Tp.HCM', '1994-01-01', 'ngaynanglen@gmail.com',1,'https://phunugioi.com/wp-content/uploads/2021/09/Mau-anh-the-dep-cho-nam-phong-trang.jpg', 0, 'Nguyễn Trung Kiên', '0902980756', 7000000,2),
(6, '56-58 Nguyễn Trãi, F.7, TP. Mỹ Tho, Tiền Giang', '2002-01-01', 'timve@gmail.com',1,'https://chuphinhthe.com/thumbs/360x360x2/upload/product/903-phat-7991.jpg', 0, 'Đỗ Huy Hoàng', '0915835435', 8000000, 2),
(7, '484 ĐL Bình Dương, Thủ Dầu Một, Tỉnh Bình Dương', '2001-12-10', 'cristiaronaldo@gmail.com',1,'https://toplist.vn/images/800px/studio-hong-ngoc-318809.jpg', 0, 'Bùi Nhật Minh', '0913980462', 7000000, 2),
(8, 'Lô 5 -6 Võ Nguyên Giáp, Phước Mỹ, Đà Nẵng', '1997-02-09', 'ngaydaubuoisang@gmail.com',1,'https://toplist.vn/images/800px/dino-studio-anh-vien-cho-be-va-gia-dinh-317623.jpg', 0, 'Trần Trọng Sinh', '0905756753', 7500000, 2),
(9, '14 Nguyễn Hữu Thọ, Phường Phước Trung, TP.Bà Rịa, Vũng Tàu', '1996-08-07', 'henry@gmail.com',1,'https://3.bp.blogspot.com/-ckaz8OGT99Q/WrJ4BOLtQkI/AAAAAAAAA24/vZaL--YusZEK_C117-S7PQXhW1Ri-myHgCEwYBhgL/s1600/cach%2Bchup%2Banh%2Bthe%2Bdep%2B2.jpg', 0, 'Nguyễn Minh Quang', '0901244225', 8500000,2),
(10, '35 Trường Sa, quận Ngũ Hành Sơn, Đà Nẵng', '1994-06-08', 'nangchangconxanh@gmail.com',1,'https://ss-images.saostar.vn/wp700/2020/05/26/7542385/photo-1-1590311162571565188046.jpg', 0, 'Dương Quang Sinh', '0913467342', 7500000, 2),
(11, '21/4 Xuân Bình, Long Khánh, Đồng Nai', '1998-08-08', 'rooney@gmail.com',1,'https://toplist.vn/images/800px/tiem-chup-anh-the-lay-ngay-dep-nhat-pleiku-gia-lai-chu-de-da-duoc-nhan-tran-minh-phuong-318152.jpg', 0, 'Trần Xuân Cung', '0912627721', 7000000, 2),
(12, '136A Đường 30/4 Phường An Phú, Quận Ninh Kiều, TP. Cần Thơ', '1999-03-29', 'mohamett@gmail.com',1,'https://we25.vn/media2018/Img_News/2020/08/19/anh-the-3_20200819144021.jpg', 0, 'Phạm Huỳnh Nhật Vượng', '0909842525', 7500000, 3),
(13, 'Bãi Bắc, phường Thọ Quang, bán đảo Sơn Trà, Đà Nẵng', '1995-07-30', 'napoleon@gmail.com',1,'https://topquangngai.vn/wp-content/uploads/2021/02/chup-anh-the-dep-quang-ngai-7.jpg', 0, 'Nguyễn Nhật Trường Sinh', '0916757345', 7500000, 3),
(14, '193/5 Tân Thới 3, Xã Tân Hiệp, H. Hóc Môn', '1998-01-09', 'messi@gmail.com',1,'https://demoda.vn/wp-content/uploads/2022/03/mau-anh-the-ong-chu-so-mi-trang.jpg', 0, 'Trần Trọng Cung', '0903658679', 7000000, 4),
(15, '150 – 152 Bạch Đằng, quận Hải Châu, Đà Nẵng', '1993-02-01', 'luctungthungrac@gmail.com',1,'https://toplist.vn/images/800px/tiem-chup-anh-the-334-321384.jpg', 0, 'Nguyễn Quang Trực', '0905764334', 7000000, 4);

