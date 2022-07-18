package com.example.check.service;

import com.example.check.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> getAllProduct(Pageable pageable, String searchNameKey);

    void deleteById(Integer id);

    void save(Product product);
}
