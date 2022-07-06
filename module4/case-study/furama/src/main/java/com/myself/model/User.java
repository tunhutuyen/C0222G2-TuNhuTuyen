package com.myself.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @Column(name = "user_name")
    private String userName;
    private String password;
    @OneToOne(mappedBy = "user")
    private Employee employee;

    @ManyToMany(mappedBy = "userList")
    @JsonManagedReference
    private List<Role> roleList;

    public User() {
    }

    public User(String userName, String password, Employee employee, List<Role> roleList) {
        this.userName = userName;
        this.password = password;
        this.employee = employee;
        this.roleList = roleList;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
