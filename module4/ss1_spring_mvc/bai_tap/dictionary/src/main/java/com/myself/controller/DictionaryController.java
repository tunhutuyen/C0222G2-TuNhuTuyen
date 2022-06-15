package com.myself.controller;

import com.myself.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @Autowired
    private IDictionaryService iDictionaryService;

    @GetMapping(value = "")
    public String viewForm(){
        return "index";
    }

    @GetMapping(value = "/findWord")
    public String findWord(@RequestParam String word, Model model){
        String result =this.iDictionaryService.findWord(word);
        model.addAttribute("word",word);
        model.addAttribute("result",result);
        return "findWord";
    }

}
