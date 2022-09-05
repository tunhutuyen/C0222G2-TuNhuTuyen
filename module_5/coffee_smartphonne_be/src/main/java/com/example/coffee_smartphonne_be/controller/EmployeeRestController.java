package com.example.coffee_smartphonne_be.controller;

import com.example.coffee_smartphonne_be.dto.IEmployeeDTO;
import com.example.coffee_smartphonne_be.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeRestController {
    @Autowired
    private IEmployeeService iEmployeeService;

    //create by TuyenTN
    @GetMapping("/list")
    public ResponseEntity<Page<IEmployeeDTO>> getAllEmployee(@PageableDefault(3) Pageable pageable,
                                                             Optional<String> searName,
                                                             Optional<String> searchPhone) {
        String searchByName = searName.orElse("");
        String searchByPhone = searchPhone.orElse("");
        if (searchByName.equals("null")) {
            searchByName = "";
        }
        if (searchByPhone.equals("null")) {
            searchByPhone = "";
        }
        Page<IEmployeeDTO> employeePage = this.iEmployeeService.getAllEmployee(pageable, searchByName, searchByPhone);
        System.out.println(employeePage);
        if (employeePage.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(employeePage, HttpStatus.OK);
    }

//    @GetMapping("/find/{id}")
//    public ResponseEntity<>

}
