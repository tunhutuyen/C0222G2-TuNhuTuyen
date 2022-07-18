package com.example.check.service.impl;

import com.example.check.model.Product;
import com.example.check.reposility.IProductRepository;
import com.example.check.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;
    @Override
    public Page<Product> getAllProduct(Pageable pageable, String searchNameKey) {
        return this.iProductRepository.getAllProduct(pageable,"%"+searchNameKey+"%");
    }

    @Override
    public void deleteById(Integer id) {
        this.iProductRepository.deleteById(id);
    }

    @Override
    public void save(Product product) {
        this.iProductRepository.save(product);
    }
}
