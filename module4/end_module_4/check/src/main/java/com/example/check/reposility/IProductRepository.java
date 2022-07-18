package com.example.check.reposility;

import com.example.check.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IProductRepository extends JpaRepository<Product,Integer> {
    @Query(value = " select * from product where name_product like :keyword ",
            countQuery = " select count(*) from( select * from product where name_product like :keyword ) temp_table ",nativeQuery = true)
    Page<Product> getAllProduct(Pageable pageable,@Param("keyword") String searchNameKey);
}
