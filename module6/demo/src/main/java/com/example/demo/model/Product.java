package com.example.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    private String name;

    private Double price;

    private String status;

    private String dateStart;
    @Column(name = "is_deleted",columnDefinition = "bit(1) default 0")
    private Boolean isDeleted;

    private String country;

    private String noHaveGas;

    private String sugarCake;

    private String written;
    @Column(name = "date_write",columnDefinition = "DATE")
    private Date dateWriter;
    @ManyToOne
    @JoinColumn(name = "type_product_id")
    private TypeProduct typeProduct;
}
