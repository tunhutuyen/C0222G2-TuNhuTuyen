package com.myself.controller;

import com.myself.model.Save;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/view")
public class SaveSettingController {

    @GetMapping(value = "/")
    public String home(Model model){
       model.addAttribute("save",new Save());
        return "view";
    }

    @PostMapping(value ="/update")
    public String updateMail(@ModelAttribute Save save,Model model){
       model.addAttribute("saveNew",save);
       return "result";
    }
}
