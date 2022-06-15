package repository.impl;

import model.CustomerDTO;
import repository.ConnectDB;
import repository.ICustomerRepository;

import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private ConnectDB connectDB = new ConnectDB();

    @Override
    public List<CustomerDTO> findAllCustomer() {

        return null;
    }
}
