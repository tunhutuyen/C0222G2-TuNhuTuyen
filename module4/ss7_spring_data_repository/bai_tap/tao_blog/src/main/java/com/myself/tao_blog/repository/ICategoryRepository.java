package com.myself.tao_blog.repository;

import com.myself.tao_blog.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {

    @Query(value = " select * from category where status_category = 0 ",nativeQuery = true)
    List<Category> findAllCategory();

    @Query(value = " select * from category where id = :keyword and status_category = 0 ",nativeQuery = true)
    Category findByIdCategory(@Param("keyword") Integer id);

    @Modifying
    @Transactional
    @Query(value = " update category set status_category = 1 where id = :keyword ",nativeQuery = true)
    void deleteByIdCategory(@Param("keyword") Integer id);

//    @Modifying
//    @Transactional
//    @Query(value = " delete from category  " +
//            " where id = :id ", nativeQuery = true)
//    void deleteByIdCategory(@Param("id") int id);
}
