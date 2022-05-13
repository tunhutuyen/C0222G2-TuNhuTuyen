package quan_li_sinh_vien.models;

public class Person {
    private static final String COMMON = ",";
    private Integer id;
    private String name;
    private String dayOfBirth;
    private String gender;

    public Person() {
    }

    public Person(Integer id, String name, String dayOfBirth, String gender) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getInfo() {
        return id + COMMON + name + COMMON + dayOfBirth + COMMON + gender;
    }
}
