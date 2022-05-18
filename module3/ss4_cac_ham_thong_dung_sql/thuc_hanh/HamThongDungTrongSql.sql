use quan_li_sinh_vien;

select student.address,count(student.address) as so_luong_moi_noi from student
group by address;

select student.student_name,student.student_id, avg(mark) from student
inner join mark M on student.student_id = M.student_id
group by student.student_id;

select S.student_id,S.student_name, avg(M.mark) from student S
join mark M on S.student_id = M.student_id
group by S.student_id
having avg(M.mark) >=9;

select S.student_id,S.student_name, avg(M.mark) as diem_trung_binh from student S
join mark M on S.student_id = M.student_id
group by S.student_id
having diem_trung_binh >= all(select avg(mark.mark) from mark group by mark.student_id);