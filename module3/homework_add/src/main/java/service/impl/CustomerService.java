package service.impl;

import model.CustomerDTO;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public List<CustomerDTO> findAllCustomer() {
        return iCustomerRepository.findAllCustomer();
    }
}
