package com.example.check.controller;

import com.example.check.model.Product;
import com.example.check.service.IProductService;
import com.example.check.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/check")
public class CheckController {
    @Autowired
    private IProductService iProductService;
    @Autowired
    private IProductTypeService iProductTypeService;

    @GetMapping("")
    public String home(){
        return "index";
    }
    @GetMapping("/product")
    public String showProduct(@PageableDefault(value = 5)Pageable pageable, @RequestParam Optional<String> searchName,Model model){
        String searchNameKey = searchName.orElse("");
        model.addAttribute("productList",this.iProductService.getAllProduct(pageable,searchNameKey));
        model.addAttribute("searchName",searchNameKey);
        model.addAttribute("view","product");
        return "product/list";
    }
    @GetMapping("/product/delete/{id}")
    public String deleteProduct(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        this.iProductService.deleteById(id);
        redirectAttributes.addFlashAttribute("message","Delete successful!");
        return "redirect:/check/product";
    }
    @GetMapping("/product/create")
    public String showCreate(Model model){
        model.addAttribute("product",new Product());
        model.addAttribute("productTypeList",this.iProductTypeService.getAllProductType());
        return "product/create";
    }
    @PostMapping("/product/save")
    public String createCustomer(@ModelAttribute Product product,Model model){
        iProductService.save(product);
        model.addAttribute("customer",new Product());
        model.addAttribute("message","Create successful!");
        return "product/create";
    }

}
