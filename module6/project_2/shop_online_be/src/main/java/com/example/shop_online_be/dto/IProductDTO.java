package com.example.shop_online_be.dto;

public interface IProductDTO {
    Integer getId();
    String getName();
    String getImage();
    Double getPrice();
    String getManufacturer();
    Integer getQuantity();
    String getDateIn();
    String getGuaranteeTime();
    String getDiscount();
    String getSpecification();
    String getDescription();
    Boolean getIsDeleted();
    Integer getCategory();
}
