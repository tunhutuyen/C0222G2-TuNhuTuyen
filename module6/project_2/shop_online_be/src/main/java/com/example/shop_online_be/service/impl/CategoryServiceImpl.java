package com.example.shop_online_be.service.impl;

import com.example.shop_online_be.model.Category;
import com.example.shop_online_be.repository.ICategoryRepository;
import com.example.shop_online_be.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> getAllCategory() {
        return iCategoryRepository.findAll();
    }
}
