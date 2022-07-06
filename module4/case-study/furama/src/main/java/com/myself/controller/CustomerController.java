package com.myself.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/furama")
public class CustomerController {
    @GetMapping("")
    public String home(){
        return "/index";
    }
//    @GetMapping("/service")
//    public String showServiceList(@PageableDefault(value = 5) Pageable pageable,
//                                  @RequestParam Optional<String> searchName, Model model){
//        String searchNameKey = searchName.orElse("");
//
//    }
    @GetMapping("/service")
    public String testService(){
        return "service/list";
    }
}
