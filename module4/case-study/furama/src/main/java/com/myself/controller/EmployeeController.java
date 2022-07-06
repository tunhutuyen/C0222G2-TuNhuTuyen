package com.myself.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/furama")
public class EmployeeController {

    @GetMapping("/employee")
    public String home(Model model){
        model.addAttribute("view","employee");
        return "employee/list";
    }
}
