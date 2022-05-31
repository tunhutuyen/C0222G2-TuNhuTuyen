package service.impl;

import model.Product;
import repository.IProductRepository;
import repository.impl.ProductRepository;
import service.IProductService;

import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> getAll() {
        return iProductRepository.getAll();
    }

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }

    @Override
    public Product findProduct(Integer id) {
        return this.iProductRepository.findProduct(id);
    }

    @Override
    public void update(Product product) {
        this.iProductRepository.update(product);
    }
}
