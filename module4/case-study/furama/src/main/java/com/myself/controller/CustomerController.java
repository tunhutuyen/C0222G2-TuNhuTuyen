package com.myself.controller;

import com.myself.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/furama")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/customer")
    public String home(Model model){
        model.addAttribute("view","customer");
        return "customer/list";
    }
    @GetMapping("/customer/create")
    public String showCreate(){
        return "customer/create";
    }
    @GetMapping("/customer/edit")
    public String showEdit(){
        return "customer/edit";
    }
}
