package com.myself.controller;

import com.myself.model.Music;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/music")
public class MusicController {

    @GetMapping(value = "/")
    public String home(Model model){
        model.addAttribute("music",new Music());
        return "index";
    }
    @PostMapping(value = "/upload")
    public String upload(@ModelAttribute Music music,Model model){
        model.addAttribute("musicNew",music);
        return "index";
    }
}
