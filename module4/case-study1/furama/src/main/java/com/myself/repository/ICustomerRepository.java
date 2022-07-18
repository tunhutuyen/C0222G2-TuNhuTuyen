package com.myself.repository;

import com.myself.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
    @Query(value = " select * from customer where name_customer like :keyword ",
            countQuery = " select count(*) from ( select * from customer where name_customer like :keyword ) temp_table ",nativeQuery = true)
    Page<Customer> findAllCustomer(Pageable pageable,@Param("keyword") String searchNameKey);

    @Query(value = " select * from customer where id_customer = :keyword1 ",nativeQuery = true)
    Customer findCustomerById(@Param("keyword1") Integer id);
}
