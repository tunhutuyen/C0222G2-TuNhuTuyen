use data_furama;

select * from nhan_vien where ho_ten like "N%" or ho_ten like "H%" or ho_ten like "c%" and length(ho_ten) <15;

select * from khach_hang where (dia_chi like "%đà nẵng" or dia_chi like "%Quảng Trị") and year(curdate()) -year(ngay_sinh) >18 and year(curdate())-year(ngay_sinh) <50;
select * from khach_hang where (dia_chi like "%đà nẵng" or dia_chi like "%Quảng Trị") and year(current_date()) -year(ngay_sinh) >18 and year(current_date())-year(ngay_sinh) <50;

-- task 4
select khach_hang.ma_khach_hang,khach_hang.ho_ten, count(hop_dong.ma_khach_hang) as so_lan_dat_phong 
from ((khach_hang join hop_dong on khach_hang.ma_khach_hang =hop_dong.ma_khach_hang)
				join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach)
where loai_khach.ten_loai_khach = "Diamond"
group by ma_khach_hang
order by so_lan_dat_phong;

-- task 5 ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu,
--  ngay_lam_hop_dong, ngay_ket_thuc, tong_tien
select K.ma_khach_hang,K.ho_ten, L.ten_loai_khach,H.ma_hop_dong,D.ten_dich_vu,
H.ngay_lam_hop_dong,H.ngay_ket_thuc, ifnull(D.chi_phi_thue + sum(ifnull((HD.so_luong*DV.gia),0)),0) as tong_tien
from khach_hang K 
join loai_khach L on K.ma_loai_khach = L.ma_loai_khach
left join hop_dong H on K.ma_khach_hang = H.ma_khach_hang
left join dich_vu D on H.ma_dich_vu = D.ma_dich_vu
left join hop_dong_chi_tiet HD on H.ma_hop_dong = HD.ma_hop_dong
left join dich_vu_di_kem DV on HD.ma_dich_vu_di_kem = DV.ma_dich_vu_di_kem
group by K.ma_khach_hang,D.ma_dich_vu
order by K.ma_khach_hang;

-- task 6
-- Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch 
-- vụ chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
select dich_vu.ma_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu from dich_vu
join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
join hop_dong on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
where dich_vu.ma_dich_vu not in (
select dich_vu.ma_dich_vu from dich_vu
join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
join hop_dong on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
where hop_dong.ngay_lam_hop_dong between '2021-01-01' and '2021-03-31'
group by ten_dich_vu)
group by ten_dich_vu;

-- task 7
select dich_vu.ma_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.so_nguoi_toi_da, 
dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu, hop_dong.ma_khach_hang, hop_dong.ngay_lam_hop_dong from dich_vu
join loai_dich_vu on dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
join hop_dong on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
where year(hop_dong.ngay_lam_hop_dong) = 2020 and hop_dong.ma_khach_hang 
not in (
select hop_dong.ma_khach_hang from dich_vu
join hop_dong on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
where year(hop_dong.ngay_lam_hop_dong) = 2021
group by ma_khach_hang
order by ma_khach_hang);

-- task 8
select distinct ho_ten from khach_hang;

select ho_ten from khach_hang 
union
select ho_ten from khach_hang ;

select ho_ten from khach_hang
group by ho_ten;

select month(hop_dong.ngay_lam_hop_dong) as thang, count(hop_dong.ma_khach_hang) as so_luong_khach_hang from hop_dong
where year(hop_dong.ngay_lam_hop_dong)= 2021
group by thang
order by thang;

-- task 10 thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm.
--  Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
select hop_dong.ma_hop_dong, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc,
 hop_dong.tien_dat_coc, sum( ifnull(hop_dong_chi_tiet.so_luong, 0)) as so_luong_dich_vu_di_kem
 from hop_dong left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
 group by hop_dong.ma_hop_dong
 order by hop_dong.ma_hop_dong;
 
 -- task 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách 
 -- hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
 select DV.ma_dich_vu_di_kem, DV.ten_dich_vu_di_kem from dich_vu_di_kem DV
 join hop_dong_chi_tiet HD on HD.ma_dich_vu_di_kem = DV.ma_dich_vu_di_kem
 join hop_dong H on H.ma_hop_dong = HD.ma_hop_dong
 join khach_hang K on K.ma_khach_hang = H.ma_khach_hang
 join loai_khach L on L.ma_loai_khach = K.ma_loai_khach
 where L.ten_loai_khach ="Diamond" and (K.dia_chi like "%Vinh" or K.dia_chi like "Quảng Ngãi");
 
