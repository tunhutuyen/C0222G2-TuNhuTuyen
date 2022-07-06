package com.myself.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_role")
    private Integer idRole;
    @Column(name = "name_role")
    private String nameRole;
    @ManyToMany
    @JoinTable(name = "user_role",
    joinColumns = @JoinColumn(name = "id_role"),
    inverseJoinColumns =  @JoinColumn(name = "name_user"))
    @JsonManagedReference
    private List<User> userList;

    public Role() {
    }

    public Role(Integer idRole, String nameRole, List<User> userList) {
        this.idRole = idRole;
        this.nameRole = nameRole;
        this.userList = userList;
    }

    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
