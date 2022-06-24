package com.myself.tao_blog.controller;

//import com.myself.tao_blog.service.IBlogService;
//import com.myself.tao_blog.service.ICatrgoryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.web.PageableDefault;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.myself.tao_blog.service.IBlogService;
import com.myself.tao_blog.service.ICatrgoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService iBlogService;
    @Autowired
    private ICatrgoryService iCatrgoryService;

    @GetMapping("")
    public String home(Model model, @PageableDefault(value = 5) Pageable pageable,
                       @RequestParam Optional<String> keyword){
        String keywordNew = keyword.orElse("");
        model.addAttribute("blogList",this.iBlogService.getAllBlogByKeyword(keywordNew,pageable));
        model.addAttribute("keywordNew",keywordNew);
        return "blog/list";
    }
//    @GetMapping("/create")
//    public String create(Model model){
//        model.addAttribute("blogNew",new Blog());
//        return "blog/create";
//    }
//    @GetMapping("{id}/edit")
//    public String findByIdBlog(@PathVariable Integer id,Model model){
//        model.addAttribute("blogList",iBlogService.findByIdBlog(id));
//        return "blog/edit";
//    }
//    @GetMapping("{id}/delete")
//    public String delete(@PathVariable Integer id,RedirectAttributes redirectAttributes){
//        this.iBlogService.delete(id);
//        redirectAttributes.addFlashAttribute("message","Delete successful");
//        return "redirect:/blog";
//    }
//    @GetMapping("{id}/view")
//    public  String view(@PathVariable Integer id,Model model){
//        model.addAttribute("blogOne",this.iBlogService.findByIdBlog(id));
//        return "blog/view";
//    }
//
//    @PostMapping("/save")
//    public String save(@ModelAttribute Blog blogNew, RedirectAttributes redirectAttributes){
//        iBlogService.save(blogNew);
//        redirectAttributes.addFlashAttribute("message","Create successful");
//        return "redirect:/blog";
//    }
//    @PostMapping("/edit")
//    public String edit(@ModelAttribute Blog blogList, RedirectAttributes redirectAttributes){
//        iBlogService.save(blogList);
//        redirectAttributes.addFlashAttribute("message","Create successful");
//        return "redirect:/blog";
//    }

}
