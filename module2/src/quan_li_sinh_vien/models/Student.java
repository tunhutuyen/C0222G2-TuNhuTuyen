package quan_li_sinh_vien.models;

public class Student extends Person{
    private String classStudent;
    private Double point;

    public Student() {
    }

    public Student(String classStudent, Double point) {
        this.classStudent = classStudent;
        this.point = point;
    }

    public Student(Integer id, String name, String dayOfBirth, String gender, String classStudent, Double point) {
        super(id, name, dayOfBirth, gender);
        this.classStudent = classStudent;
        this.point = point;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString() +
                ",classStudent='" + classStudent +
                ", point=" + point +
                '}';
    }

    @Override
    public String getInfo() {
        return super.getInfo()+","+classStudent+","+point;
    }
}
