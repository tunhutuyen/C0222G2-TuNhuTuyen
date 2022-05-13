package quan_li_sinh_vien.common;

import quan_li_sinh_vien.models.Student;
import quan_li_sinh_vien.models.Teacher;
import quan_ly_khach_san_furama.models.facility.Villa;
import quan_ly_khach_san_furama.models.person.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    private static final String PATH_STUDENT = "src/quan_li_sinh_vien/data/Student.csv";
    private static final String PATH_TEACHER = "src/quan_li_sinh_vien/data/Teacher.csv";

    private static void writeDataToCsv(List<String> stringList, String pathFile, boolean flag) {
        File file = new File(pathFile);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, flag);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeStudentToCsv(List<Student> studentList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Student student : studentList) {
            stringList.add(student.getInfo());
        }
        writeDataToCsv(stringList, PATH_STUDENT, flag);
    }
    public static void writeTeacherToCsv(List<Teacher> teacherList, Boolean flag) {
        List<String> stringList = new ArrayList<>();
        for (Teacher teacher : teacherList) {
            stringList.add(teacher.getInfo());
        }
        writeDataToCsv(stringList, PATH_STUDENT, flag);
    }

    //read file------------------------------------------------------------
    private static List<String> readFileCsvToList(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringList;
    }
    public static List<Student> readFileCsvToListStudent() {
        List<String> stringList = readFileCsvToList(PATH_STUDENT);
        List<Student> studentList = new ArrayList<>();
        Student student = null;
        for (String string : stringList) {
            String[] array = string.split(",");
            student = new Student(Integer.parseInt(array[0]), array[1],array[2], array[3], array[4], Double.parseDouble(array[5]));
            studentList.add(student);
        }
        return studentList;
    }
    public static List<Teacher> readFileCsvToListTeacher() {
        List<String> stringList = readFileCsvToList(PATH_TEACHER);
        List<Teacher> teacherList = new ArrayList<>();
        Teacher teacher = null;
        for (String string : stringList) {
            String[] array = string.split(",");
            teacher = new Teacher(Integer.parseInt(array[0]), array[1],array[2], array[3], array[4]);
            teacherList.add(teacher);
        }
        return teacherList;
    }
}
