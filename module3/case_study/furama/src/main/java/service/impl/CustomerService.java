package service.impl;

import model.Customer;
import model.CustomerType;
import repository.ICustomerRepository;
import repository.impl.CustomerRepository;
import service.ICustomerService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository iCustomerRepository =new CustomerRepository();

    @Override
    public List<Customer> findAllCustomer() {
        return iCustomerRepository.findAllCustomer();
    }

    @Override
    public boolean insertCustomer(Customer customer) {
        return iCustomerRepository.insertCusomer(customer);
    }

    @Override
    public Customer showCustomerEdit(int id) {
        return iCustomerRepository.showCustomerEdit(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return iCustomerRepository.updateCustomer(customer);
    }

    @Override
    public List<CustomerType> showCreateCustomer() {
        return iCustomerRepository.showCreateCustomer();
    }

    @Override
    public List<Customer> searchByName(String name) {
        return iCustomerRepository.searchByName(name);
    }

    @Override
    public boolean deleteCustomer(int id) {
        return iCustomerRepository.deleteCustomer(id);
    }
//    @Override
//    public Map<String,String> insertCustomer()


}
