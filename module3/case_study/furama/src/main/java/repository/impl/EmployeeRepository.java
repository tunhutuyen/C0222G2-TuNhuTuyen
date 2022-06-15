package repository.impl;

import model.*;
import repository.ConnectionDB;
import repository.IEmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//ma_nhan_vien INT primary key auto_increment,
//        ho_ten varchar(50) NOT NULL,
//        ngay_sinh varchar(50) NOT NULL,
//        so_cmnd varchar(50) NOT NULL,
//        luong double NOT NULL,
//        so_dien_thoai varchar(50) NOT NULL,
//        email varchar(50),
//        dia_chi varchar(50),
//        ma_vi_tri int NOT NULL,
//        ma_trinh_do int NOT NULL,            trinh_do.ten_trinh_do
//        ma_bo_phan int NOT NULL,                      bo_phan.ten_bo_phan
//        `status` int default 0,                       vi_tri.ten_vi_tri
//        foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
//        foreign key(ma_bo_phan) references bo_phan(ma_bo_phan),
//        foreign key(ma_vi_tri) references vi_tri(ma_vi_tri));

public class EmployeeRepository implements IEmployeeRepository {
    private ConnectionDB connectionDB = new ConnectionDB();
    private final String SELECT_LIST_EMPLOYEE_DTO = " select nhan_vien.ma_nhan_vien,nhan_vien.ho_ten,nhan_vien.ngay_sinh," +
            " nhan_vien.so_cmnd,nhan_vien.luong,nhan_vien.so_dien_thoai,nhan_vien.email,nhan_vien.dia_chi,vi_tri.ten_vi_tri, " +
            " trinh_do.ten_trinh_do,bo_phan.ten_bo_phan from nhan_vien " +
            " join trinh_do on trinh_do.ma_trinh_do = nhan_vien.ma_trinh_do " +
            " join vi_tri on vi_tri.ma_vi_tri = nhan_vien.ma_vi_tri " +
            " join bo_phan on bo_phan.ma_bo_phan = nhan_vien.ma_bo_phan where nhan_vien.status =0 ";
    private final String SELECT_LIST_POSITION = " select * from vi_tri ";
    private final String SELECT_LIST_DEGREE = " select * from trinh_do ";
    private final String SELECT_LIST_DIVISION = " select * from bo_phan ";
    private final String INSERT_EMPLOYEE_NEW = " insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,email,dia_chi, " +
            " ma_vi_tri,ma_trinh_do,ma_bo_phan) values(?,?,?,?,?,?,?,?,?,?) ";
    private final String SEARCH_BY_NAME = " select nhan_vien.ma_nhan_vien,nhan_vien.ho_ten,nhan_vien.ngay_sinh, " +
            " nhan_vien.so_cmnd,nhan_vien.luong,nhan_vien.so_dien_thoai,nhan_vien.email,nhan_vien.dia_chi,vi_tri.ten_vi_tri, " +
            " trinh_do.ten_trinh_do,bo_phan.ten_bo_phan from nhan_vien " +
            " join trinh_do on trinh_do.ma_trinh_do = nhan_vien.ma_trinh_do " +
            " join vi_tri on vi_tri.ma_vi_tri = nhan_vien.ma_vi_tri " +
            " join bo_phan on bo_phan.ma_bo_phan = nhan_vien.ma_bo_phan where nhan_vien.ho_ten like ? and nhan_vien.status =0 ";
    private final String SELECT_EMPLOYEE_BY_ID = " select ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,email, " +
            " dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan from nhan_vien where ma_nhan_vien = ? and status =0 ";
    private final String UPDATE_EMPLOYEE_BY_ID = " update nhan_vien set ho_ten= ?,ngay_sinh = ?,so_cmnd =? ,luong =? ,so_dien_thoai =?, " +
            " email =? ,dia_chi =? , ma_vi_tri=?,ma_trinh_do =?,ma_bo_phan=? where ma_nhan_vien = ? ";
    private final String DELETE_BY_ID = " update nhan_vien set `status` = 1 where ma_nhan_vien = ?";

    @Override
    public List<EmployeeDTO> findAllEmployee() {
        List<EmployeeDTO> employeeDTOS = new ArrayList<>();
        try (Connection connection = this.connectionDB.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_LIST_EMPLOYEE_DTO);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("ma_nhan_vien");
                String name = resultSet.getString("ho_ten");
                String date = resultSet.getString("ngay_sinh");
                String card = resultSet.getString("so_cmnd");
                Double salary = resultSet.getDouble("luong");
                String phone = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                String position = resultSet.getString("ten_vi_tri");
                String degree = resultSet.getString("ten_trinh_do");
                String division = resultSet.getString("ten_bo_phan");
                EmployeeDTO employeeDTO = new EmployeeDTO(id,name,date,card,salary,phone,email,address,position,degree,division);
                employeeDTOS.add(employeeDTO);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeDTOS;
    }

