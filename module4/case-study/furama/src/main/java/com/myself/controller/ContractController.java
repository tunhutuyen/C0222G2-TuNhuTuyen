package com.myself.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/furama")
public class ContractController {

    @GetMapping("/contract")
    public String home(Model model){
        model.addAttribute("view","contract");
        return "contract/list";
    }
}
