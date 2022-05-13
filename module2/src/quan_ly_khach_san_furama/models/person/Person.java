package quan_ly_khach_san_furama.models.person;

public abstract class Person {
    //Mã nhân viên, Họ tên, Ngày sinh, Giới tính, Số CMND, Số Điện Thoại, Email
    private Integer id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String idCard;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(Integer id, String name, String dateOfBirth, String gender, String idCard, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id: " + id +
                ", name: " + name +
                ", date: " + dateOfBirth +
                ", gender: " + gender +
                ", idCard: " + idCard +
                ", phone: " + phoneNumber +
                ", email: " + email+", ";
    }
    public String getInfo(){
        return id + ";" + name + ";" + dateOfBirth + ";" + gender + ";" + idCard + ";" + phoneNumber + ";" + email;
    }
}
