package com.myself.service.impl;

import com.myself.model.Product;
import com.myself.repository.IProductRepository;
import com.myself.repository.impl.ProductRepository;
import com.myself.service.IProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProductService implements IProductService {

    private final IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void delete(int id) {
        iProductRepository.delete(id);
    }

    @Override
    public Product showEdit(int id) {
        return iProductRepository.showEdit(id);
    }

    @Override
    public void edit(Product product) {
        iProductRepository.edit(product);
    }

    @Override
    public List<Product> searchName(String byName) {
        return iProductRepository.searchName(byName);
    }

    @Override
    public Product findById(int id) {
        return iProductRepository.findById(id);
    }
//    @Override
//    public List<Product> findAll() {
//        return new ArrayList<>(productMap.values());
//    }
//
//    @Override
//    public void save(Product product) {
//        productMap.put(product.getId(),product);
//    }
//
//    @Override
//    public Product findById(int id) {
//        return productMap.get(id);
//    }
//
//    @Override
//    public void update(int id, Product product) {
//        productMap.put(id,product);
//    }
//
//    @Override
//    public void remove(int id) {
//        productMap.remove(id);
//    }
//
//    @Override
//    public List<Product> searchName(String byName) {
//        List<Product> products = new ArrayList<>();
//        for (Map.Entry<Integer,Product> entry: productMap.entrySet()){
//            if (entry.getValue().getName().contains(byName)){
//                products.add(entry.getValue());
//            }
//        }
//        return products;
//    }
}
