package com.example.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

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

    private Boolean is_deleted;

    private String country;

    private String noHaveGas;

    private String sugarCake;

    private String written;
    @ManyToOne
    @JoinColumn(name = "type_product_id",referencedColumnName = "id")
    private TypeProduct typeProduct;
    private String dateWriter;
}








