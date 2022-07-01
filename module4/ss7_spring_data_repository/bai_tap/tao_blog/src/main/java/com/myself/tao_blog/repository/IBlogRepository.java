package com.myself.tao_blog.repository;

import com.myself.tao_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.swing.text.html.Option;
import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    @Query(value = " select * from blog ",nativeQuery = true)
    List<Blog> findAllBlog();

    @Query(value = " select * from blog where id = :keyword ",nativeQuery = true)
    Blog findByIdBlog(@Param("keyword") Integer id);

    @Query(value = " select * from blog where name_post like :keyFind ",nativeQuery = true,
            countQuery = " select count(*) from (select * from blog where name_post like :keyFind ) temp_table ")
    Page<Blog> getAllBlogByKeyword(@Param("keyFind") String keywordNew, Pageable pageable);

    @Query(value = " select id,content_post,date_of_create,name_post,status_blog,id_category from blog " +
            " where blog.id_category = :keyword and status_blog = 0 ",nativeQuery = true)
    List<Blog> getBlogByIdCategory(@Param("keyword") Integer id);
}
