package com.myself.service;

import com.myself.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Object findById(int id);

    void update(int id, Product product);

    void remove(int id);
}
