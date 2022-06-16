package com.myself.controller;

import com.myself.service.ISandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {

    @Autowired
    private ISandwichService iSandwichService;

    @GetMapping(value = "/")
    public String viewForm(){
        return "index";
    }

    @RequestMapping("/sandwich")
    public String save(@RequestParam("spice") String[] spice, Model model) {
        model.addAttribute("spice",spice);
        return "index";
    }

}