--  12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng),
--  so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên 
--  việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng
--  đặt vào 3 tháng cuối năm 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
select hop_dong.ma_hop_dong, nhan_vien.ho_ten, khach_hang.ho_ten,khach_hang.so_dien_thoai, dich_vu.ten_dich_vu, 
sum( ifnull(hop_dong_chi_tiet.so_luong, 0)) as so_luong_dich_vu_di_kem,hop_dong.tien_dat_coc
 from hop_dong left join hop_dong_chi_tiet on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
 join nhan_vien on nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
 join khach_hang on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
 join dich_vu on dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
 where (hop_dong.ngay_lam_hop_dong between "2020-10-31" and "2020-12-31") and hop_dong.ma_hop_dong not in (
 select ma_hop_dong from hop_dong where ngay_lam_hop_dong between "2021-01-01" and "2021-06-30")
 group by hop_dong.ma_hop_dong
 order by hop_dong.ma_hop_dong; 
 
 -- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt
-- phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

select dich_vu_di_kem.ma_dich_vu_di_kem, dich_vu_di_kem.ten_dich_vu_di_kem,
sum(hop_dong_chi_tiet.so_luong) as so_luong_dich_vu_di_kem from dich_vu_di_kem
join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
group by hop_dong_chi_tiet.ma_dich_vu_di_kem
having so_luong_dich_vu_di_kem>= all (select sum(hop_dong_chi_tiet.so_luong) from hop_dong_chi_tiet group by ma_dich_vu_di_kem);

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm ma_hop_dong, 
-- ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
select H.ma_hop_dong, L.ten_loai_dich_vu, DV.ten_dich_vu_di_kem,
count(HD.ma_dich_vu_di_kem) as so_lan_su_dung from dich_vu_di_kem DV
join hop_dong_chi_tiet HD on HD.ma_dich_vu_di_kem = DV.ma_dich_vu_di_kem
join hop_dong H on HD.ma_hop_dong = H.ma_hop_dong
join dich_vu D on D.ma_dich_vu = H.ma_dich_vu
join loai_dich_vu L on L.ma_loai_dich_vu = D.ma_loai_dich_vu
group by DV.ma_dich_vu_di_kem
having so_lan_su_dung =1
order by HD.ma_hop_dong;

-- 15.	Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, 
-- ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
select N.ma_nhan_vien, N.ho_ten, T.ten_trinh_do, B.ten_bo_phan, N.so_dien_thoai,N.dia_chi
 from hop_dong H join nhan_vien N on N.ma_nhan_vien = H.ma_nhan_vien
join trinh_do T on T.ma_trinh_do = N.ma_trinh_do
join bo_phan B on B.ma_bo_phan = N.ma_bo_phan
where   year(H.ngay_lam_hop_dong) =2020 or year(H.ngay_lam_hop_dong) = 2021
-- H.ngay_lam_hop_dong between "2020-01-01" and "2021-12-31" 
group by H.ma_nhan_vien
having count(H.ma_nhan_vien)<=3
order by H.ma_nhan_vien;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
-- c1: xoa truc tiep
set sql_safe_updates =0;
delete from nhan_vien 
where ma_nhan_vien not in (
select * from (select hop_dong.ma_nhan_vien from hop_dong
-- left join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
 where year(hop_dong.ngay_lam_hop_dong) between 2019 and 2021 
group by hop_dong.ma_nhan_vien) table_ma_nhan_vien_ko_lap_duoc_hop_dong);
set sql_safe_updates =1;
-- c2:
set sql_safe_updates =0;
update nhan_vien set `status` = 1 where ma_nhan_vien not in (select * from (select hop_dong.ma_nhan_vien from nhan_vien
left join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
 where year(hop_dong.ngay_lam_hop_dong) between 2019 and 2021 
group by hop_dong.ma_nhan_vien) table_ma_nhan_vien_ko_lap_duoc_hop_dong);
set sql_safe_updates =1;

