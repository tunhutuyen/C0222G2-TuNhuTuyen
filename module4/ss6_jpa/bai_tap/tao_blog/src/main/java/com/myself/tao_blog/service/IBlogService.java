package com.myself.tao_blog.service;

import com.myself.tao_blog.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAllBlog();

    void save(Blog blogNew);

    Blog findByIdBlog(Integer id);

    void delete(Integer id);
}
