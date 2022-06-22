package com.myself.tao_blog.repository;

import com.myself.tao_blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    @Query(value = " select * from blog ",nativeQuery = true)
    List<Blog> findAllBlog();

    @Query(value = " select * from blog where id = :keyword ",nativeQuery = true)
    Blog findByIdBlog(@Param("keyword") Integer id);
}
