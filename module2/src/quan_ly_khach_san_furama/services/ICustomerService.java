package quan_ly_khach_san_furama.services;

import quan_ly_khach_san_furama.models.person.Customer;

public interface ICustomerService extends IPersonService<Customer>{
    void deleteCustomer();
}
