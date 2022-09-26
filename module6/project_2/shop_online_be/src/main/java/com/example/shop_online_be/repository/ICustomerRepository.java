package com.example.shop_online_be.repository;

import com.example.shop_online_be.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    @Query(value = "select c.* from customer c join app_user u on c.user_id = u.id where u.user_name = :userName",nativeQuery = true)
    Customer getCustomerByUserName(@Param("userName")String userName);

    @Query(value = "select c.* from customer c " +
            " join app_user u on c.user_id = u.id where c.is_deleted = 0 "
            ,countQuery = "select count(*) from (select c.* from customer c" +
            " join app_user u on c.user_id = u.id " +
            " where c.is_deleted = 0 ) temp_table ",nativeQuery = true)
    Page<Customer> findAllCustomer(Pageable pageable);
}
