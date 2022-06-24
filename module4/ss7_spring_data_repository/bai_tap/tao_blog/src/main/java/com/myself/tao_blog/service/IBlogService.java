package com.myself.tao_blog.service;

import com.myself.tao_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface IBlogService {
    List<Blog> findAllBlog();

    void save(Blog blogNew);

    Blog findByIdBlog(Integer id);

    void delete(Integer id);

    Page<Blog> getAllBlogByKeyword(String keywordNew, Pageable pageable);
}
