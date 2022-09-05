package com.example.coffee_smartphonne_be.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPosition;
    @Column(name = "name_position")
    private String name;


    @OneToMany(mappedBy = "position")
    @JsonBackReference
    private List<Employee> employees;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Position position = (Position) o;
        return idPosition != null && Objects.equals(idPosition, position.idPosition);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