    @Override
    public List<Division> showDivision() {
        List<Division> divisions = new ArrayList<>();
        try (Connection connection = this.connectionDB.getConnectionJavaToDB();){
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_LIST_DIVISION);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("ma_bo_phan");
                String name = resultSet.getString("ten_bo_phan");
                divisions.add(new Division(id,name));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return divisions;
    }

    @Override
    public List<Position> showPosition() {
        List<Position> positions = new ArrayList<>();
        try (Connection connection = this.connectionDB.getConnectionJavaToDB();){
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_LIST_POSITION);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("ma_vi_tri");
                String name = resultSet.getString("ten_vi_tri");
                positions.add(new Position(id,name));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return positions;
    }

    @Override
    public List<EducationDegree> showEducationDegree() {
        List<EducationDegree> educationDegrees = new ArrayList<>();
        try (Connection connection = this.connectionDB.getConnectionJavaToDB();){
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_LIST_DEGREE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("ma_trinh_do");
                String name = resultSet.getString("ten_trinh_do");
                educationDegrees.add(new EducationDegree(id,name));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return educationDegrees;
    }
    @Override
    public boolean createEmployee(Employee employee) {
        boolean checkEmployee = false;
        try (Connection connection = this.connectionDB.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE_NEW);
            preparedStatement.setString(1,employee.getNameEmployee());
            preparedStatement.setString(2,employee.getDateOfBirthEmployee());
            preparedStatement.setString(3,employee.getIdCardEmployee());
            preparedStatement.setDouble(4,employee.getSalaryEmployee());
            preparedStatement.setString(5, employee.getNumberPhoneEmployee());
            preparedStatement.setString(6, employee.getEmailEmployee());
            preparedStatement.setString(7, employee.getAddressEmployee());
            preparedStatement.setInt(8,employee.getIdPosition());
            preparedStatement.setInt(9,employee.getIdDegree());
            preparedStatement.setInt(10,employee.getIdDivision());
            checkEmployee = preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return checkEmployee;
    }

    @Override
    public List<EmployeeDTO> showSearch(String name) {

        List<EmployeeDTO> employees = new ArrayList<>();
        try (Connection connection = this.connectionDB.getConnectionJavaToDB()){
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BY_NAME);
            preparedStatement.setString(1,"%"+name+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer id = resultSet.getInt("ma_nhan_vien");
                String nameDTO = resultSet.getString("ho_ten");
                String date = resultSet.getString("ngay_sinh");
                String card = resultSet.getString("so_cmnd");
                Double salary = resultSet.getDouble("luong");
                String phone = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                String position = resultSet.getString("ten_vi_tri");
                String degree = resultSet.getString("ten_trinh_do");
                String division = resultSet.getString("ten_bo_phan");
                EmployeeDTO employeeDTO = new EmployeeDTO(id,nameDTO,date,card,salary,phone,email,address,position,degree,division);
                employees.add(employeeDTO);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employees;
    }

    @Override
    public Employee showEmployEdit(Integer id) {
        Employee employee = null;
        try (Connection connection = this.connectionDB.getConnectionJavaToDB();){
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("ho_ten");
                String date = resultSet.getString("ngay_sinh");
                String card = resultSet.getString("so_cmnd");
                Double salary = resultSet.getDouble("luong");
                String phone = resultSet.getString("so_dien_thoai");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                Integer position = Integer.parseInt(resultSet.getString("ma_vi_tri"));
                Integer degree = Integer.parseInt(resultSet.getString("ma_trinh_do"));
                Integer division = Integer.parseInt(resultSet.getString("ma_bo_phan"));
                employee = new Employee(id,name,date,card,salary,phone,email,address,position,degree,division);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;
    }

    @Override
    public boolean editEmployee(Employee employee) {
        boolean checkEmployee = false;
        try (Connection connection = this.connectionDB.getConnectionJavaToDB()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE_BY_ID);
            preparedStatement.setString(1,employee.getNameEmployee());
            preparedStatement.setString(2,employee.getDateOfBirthEmployee());
            preparedStatement.setString(3,employee.getIdCardEmployee());
            preparedStatement.setDouble(4,employee.getSalaryEmployee());
            preparedStatement.setString(5, employee.getNumberPhoneEmployee());
            preparedStatement.setString(6, employee.getEmailEmployee());
            preparedStatement.setString(7, employee.getAddressEmployee());
            preparedStatement.setInt(8,employee.getIdPosition());
            preparedStatement.setInt(9,employee.getIdDegree());
            preparedStatement.setInt(10,employee.getIdDivision());
            preparedStatement.setInt(11,employee.getIdEmployee());
            checkEmployee = preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return checkEmployee;
    }

    @Override
    public boolean deleteEmployee(Integer id) {
        boolean checkEmployee = false;
        try (Connection connection = this.connectionDB.getConnectionJavaToDB();){
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID);
            preparedStatement.setInt(1,id);
            checkEmployee = preparedStatement.executeUpdate()>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return checkEmployee;
    }
}
