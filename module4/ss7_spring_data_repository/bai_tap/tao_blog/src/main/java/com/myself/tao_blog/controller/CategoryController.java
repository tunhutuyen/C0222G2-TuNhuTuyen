package com.myself.tao_blog.controller;


import com.myself.tao_blog.model.Category;
import com.myself.tao_blog.service.ICatrgoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;


@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICatrgoryService iCatrgoryService;

    @GetMapping("")
    public String home(Model model){
        List<Category> categoryList = iCatrgoryService.findAllCategory();
        model.addAttribute("categoryList",categoryList);
        return "category/list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("categoryNew",new Category());
        return "category/create";
    }
    @GetMapping("{id}/edit")
    public String findByIdCategory(@PathVariable Integer id, Model model){
        model.addAttribute("categoryNew",iCatrgoryService.findByIdCategory(id));
        return "category/edit";
    }
    @GetMapping("{id}/delete")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        this.iCatrgoryService.delete(id);
        redirectAttributes.addFlashAttribute("message","Delete successful");
        return "redirect:/category";
    }
    @GetMapping("{id}/view")
    public  String view(@PathVariable Integer id,Model model){
        model.addAttribute("categoryNew",this.iCatrgoryService.findByIdCategory(id));
        return "category/view";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Category categoryNew, RedirectAttributes redirectAttributes){
        iCatrgoryService.save(categoryNew);
        redirectAttributes.addFlashAttribute("message","Create successful");
        return "redirect:/category";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Category categoryList, RedirectAttributes redirectAttributes){
        iCatrgoryService.save(categoryList);
        redirectAttributes.addFlashAttribute("message","Create successful");
        return "redirect:/category";
    }
}
