package repository;

import model.CustomerDTO;

import java.util.List;

public interface ICustomerRepository {
    List<CustomerDTO> findAllCustomer();
}
