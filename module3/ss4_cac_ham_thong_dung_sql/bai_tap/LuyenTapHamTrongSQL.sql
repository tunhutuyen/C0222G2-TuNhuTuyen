use quan_li_sinh_vien;

select sub_id,sub_name,max(`subject`.credit) as credit, `status` from `subject`; 

select subject.sub_id,subject.sub_name,max(mark.mark) as `point`
from `subject` join mark on mark.sub_id = subject.sub_id;

select student.student_id,student.student_name,avg(mark.mark) as mark from student
join mark on mark.student_id = student.student_id
group by student_id
order by mark desc, student_name asc;