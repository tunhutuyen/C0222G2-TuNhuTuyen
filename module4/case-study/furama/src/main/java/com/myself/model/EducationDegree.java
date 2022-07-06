package com.myself.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "education_degree")
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_education_degree")
    private Integer idEducationDegree;
    @Column(name = "name_education_degree")
    private String nameEducationDegree;
    @OneToMany(mappedBy = "educationDegree")
    private List<Employee> employeeList;

    public EducationDegree() {
    }

    public EducationDegree(Integer idEducationDegree, String nameEducationDegree, List<Employee> employeeList) {
        this.idEducationDegree = idEducationDegree;
        this.nameEducationDegree = nameEducationDegree;
        this.employeeList = employeeList;
    }

    public Integer getIdEducationDegree() {
        return idEducationDegree;
    }

    public void setIdEducationDegree(Integer idEducationDegree) {
        this.idEducationDegree = idEducationDegree;
    }

    public String getNameEducationDegree() {
        return nameEducationDegree;
    }

    public void setNameEducationDegree(String nameEducationDegree) {
        this.nameEducationDegree = nameEducationDegree;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
