package com.myself.tao_blog.controller;

import com.myself.tao_blog.model.Blog;
import com.myself.tao_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping("")
    public String home(Model model){
        List<Blog> blogList = iBlogService.findAllBlog();
        model.addAttribute("blogList",blogList);
        return "/list";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("blogNew",new Blog());
        return "/create";
    }
        @GetMapping("{id}/edit")
    public String findByIdBlog(@PathVariable Integer id,Model model){
        model.addAttribute("blogList",iBlogService.findByIdBlog(id));
        return "/edit";
    }
    @GetMapping("{id}/delete")
    public String delete(@PathVariable Integer id,RedirectAttributes redirectAttributes){
        this.iBlogService.delete(id);
        redirectAttributes.addFlashAttribute("message","Delete successful");
        return "redirect:/blog";
    }
    @GetMapping("{id}/view")
    public  String view(@PathVariable Integer id,Model model){
        model.addAttribute("blogOne",this.iBlogService.findByIdBlog(id));
        return "/view";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Blog blogNew, RedirectAttributes redirectAttributes){
        iBlogService.save(blogNew);
        redirectAttributes.addFlashAttribute("message","Create successful");
        return "redirect:/blog";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blogList, RedirectAttributes redirectAttributes){
        iBlogService.save(blogList);
        redirectAttributes.addFlashAttribute("message","Create successful");
        return "redirect:/blog";
    }

}
