use quan_li_sinh_vien;

select * from student where student_name like "h%";

select * from class where month(start_date) =12;

select * from `subject` where credit between 3 and 5;

set sql_safe_updates = 0;
update student set class_id = 2 where student_name = "hung";
set sql_safe_updates =1;

select S.student_name, sub.sub_name, M.mark
from student S join mark M on M.student_id = S.student_id
				join `subject` sub on sub.sub_id = M.sub_id
order by M.mark desc,S.student_name asc;
