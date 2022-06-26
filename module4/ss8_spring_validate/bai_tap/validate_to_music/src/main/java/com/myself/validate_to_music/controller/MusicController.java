package com.myself.validate_to_music.controller;

import com.myself.validate_to_music.dto.MusicDto;
import com.myself.validate_to_music.model.Music;
import com.myself.validate_to_music.service.IMusicService;
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
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private IMusicService iMusicService;

    @GetMapping("")
    public String home(Model model){
        model.addAttribute("musicDto",new MusicDto());
        return "music/create";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute MusicDto musicDto, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes){
        if (bindingResult.hasErrors()){
            return "music/create";
        }else {
            Music music = new Music();
            BeanUtils.copyProperties(musicDto,music);
            iMusicService.save(music);
            redirectAttributes.addFlashAttribute("message","Create successful");
            return "redirect:/music";
        }
    }
}
