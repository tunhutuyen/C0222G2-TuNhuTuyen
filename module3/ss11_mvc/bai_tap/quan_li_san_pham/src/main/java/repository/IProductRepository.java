package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> getAll();


    void save(Product product);

    Product findProduct(Integer id);

    void update(Product product);
}
