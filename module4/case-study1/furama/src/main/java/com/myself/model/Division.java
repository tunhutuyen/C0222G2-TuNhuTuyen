package com.myself.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "division")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_division")
    private Integer idDivision;
    @Column(name = "name_division")
    private String nameDivision;
    @OneToMany(mappedBy = "division",fetch = FetchType.LAZY)
    @JsonBackReference(value = "3")
    private List<Employee> employeeList;


    public Division() {
    }

    public Division(Integer idDivision, String nameDivision, List<Employee> employeeList) {
        this.idDivision = idDivision;
        this.nameDivision = nameDivision;
        this.employeeList = employeeList;
    }

    public Integer getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(Integer idDivision) {
        this.idDivision = idDivision;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
