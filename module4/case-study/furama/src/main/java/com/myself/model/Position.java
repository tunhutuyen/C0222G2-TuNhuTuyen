package com.myself.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "position")
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_position")
    private Integer idPosition;
    @Column(name = "name_position")
    private String namePosition;
    @OneToMany(mappedBy = "position",fetch = FetchType.LAZY)
    @JsonBackReference("8")
    private List<Employee> employeeList;

    public Position() {
    }

    public Position(Integer idPosition, String namePosition, List<Employee> employeeList) {
        this.idPosition = idPosition;
        this.namePosition = namePosition;
        this.employeeList = employeeList;
    }

    public Integer getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Integer idPosition) {
        this.idPosition = idPosition;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
