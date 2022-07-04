package com.myself.tao_blog.service;

import com.myself.tao_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;
import java.util.Optional;

public interface IBlogService {
    List<Blog> findAllBlog();

    void save(Blog blogNew);

    Blog findByIdBlog(Integer id);

    void delete(Integer id);

    Page<Blog> getAllBlogByKeyword(String keywordNew, Pageable pageable);

    Optional<Blog> findByIdBlogRest(Integer id);

    List<Blog> getBlogByIdCategory(Integer id);

    Page<Blog> getAllBlog(String searchName, Pageable pageable);
}
