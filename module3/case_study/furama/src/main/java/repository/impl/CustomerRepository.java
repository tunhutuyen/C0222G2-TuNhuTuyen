package repository.impl;

import model.Customer;
import model.CustomerType;
import repository.ConnectionDB;
import repository.ICustomerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private  final  String INSERT_CUSTOMER_NEW = " insert into khach_hang(ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi) values(?,?,?,?,?,?,?,?) ";
    private final String FIND_ALL = " select ma_khach_hang,ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi from khach_hang where status = 0 " ;
    private final String FIND_ALL_CUSTOMER_TYPE = " select ma_loai_khach, ten_loai_khach from loai_khach " ;
    private final String SELECT_CUSTOMER_TO_ID = " select ma_loai_khach,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi from khach_hang where ma_khach_hang = ? ";
    private final String UPDATE_CUSTOMER_BY_ID = " update khach_hang set ma_loai_khach = ? , ho_ten = ? , ngay_sinh = ? , gioi_tinh = ? , so_cmnd = ? , " +
            " so_dien_thoai = ? ,email = ? , dia_chi = ? where ma_khach_hang = ? ";
    private final String SELECT_BY_NAME = " select ma_khach_hang,ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi,ma_loai_khach from khach_hang where ho_ten like ? and `status` = 0";
    private final String DELETE_BY_ID = " update khach_hang set `status` = 1 where ma_khach_hang = ? ";

    @Override
    public List<Customer> findAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        try (Connection connection = new ConnectionDB().getConnectionJavaToDB()){
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idCustomer = resultSet.getInt("ma_khach_hang");
                int idCustomerType = resultSet.getInt("ma_loai_khach");
                String name = resultSet.getString("ho_ten");
                String date = resultSet.getString("ngay_sinh");
                int gender = resultSet.getInt("gioi_tinh");
                String idCard = resultSet.getString("so_cmnd");
                String numberPhone = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String address =resultSet.getString("dia_chi");
//                int status = resultSet.getInt("status");
                Customer customer = new Customer(idCustomer,name,date,gender,idCard,numberPhone,email,address,idCustomerType);
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean insertCusomer(Customer customer) {
        boolean checkExecute = false;
        try (Connection connection = new  ConnectionDB().getConnectionJavaToDB()){
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_NEW);
            preparedStatement.setInt(1,customer.getIdCustomerType());
            preparedStatement.setString(2,customer.getNameCustomer());
            preparedStatement.setString(3,customer.getBirthdayCustomer());
            preparedStatement.setInt(4,customer.getGenderCustomer());
            preparedStatement.setString(5,customer.getIdCardCustomer());
            preparedStatement.setString(6, customer.getPhoneCustomer());
            preparedStatement.setString(7,customer.getEmailCustomer());
            preparedStatement.setString(8,customer.getAddressCustomer());

            checkExecute = preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return checkExecute;
    }

    @Override
    public Customer showCustomerEdit(int id) {
        Customer customer = null;
        try (Connection connection = new ConnectionDB().getConnectionJavaToDB();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_TO_ID);){
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int idType = resultSet.getInt("ma_loai_khach");
                String name = resultSet.getString("ho_ten");
                String date = resultSet.getString("ngay_sinh");
                int gender = resultSet.getInt("gioi_tinh");
                String idCard = resultSet.getString("so_cmnd");
                String phone = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                customer= new Customer(id,name,date,gender,idCard,phone,email,address,idType);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        boolean rowUpdate = false;
        try (Connection connection = new ConnectionDB().getConnectionJavaToDB();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER_BY_ID)){
        preparedStatement.setInt(1,customer.getIdCustomerType());
        preparedStatement.setString(2,customer.getNameCustomer());
        preparedStatement.setString(3,customer.getBirthdayCustomer());
        preparedStatement.setInt(4,customer.getGenderCustomer());
        preparedStatement.setString(5,customer.getIdCardCustomer());
        preparedStatement.setString(6,customer.getPhoneCustomer());
        preparedStatement.setString(7,customer.getEmailCustomer());
        preparedStatement.setString(8,customer.getAddressCustomer());
        preparedStatement.setInt(9,customer.getIdCustomer());
        rowUpdate = preparedStatement.executeUpdate()>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdate;
    }

    @Override
    public List<CustomerType> showCreateCustomer() {
        List<CustomerType> customerTypes = new ArrayList<>();
        try (Connection connection = new ConnectionDB().getConnectionJavaToDB()){
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_ALL_CUSTOMER_TYPE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("ma_loai_khach");
                String nameType = resultSet.getString("ten_loai_khach");
                CustomerType customerType = new CustomerType(id,nameType);
                customerTypes.add(customerType);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerTypes;
    }

    @Override
    public List<Customer> searchByName(String name) {
        List<Customer> customers = new ArrayList<>();
        try (Connection connection = new ConnectionDB().getConnectionJavaToDB();){
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_NAME);
            preparedStatement.setString(1,"%"+name+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("ma_khach_hang");
                int idType = resultSet.getInt("ma_loai_khach");
                String nameCustomer = resultSet.getString("ho_ten");
                String date = resultSet.getString("ngay_sinh");
                int gender = resultSet.getInt("gioi_tinh");
                String idCard = resultSet.getString("so_cmnd");
                String phone = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                Customer customer = new Customer(id,nameCustomer,date,gender,idCard,phone,email,address,idType);
                customers.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customers;
    }

    @Override
    public boolean deleteCustomer(int id) {
        boolean checkDelete = false;
        try (Connection connection = new ConnectionDB().getConnectionJavaToDB();){
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID);
            preparedStatement.setInt(1,id);
            checkDelete = preparedStatement.executeUpdate()>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return checkDelete;
    }
}