-- C2: tạo thêm col status ở mỗi bảng. Mỗi khi xóa hoặc update thì t sẽ thay đổi giá trị ở cột status chứ ko xóa hoặc sửa 
-- trực tiếp data vì dẫn đên mất dữ liệu ở các thuộc tính FK ở table liên kết
select nhan_vien.ma_nhan_vien, nhan_vien.ho_ten from nhan_vien 
-- left join hop_dong on hop_dong.ma_nhan_vien = nhan_vien.ma_nhan_vien
where nhan_vien.ma_nhan_vien not in (
select ma_nhan_vien from hop_dong where year(ngay_lam_hop_dong) between 2019 and 2021 
group by ma_nhan_vien);

-- 17.Cập nhật thông tin khách hàng có ten_loai_khach từ Platinum lên Diamond, chỉ cập nhật
-- những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
set sql_safe_updates =0;
update khach_hang set ma_loai_khach = 1 where ma_khach_hang in
(select *from (select khach_hang.ma_khach_hang from dich_vu_di_kem
join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
join  hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
join khach_hang on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
join loai_khach on loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
where loai_khach.ten_loai_khach = "Platinium" and year(hop_dong.ngay_lam_hop_dong) =2021 
and (dich_vu.chi_phi_thue + dich_vu_di_kem.gia * hop_dong_chi_tiet.so_luong)>= 10000000
group by ma_khach_hang)
-- having (dich_vu.chi_phi_thue + dich_vu_di_kem.gia * hop_dong_chi_tiet.so_luong)>= 10000000
 tab_khach_hang_2021_100000000_platinium);
set sql_safe_updates =1;

-- hiển thị kh có hóa đơn >10000000 năm 2021
select khach_hang.ma_khach_hang, khach_hang.ho_ten, loai_khach.ma_loai_khach, 
(dich_vu.chi_phi_thue + dich_vu_di_kem.gia * hop_dong_chi_tiet.so_luong) as tong_tien from dich_vu_di_kem
join hop_dong_chi_tiet on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
join  hop_dong on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
join dich_vu on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
join khach_hang on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
join loai_khach on loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
where loai_khach.ten_loai_khach = "Platinium" and year(hop_dong.ngay_lam_hop_dong) =2021
group by hop_dong.ma_khach_hang
having tong_tien>= 10000000;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
set sql_safe_updates =0;
update khach_hang set `status` = 1 where ma_khach_hang in (select * from (select khach_hang.ma_khach_hang from khach_hang 
join hop_dong on hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
where year(hop_dong.ngay_lam_hop_dong) < 2021
group by hop_dong.ma_khach_hang) tab_khach_hang_truoc_2021);
set sql_safe_updates=1;

-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
set sql_safe_updates = 0;
update dich_vu_di_kem set gia = gia * 2 where ma_dich_vu_di_kem in (select* from (select hop_dong_chi_tiet.ma_dich_vu_di_kem from hop_dong_chi_tiet
join hop_dong on hop_dong_chi_tiet.ma_hop_dong =  hop_dong.ma_hop_dong
where year(hop_dong.ngay_lam_hop_dong) = 2020
group by ma_dich_vu_di_kem
having sum(hop_dong_chi_tiet.so_luong) > 10  ) x2_gia_2020);
set sql_safe_updates = 1;

-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm 
-- id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi
select nhan_vien.ma_nhan_vien, nhan_vien.ho_ten as 'name', nhan_vien.email, nhan_vien.so_dien_thoai,
nhan_vien.ngay_sinh, nhan_vien.dia_chi, 'employee' as 'Type' from nhan_vien
union
select khach_hang.ma_khach_hang, khach_hang.ho_ten as 'name', khach_hang.email, khach_hang.so_dien_thoai,
khach_hang.ngay_sinh, khach_hang.dia_chi, 'customer' from khach_hang;

-- 21.	Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả các nhân viên có địa chỉ là “Hải Châu” và đã 
-- từng lập hợp đồng cho một hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “12/12/2019”.
