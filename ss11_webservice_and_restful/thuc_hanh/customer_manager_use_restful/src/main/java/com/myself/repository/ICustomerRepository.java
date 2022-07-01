package com.myself.repository;

import com.myself.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
