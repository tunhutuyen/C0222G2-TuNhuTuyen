package com.myself.repository;

import com.myself.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
}
