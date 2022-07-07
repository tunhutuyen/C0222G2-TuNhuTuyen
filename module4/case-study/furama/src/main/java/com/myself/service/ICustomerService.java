package com.myself.service;

import com.myself.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> findAllCustomer(Pageable pageable, String searchNameKey);

    void save(Customer customer);

    void deleteById(Integer id);

    Customer findCustomerById(Integer id);
}
