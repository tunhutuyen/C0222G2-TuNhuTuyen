package com.myself.service.impl;

import com.myself.model.Product;
import com.myself.service.IProductService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ProductService implements IProductService {
    private static final Map<Integer,Product> productMap= new HashMap<>();
    static {
        productMap.put(1,new Product(1,"banh my",10000,"ngon,bo,re","vietnamese"));
        productMap.put(2,new Product(2,"dau goi",25000,"ngon,bo,re","chinese"));
        productMap.put(3,new Product(3,"pho",30000,"ngon,bo,re","vietnamese"));
        productMap.put(4,new Product(4,"ca",12000,"ngon,bo,re","japanese"));
        productMap.put(5,new Product(5,"thit bo",21000,"ngon,bo,re","korea"));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    @Override
    public void remove(int id) {
        productMap.remove(id);
    }

    @Override
    public List<Product> searchName(String byName) {
        List<Product> products = new ArrayList<>();
        for (Map.Entry<Integer,Product> entry: productMap.entrySet()){
            if (entry.getValue().getName().contains(byName)){
                products.add(entry.getValue());
            }
        }
        return products;
    }
}
