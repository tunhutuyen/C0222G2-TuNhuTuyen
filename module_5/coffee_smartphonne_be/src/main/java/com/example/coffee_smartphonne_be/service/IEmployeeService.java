package com.example.coffee_smartphonne_be.service;

import com.example.coffee_smartphonne_be.dto.IEmployeeDTO;
import com.example.coffee_smartphonne_be.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {
    Page<IEmployeeDTO> getAllEmployee(Pageable pageable, String searchByName, String searchByPhone);
}
