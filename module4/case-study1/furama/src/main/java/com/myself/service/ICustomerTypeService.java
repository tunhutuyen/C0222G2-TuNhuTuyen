package com.myself.service;

import com.myself.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICustomerTypeService{
    List<CustomerType> getAllCustomerType();
}
