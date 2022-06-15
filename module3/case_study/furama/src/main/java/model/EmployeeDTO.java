package model;

public class EmployeeDTO {
//    ma_nhan_vien INT primary key auto_increment,
//    ho_ten varchar(50) NOT NULL,
//    ngay_sinh varchar(50) NOT NULL,
//    so_cmnd varchar(50) NOT NULL,
//    luong double NOT NULL,
//    so_dien_thoai varchar(50) NOT NULL,
//    email varchar(50),
//    dia_chi varchar(50),
//    ma_vi_tri int NOT NULL,
//    ma_trinh_do int NOT NULL,
//    ma_bo_phan int NOT NULL,
//            `status` int default 0,
//    foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
//    foreign key(ma_bo_phan) references bo_phan(ma_bo_phan),
//    foreign key(ma_vi_tri) references vi_tri(ma_vi_tri));
    private Integer idEmployee;
    private String nameEmployee;
    private String dateOfBirthEmployee;
    private String idCardEmployee;
    private Double salaryEmployee;
    private String numberPhoneEmployee;
    private String emailEmployee;
    private String addressEmployee;
    private String namePositionEmployee;
    private String degreeEmployee;
    private String divisionEmployee;
    private Integer status;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String nameEmployee, String dateOfBirthEmployee, String idCardEmployee, Double salaryEmployee, String numberPhoneEmployee, String emailEmployee, String addressEmployee, String namePositionEmployee, String degreeEmployee, String divisionEmployee) {
        this.nameEmployee = nameEmployee;
        this.dateOfBirthEmployee = dateOfBirthEmployee;
        this.idCardEmployee = idCardEmployee;
        this.salaryEmployee = salaryEmployee;
        this.numberPhoneEmployee = numberPhoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.namePositionEmployee = namePositionEmployee;
        this.degreeEmployee = degreeEmployee;
        this.divisionEmployee = divisionEmployee;
    }

    public EmployeeDTO(Integer idEmployee, String nameEmployee, String dateOfBirthEmployee, String idCardEmployee, Double salaryEmployee, String numberPhoneEmployee, String emailEmployee, String addressEmployee, String namePositionEmployee, String degreeEmployee, String divisionEmployee) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.dateOfBirthEmployee = dateOfBirthEmployee;
        this.idCardEmployee = idCardEmployee;
        this.salaryEmployee = salaryEmployee;
        this.numberPhoneEmployee = numberPhoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.namePositionEmployee = namePositionEmployee;
        this.degreeEmployee = degreeEmployee;
        this.divisionEmployee = divisionEmployee;
    }

    public EmployeeDTO(Integer idEmployee, String nameEmployee, String dateOfBirthEmployee, String idCardEmployee, Double salaryEmployee, String numberPhoneEmployee, String emailEmployee, String addressEmployee, String namePositionEmployee, String degreeEmployee, String divisionEmployee, Integer status) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.dateOfBirthEmployee = dateOfBirthEmployee;
        this.idCardEmployee = idCardEmployee;
        this.salaryEmployee = salaryEmployee;
        this.numberPhoneEmployee = numberPhoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.namePositionEmployee = namePositionEmployee;
        this.degreeEmployee = degreeEmployee;
        this.divisionEmployee = divisionEmployee;
        this.status = status;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getDateOfBirthEmployee() {
        return dateOfBirthEmployee;
    }

    public void setDateOfBirthEmployee(String dateOfBirthEmployee) {
        this.dateOfBirthEmployee = dateOfBirthEmployee;
    }

    public String getIdCardEmployee() {
        return idCardEmployee;
    }

    public void setIdCardEmployee(String idCardEmployee) {
        this.idCardEmployee = idCardEmployee;
    }

    public Double getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(Double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    public String getNumberPhoneEmployee() {
        return numberPhoneEmployee;
    }

    public void setNumberPhoneEmployee(String numberPhoneEmployee) {
        this.numberPhoneEmployee = numberPhoneEmployee;
    }

    public String getEmailEmployee() {
        return emailEmployee;
    }

    public void setEmailEmployee(String emailEmployee) {
        this.emailEmployee = emailEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    public String getNamePositionEmployee() {
        return namePositionEmployee;
    }

    public void setNamePositionEmployee(String namePositionEmployee) {
        this.namePositionEmployee = namePositionEmployee;
    }

    public String getDegreeEmployee() {
        return degreeEmployee;
    }

    public void setDegreeEmployee(String degreeEmployee) {
        this.degreeEmployee = degreeEmployee;
    }

    public String getDivisionEmployee() {
        return divisionEmployee;
    }

    public void setDivisionEmployee(String divisionEmployee) {
        this.divisionEmployee = divisionEmployee;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
