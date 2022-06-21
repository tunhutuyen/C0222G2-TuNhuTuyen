package com.myself.controller;

import com.myself.model.Music;
import com.myself.service.IMusicService;
import com.myself.service.impl.MusicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/music")
public class MusicController {
    private final IMusicService iMusicService =  new MusicService();

    @GetMapping(value = "")
    public String home(Model model){
        List<Music> musicList = iMusicService.findAll();
        model.addAttribute("musicList",musicList);
        return "/index";
    }
    @GetMapping("/create")
    public  String create(Model model){
        model.addAttribute("musicNew",new Music());
        return "/create";
    }
}
