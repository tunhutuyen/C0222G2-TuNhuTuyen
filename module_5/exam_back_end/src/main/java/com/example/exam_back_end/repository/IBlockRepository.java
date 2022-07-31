package com.example.exam_back_end.repository;

import com.example.exam_back_end.model.Block;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBlockRepository extends JpaRepository<Block,Integer> {
    @Query(value = " select block.* from block join product on block.id_product = product.id " +
            " where product.name like :keyword ",nativeQuery = true,
    countQuery = " select count(*) from (select block.* from block join product on block.id_product = product.id " +
            " where product.name like :keyword ) temp ")
    Page<Block> getAllBlock(Pageable pageable,@Param("keyword") String productName);
}
