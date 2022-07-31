package com.example.exam_back_end.repository;

import com.example.exam_back_end.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Integer> {
}
