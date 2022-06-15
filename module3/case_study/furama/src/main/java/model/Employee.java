package model;

public class Employee {
    private Integer idEmployee;
    private String nameEmployee;
    private String dateOfBirthEmployee;
    private String idCardEmployee;
    private Double salaryEmployee;
    private String numberPhoneEmployee;
    private String emailEmployee;
    private String addressEmployee;
    private Integer idPosition;
    private Integer idDegree;
    private Integer idDivision;
    private Integer status;

    public Employee() {
    }

    public Employee(Integer idEmployee, String nameEmployee, String dateOfBirthEmployee, String idCardEmployee, Double salaryEmployee, String numberPhoneEmployee, String emailEmployee, String addressEmployee, Integer idPosition, Integer idDegree, Integer idDivision) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.dateOfBirthEmployee = dateOfBirthEmployee;
        this.idCardEmployee = idCardEmployee;
        this.salaryEmployee = salaryEmployee;
        this.numberPhoneEmployee = numberPhoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.idPosition = idPosition;
        this.idDegree = idDegree;
        this.idDivision = idDivision;
    }

    public Employee(String nameEmployee, String dateOfBirthEmployee, String idCardEmployee, Double salaryEmployee, String numberPhoneEmployee, String emailEmployee, String addressEmployee, Integer idPosition, Integer idDegree, Integer idDivision) {
        this.nameEmployee = nameEmployee;
        this.dateOfBirthEmployee = dateOfBirthEmployee;
        this.idCardEmployee = idCardEmployee;
        this.salaryEmployee = salaryEmployee;
        this.numberPhoneEmployee = numberPhoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.idPosition = idPosition;
        this.idDegree = idDegree;
        this.idDivision = idDivision;
    }

    public Employee(Integer idEmployee, String nameEmployee, String dateOfBirthEmployee, String idCardEmployee, Double salaryEmployee, String numberPhoneEmployee, String emailEmployee, String addressEmployee, Integer idPosition, Integer idDegree, Integer idDivision, Integer status) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.dateOfBirthEmployee = dateOfBirthEmployee;
        this.idCardEmployee = idCardEmployee;
        this.salaryEmployee = salaryEmployee;
        this.numberPhoneEmployee = numberPhoneEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.idPosition = idPosition;
        this.idDegree = idDegree;
        this.idDivision = idDivision;
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

    public Integer getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Integer idPosition) {
        this.idPosition = idPosition;
    }

    public Integer getIdDegree() {
        return idDegree;
    }

    public void setIdDegree(Integer idDegree) {
        this.idDegree = idDegree;
    }

    public Integer getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(Integer idDivision) {
        this.idDivision = idDivision;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}