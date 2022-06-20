package com.myself.controller;


import com.myself.model.Product;
import com.myself.service.IProductService;
import com.myself.service.impl.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    private final IProductService iProductService = new ProductService();

    @GetMapping(value = "")
    public String home(Model model){
        List<Product> products = iProductService.findAll();
        model.addAttribute("products",products);
        return "/index";
    }

    @GetMapping(value = "/create")
    public String create(Model model){
        model.addAttribute("product",new Product());
        return "/create";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/edit";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/delete";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/view";
    }
    @PostMapping("/save")
    public String save(Product product,RedirectAttributes redirectAttributes) {
        product.setId((int) (Math.random() * 10000));
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("message","Create successful");
        return "redirect:/product";
    }
    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirectAttributes) {
        iProductService.update(product.getId(), product);
        redirectAttributes.addFlashAttribute("message","Edit successful");
        return "redirect:/product";
    }
    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        iProductService.remove(product.getId());
        redirect.addFlashAttribute("message", "Removed product successfully!");
        return "redirect:/product";
    }
}
