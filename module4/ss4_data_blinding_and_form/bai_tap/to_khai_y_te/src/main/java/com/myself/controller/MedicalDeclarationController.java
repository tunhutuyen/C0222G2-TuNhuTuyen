package com.myself.controller;

import com.myself.model.MedicalDeclaration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/declaration")
public class MedicalDeclarationController {

    @GetMapping(value = "/")
    public String home(Model model){
        model.addAttribute("declaration",new MedicalDeclaration());
        return "view";
    }
    @PostMapping(value = "/create")
    public String createDeclaration(@ModelAttribute MedicalDeclaration declaration,Model model){
        model.addAttribute("declarationNew",declaration);
        return "list";
    }
}
