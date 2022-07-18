package com.myself.controller;

import com.myself.model.Customer;
import com.myself.model.CustomerType;
import com.myself.service.ICustomerService;
import com.myself.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/furama")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private ICustomerTypeService iCustomerTypeService;

    @GetMapping("/customer")
    public String home(@PageableDefault(value = 5) Pageable pageable, @RequestParam Optional<String> searchName , Model model){
        String searchNameKey = searchName.orElse("");
        model.addAttribute("customerList",this.iCustomerService.findAllCustomer(pageable,searchNameKey));
        model.addAttribute("searchName",searchNameKey);
        model.addAttribute("view","customer");
        return "customer/list";
    }
    @GetMapping("/customer/create")
    public String showCreate(Model model){
        model.addAttribute("customer",new Customer());
        model.addAttribute("customerTypeList",this.iCustomerTypeService.getAllCustomerType());
        return "customer/create";
    }
    @GetMapping("/customer/delete/{id}")
    public String deleteCustomer(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        this.iCustomerService.deleteById(id);
        redirectAttributes.addFlashAttribute("message","Delete successful!");
        return "redirect:/furama/customer";
    }
    @GetMapping("/customer/edit/{id}")
    public String showEdit(@PathVariable Integer id, Model model){
        Customer customer = this.iCustomerService.findCustomerById(id);
        model.addAttribute("customerTypeList",this.iCustomerTypeService.getAllCustomerType());
        model.addAttribute("customer",customer);
        return "customer/edit";
    }
    @PostMapping("/customer/save")
    public String createCustomer(@ModelAttribute Customer customer,Model model){
        iCustomerService.save(customer);
        model.addAttribute("customer",new Customer());
        model.addAttribute("message","Create successful!");
        return "customer/create";
    }
    @PostMapping("/customer/update")
    public String updateCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes){
        iCustomerService.save(customer);
        redirectAttributes.addFlashAttribute("message","Edit successful!!!");
        return "redirect:/furama/customer";
    }
}
