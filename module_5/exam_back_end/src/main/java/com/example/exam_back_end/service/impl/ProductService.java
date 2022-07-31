package com.example.exam_back_end.service.impl;

import com.example.exam_back_end.model.Product;
import com.example.exam_back_end.repository.IProductRepository;
import com.example.exam_back_end.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository iProductRepository;
    @Override
    public List<Product> getAllProduct() {
        return this.iProductRepository.findAll();
    }
}
