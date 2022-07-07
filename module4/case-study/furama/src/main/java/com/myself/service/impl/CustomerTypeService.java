package com.myself.service.impl;

import com.myself.model.CustomerType;
import com.myself.repository.ICustomerTypeRepository;
import com.myself.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeService implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository iCustomerTypeRepository;
    @Override
    public List<CustomerType> getAllCustomerType() {
        return this.iCustomerTypeRepository.findAll();
    }
}
