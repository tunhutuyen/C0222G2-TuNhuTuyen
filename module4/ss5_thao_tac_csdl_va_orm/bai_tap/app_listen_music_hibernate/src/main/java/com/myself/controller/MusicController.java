package com.myself.controller;

import com.myself.model.Music;
import com.myself.service.IMusicService;
import com.myself.service.impl.MusicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public  String showCreate(Model model){
        model.addAttribute("musicNew",new Music());
        return "/create";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id){
        iMusicService.delete(id);
        return "redirect:/music";
    }
    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable int id,Model model){
        model.addAttribute("musicShow",iMusicService.showEdit(id));

        return "/edit";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("musicNew") Music music, RedirectAttributes redirectAttributes){
        iMusicService.save(music);
        redirectAttributes.addFlashAttribute("message","Create successful");
        return "redirect:/music";
    }
    @PostMapping("/edit")
    public String edit(@ModelAttribute("musicShow") Music music, RedirectAttributes redirectAttributes){
        iMusicService.edit(music);
        redirectAttributes.addFlashAttribute("message","Edit successful");
        return "redirect:/music";
    }
}
