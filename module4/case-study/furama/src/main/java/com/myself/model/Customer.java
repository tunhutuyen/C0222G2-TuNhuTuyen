package com.myself.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Integer idCustomer;
    private String nameCustomer;
    @Column(columnDefinition = "DATE")
    private String dateOfBirth;
    private Integer gender;
    private String idCard;
    private String phoneNumber;
    private String email;
    private String address;
    @ManyToOne
    @JoinColumn(name = "id_customer_type")
    private CustomerType customerType;
    @OneToMany(mappedBy = "customer")
    private List<Contract> contractList;

    public Customer() {
    }

    public Customer(Integer idCustomer, String nameCustomer, String dateOfBirth, Integer gender, String idCard, String phoneNumber, String email, String address, CustomerType customerType) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
    }

    public Customer(Integer idCustomer, String nameCustomer, String dateOfBirth, Integer gender, String idCard, String phoneNumber, String email, String address, CustomerType customerType, List<Contract> contractList) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.customerType = customerType;
        this.contractList = contractList;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
