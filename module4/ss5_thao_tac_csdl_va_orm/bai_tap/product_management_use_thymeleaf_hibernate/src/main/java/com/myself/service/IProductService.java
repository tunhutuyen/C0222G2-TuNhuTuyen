package com.myself.service;

import com.myself.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product music);

    void delete(int id);

    Product showEdit(int id);


    void edit(Product product);
    List<Product> searchName(String byName);

    Product findById(int id);
}
