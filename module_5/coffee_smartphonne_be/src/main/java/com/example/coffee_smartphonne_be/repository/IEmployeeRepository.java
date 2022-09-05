package com.example.coffee_smartphonne_be.repository;

import com.example.coffee_smartphonne_be.dto.IEmployeeDTO;
import com.example.coffee_smartphonne_be.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {

    // create by TuyenTN
    @Query(value = " select employee.id, employee.birthday,employee.`name`,employee.phone_number as phoneNumber " +
            ",position.name_position as position,employee.address, employee.gender, employee.salary, employee.image from employee " +
            " join position on employee.id_position = position.id_position" +
            " where employee.is_deleted=0 and employee.`name` like :keyZero and employee.phone_number like :keyOne",nativeQuery = true,
            countQuery = " select count(*) from (select employee.id, employee.birthday,employee.`name`,employee.phone_number as phoneNumber," +
                    "position.name_position as position,employee.address, employee.gender, employee.salary, employee.image " +
                    " from employee  join position on employee.id_position = position.id_position " +
                    " where employee.is_deleted = 0 and employee.`name` like :keyZero and employee.phone_number like :keyOne) temp_table ")
    Page<IEmployeeDTO> findAllEmployee(Pageable pageable, @Param("keyZero") String s,@Param("keyOne") String s1);
}
