package com.myself.model;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    private Integer idEmployee;
    @Column(name = "name_employee")
    private String nameEmployee;
    @Column(name = "date_of_birth_employee",columnDefinition = "DATE")
    private String dateOfBirthEmployee;
    @Column(name = "id_card_employee")
    private String idCardEmployee;
    @Column(name = "salary_employee")
    private Double salaryEmployee;
    @Column(name = "phone_number_employee")
    private String phoneNumberEmployee;
    @Column(name = "email_employee")
    private String emailEmployee;
    @Column(name = "address_employee")
    private String addressEmployee;
    @ManyToOne
    @JoinColumn(name = "id_division")
    private Division division;
    @ManyToOne
    @JoinColumn(name = "id_education_degree")
    private EducationDegree educationDegree;
    @ManyToOne
    @JoinColumn(name = "id_position")
    private Position position;
    @OneToOne
    @JoinColumn
    private User user;

    public Employee() {
    }

    public Employee(Integer idEmployee, String nameEmployee, String dateOfBirthEmployee, String idCardEmployee, Double salaryEmployee, String phoneNumberEmployee, String emailEmployee, String addressEmployee, Division division, EducationDegree educationDegree, Position position, User user) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.dateOfBirthEmployee = dateOfBirthEmployee;
        this.idCardEmployee = idCardEmployee;
        this.salaryEmployee = salaryEmployee;
        this.phoneNumberEmployee = phoneNumberEmployee;
        this.emailEmployee = emailEmployee;
        this.addressEmployee = addressEmployee;
        this.division = division;
        this.educationDegree = educationDegree;
        this.position = position;
        this.user = user;
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

    public String getPhoneNumberEmployee() {
        return phoneNumberEmployee;
    }

    public void setPhoneNumberEmployee(String phoneNumberEmployee) {
        this.phoneNumberEmployee = phoneNumberEmployee;
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

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
