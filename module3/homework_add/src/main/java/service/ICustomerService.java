package service;

import model.CustomerDTO;

import java.util.List;

public interface ICustomerService {
    List<CustomerDTO> findAllCustomer();
}
