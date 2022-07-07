package com.myself.service.impl;

import com.myself.model.Customer;
import com.myself.repository.ICustomerRepository;
import com.myself.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;
    @Override
    public Page<Customer> findAllCustomer(Pageable pageable, String searchNameKey) {
        return this.iCustomerRepository.findAllCustomer(pageable,"%"+searchNameKey+"%");
    }

    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public void deleteById(Integer id) {
        this.iCustomerRepository.deleteById(id);
    }

    @Override
    public Customer findCustomerById(Integer id) {
        return this.iCustomerRepository.findCustomerById(id);
    }
}
