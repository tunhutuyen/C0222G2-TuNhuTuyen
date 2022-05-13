package quan_li_sinh_vien.models;

public class Teacher extends Person{
    private String subject;

    public Teacher() {
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(Integer id, String name, String dayOfBirth, String gender, String subject) {
        super(id, name, dayOfBirth, gender);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +subject.toString()+
                ",subject='" + subject + '\'' +
                '}';
    }

    @Override
    public String getInfo() {
        return super.getInfo()+","+subject;
    }
}
