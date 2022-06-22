package com.myself.tao_blog.service.impl;

import com.myself.tao_blog.model.Blog;
import com.myself.tao_blog.repository.IBlogRepository;
import com.myself.tao_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository iBlogRepository;


    @Override
    public List<Blog> findAllBlog() {
        return this.iBlogRepository.findAllBlog();
    }

    @Override
    public void save(Blog blogNew) {
        this.iBlogRepository.save(blogNew);
    }

    @Override
    public Blog findByIdBlog(Integer id) {
        return this.iBlogRepository.findByIdBlog(id);
    }

    @Override
    public void delete(Integer id) {
        iBlogRepository.deleteById(id);
    }
}
