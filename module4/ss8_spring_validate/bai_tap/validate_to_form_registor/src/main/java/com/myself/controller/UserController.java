package com.myself.controller;

import com.myself.model.User;
import com.myself.model.UserDto;
import com.myself.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("")
    public String home(Model model){
       model.addAttribute("userDto",new UserDto());
       return "/index";
    }
    @PostMapping("/create")
    public String createUser(@Valid @ModelAttribute("userDto")UserDto userDto,BindingResult bindingResult,
    RedirectAttributes redirectAttributes){

//        new UserDto().validate(userDto,bindingResult);
        if (bindingResult.hasErrors()){
            return "/index";
        }else {
            User user = new User();
            BeanUtils.copyProperties(userDto,user);
            this.iUserService.save(user);
            redirectAttributes.addFlashAttribute("message","Create successful!!!");
            return "redirect:/user";
        }
    }
}
