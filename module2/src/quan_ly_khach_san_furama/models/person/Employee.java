package quan_ly_khach_san_furama.models.person;

public class Employee extends Person {
    private String level;
    private String position;
    private Long salary;

    public Employee() {
    }

    public Employee(String level, String position, Long salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(Integer id, String name, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String level, String position, Long salary) {
        super(id, name, dateOfBirth, gender, idCard, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+
                "level: " + level +
                ", position: " + position +
                ", salary: " + salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+";" + level + ";" + position + ";" + salary;
    }
}
