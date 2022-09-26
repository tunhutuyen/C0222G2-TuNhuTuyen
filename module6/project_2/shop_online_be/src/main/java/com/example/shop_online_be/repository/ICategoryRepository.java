package com.example.shop_online_be.repository;

import com.example.shop_online_be.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
