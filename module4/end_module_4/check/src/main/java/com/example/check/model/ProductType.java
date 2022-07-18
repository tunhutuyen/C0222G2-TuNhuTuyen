package com.example.check.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product_type")
public class ProductType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idType;
    private String nameType;
    @OneToMany(mappedBy = "productType")
    @JsonBackReference
    private List<Product> productList;

    public ProductType() {
    }

    public ProductType(Integer idType, String nameType, List<Product> productList) {
        this.idType = idType;
        this.nameType = nameType;
        this.productList = productList;
    }

    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
