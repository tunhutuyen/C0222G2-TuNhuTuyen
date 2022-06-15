package service;

import model.Customer;
import model.CustomerType;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAllCustomer();

    boolean insertCustomer(Customer customer);

    Customer showCustomerEdit(int id);

    boolean updateCustomer(Customer customer);

    List<CustomerType> showCreateCustomer();

    List<Customer> searchByName(String name);


    boolean deleteCustomer(int id);
}
