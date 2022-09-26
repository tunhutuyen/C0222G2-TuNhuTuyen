package com.example.shop_online_be.service;

import com.example.shop_online_be.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Boolean deleteProduct(String id);

    Product findById(Integer id);

    void save(Product product);

    List<Product> getSmartPhone();

    List<Product> getLaptop();

    List<Product> getNewProducts();

    List<Product> findAll();

    Page<Product> getAllProduct(Pageable pageable,String searchByCategory, String searchByName, String searchByOrigin, String searchByStartPrice,String searchByEndPrice);
}
