package com.myself.repository;

import com.myself.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
}
