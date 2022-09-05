package com.example.coffee_smartphonne_be.service.Impl;

import com.example.coffee_smartphonne_be.dto.IEmployeeDTO;
import com.example.coffee_smartphonne_be.model.Employee;
import com.example.coffee_smartphonne_be.repository.IEmployeeRepository;
import com.example.coffee_smartphonne_be.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    @Override
    public Page<IEmployeeDTO> getAllEmployee(Pageable pageable, String searchByName, String searchByPhone) {
        return this.iEmployeeRepository.findAllEmployee(pageable,"%"+searchByName+"%","%"+searchByPhone+"%");
    }
}
