package repository.impl;

import model.Product;
import repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1,"máy tính",2500000F,"Hàng mới","DiaLak"));
        products.add(new Product(2,"Điện Thoại",2500000F,"Hàng mới","Sam Sung"));
        products.add(new Product(3,"Máy điều hòa",2500000F,"Hàng mới","Electronic"));
        products.add(new Product(4,"Ô tô",2500000F,"Hàng mới","Toyota"));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findProduct(Integer id) {
        return products.get(id);
    }

    @Override
    public void update(Product product) {
        products.add(product);
    }
}
