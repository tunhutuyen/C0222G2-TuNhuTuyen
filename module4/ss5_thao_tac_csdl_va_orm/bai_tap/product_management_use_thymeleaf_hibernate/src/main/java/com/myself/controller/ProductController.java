package com.myself.controller;


import com.myself.model.Product;
import com.myself.service.IProductService;
import com.myself.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping(value = "")
    public String home(Model model){
        List<Product> productList = iProductService.findAll();
        model.addAttribute("productList",productList);
        return "/index";
    }
    @GetMapping("/create")
    public  String showCreate(Model model){
        model.addAttribute("productList",new Product());
        return "/create";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id){
        iProductService.delete(id);
        return "redirect:/product";
    }
    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id,Model model){
        model.addAttribute("productShow",iProductService.showEdit(id));

        return "/edit";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/view";
    }
    @GetMapping("/searchName")
    public String searchName(@RequestParam String byName, Model model){
        model.addAttribute("productList",iProductService.searchName(byName));
        model.addAttribute("nameKey",byName);
        return "/index";
    }

    @PostMapping("/save")
    public String save(Product product,RedirectAttributes redirectAttributes) {
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("message","Create successful");
        return "redirect:/product";
    }
    @PostMapping("/edit")
    public String update(Product product, RedirectAttributes redirectAttributes) {
        iProductService.edit(product);
        redirectAttributes.addFlashAttribute("message","Edit successful");
        return "redirect:/product";
    }
    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        iProductService.delete(product.getId());
        redirect.addFlashAttribute("message", "Removed product successfully!");
        return "redirect:/product";
    }
}
