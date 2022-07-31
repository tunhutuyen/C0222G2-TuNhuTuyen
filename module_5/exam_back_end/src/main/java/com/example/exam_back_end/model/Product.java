package com.example.exam_back_end.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String country;
    private Integer cost;
    private String amount;
    @OneToMany(mappedBy = "product")
    @JsonBackReference
    private List<Block> blockList;

    public Product() {
    }

    public Product(Integer id, String name, String country, Integer cost, String amount, List<Block> blockList) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.cost = cost;
        this.amount = amount;
        this.blockList = blockList;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public List<Block> getBlockList() {
        return blockList;
    }

    public void setBlockList(List<Block> blockList) {
        this.blockList = blockList;
    }
}
