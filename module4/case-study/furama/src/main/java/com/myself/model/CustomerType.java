package com.myself.model;

import javax.persistence.*;

@Entity
@Table(name = "customer_type")
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer_type")
    private Integer idCustomerType;
    @Column(name = "name_customer_type")
    private String nameCustomerType;

    public CustomerType() {
    }

    public CustomerType(Integer idCustomerType, String nameCustomerType) {
        this.idCustomerType = idCustomerType;
        this.nameCustomerType = nameCustomerType;
    }

    public Integer getIdCustomerType() {
        return idCustomerType;
    }

    public void setIdCustomerType(Integer idCustomerType) {
        this.idCustomerType = idCustomerType;
    }

    public String getNameCustomerType() {
        return nameCustomerType;
    }

    public void setNameCustomerType(String nameCustomerType) {
        this.nameCustomerType = nameCustomerType;
    }
}
