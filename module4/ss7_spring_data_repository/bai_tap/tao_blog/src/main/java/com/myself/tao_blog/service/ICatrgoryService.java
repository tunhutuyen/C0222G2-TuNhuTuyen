package com.myself.tao_blog.service;

import com.myself.tao_blog.model.Category;

import java.util.List;

public interface ICatrgoryService {
    List<Category> findAllCategory();

    Category findByIdCategory(Integer id);

    void delete(Integer id);

    void save(Category categoryNew);

}
