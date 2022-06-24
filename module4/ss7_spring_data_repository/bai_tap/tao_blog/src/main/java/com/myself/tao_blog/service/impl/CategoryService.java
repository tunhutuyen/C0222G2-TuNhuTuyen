package com.myself.tao_blog.service.impl;

import com.myself.tao_blog.model.Category;
import com.myself.tao_blog.repository.ICategoryRepository;
import com.myself.tao_blog.service.ICatrgoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICatrgoryService {

    @Autowired
    private ICategoryRepository iCategoryRepository;

    @Override
    public List<Category> findAllCategory() {
        return iCategoryRepository.findAllCategory();
    }

    @Override
    public Category findByIdCategory(Integer id) {
        return this.iCategoryRepository.findByIdCategory(id);
    }

    @Override
    public void delete(Integer id) {
        this.iCategoryRepository.deleteByIdCategory(id);
    }

    @Override
    public void save(Category categoryNew) {
        this.iCategoryRepository.save(categoryNew);
    }
}
