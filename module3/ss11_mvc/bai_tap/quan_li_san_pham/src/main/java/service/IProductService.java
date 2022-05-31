package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();


    void save(Product product);

    Product findProduct(Integer id);

    void update(Product product);
}
