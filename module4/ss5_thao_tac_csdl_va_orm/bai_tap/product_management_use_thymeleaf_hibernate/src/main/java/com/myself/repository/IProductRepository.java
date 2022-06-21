package com.myself.repository;

import com.myself.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    void save(Product music);

    void delete(int id);

    Product showEdit(int id);


    void edit(Product music);

    Product findById(int id);

    List<Product> searchName(String byName);
}
