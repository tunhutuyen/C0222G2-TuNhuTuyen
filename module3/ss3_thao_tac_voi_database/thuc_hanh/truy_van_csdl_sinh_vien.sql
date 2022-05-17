use quan_li_sinh_vien;
SELECT * FROM student;

SELECT * FROM student WHERE status = true;

SELECT * FROM `subject` WHERE credit < 10;

SELECT S.student_id, S.student_name, C.class_name FROM student S 
join class C on S.class_id = C.class_iD;
	
SELECT S.student_id, S.student_name, C.class_name FROM student S 
join class C on S.class_id = C.class_iD
WHERE C.class_name = 'A1';

SELECT S.student_id, S.student_name, sub.sub_name, M.mark
FROM student S join mark M on S.student_id = M.student_id join `subject` sub on M.sub_id = sub.sub_id
WHERE sub.sub_name = 'CF';