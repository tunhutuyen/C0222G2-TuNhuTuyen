package com.example.check.service.impl;

import com.example.check.model.ProductType;
import com.example.check.reposility.IProductTypeRepository;
import com.example.check.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService implements IProductTypeService {
    @Autowired
    private IProductTypeRepository iProductTypeRepository;

    @Override
    public List<ProductType> getAllProductType() {
        return this.iProductTypeRepository.findAll();
    }
}
