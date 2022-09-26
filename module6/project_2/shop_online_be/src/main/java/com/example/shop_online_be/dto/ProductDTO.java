package com.example.shop_online_be.dto;

import com.example.shop_online_be.model.Category;
import lombok.Data;

import java.util.Date;

@Data
public class ProductDTO {
    private Integer id;
    private String image;
    private String name;
    private Date dateIn;
    private double price;
    private String manufacturer;
    private String guaranteeTime;
    private String discount;
    private Integer quantity;
    private String specification;
    private String description;
    private Category category;
    private Boolean isDeleted;
}

