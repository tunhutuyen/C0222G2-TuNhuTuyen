package com.example.check.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_product")
    private String name;
    private Double price;
    private String statusProduct;
    @ManyToOne
    @JoinColumn(name = "id_type")
    private ProductType productType;

    public Product() {
    }

    public Product(Integer id, String name, Double price, String statusProduct, ProductType productType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.statusProduct = statusProduct;
        this.productType = productType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(String statusProduct) {
        this.statusProduct = statusProduct;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
