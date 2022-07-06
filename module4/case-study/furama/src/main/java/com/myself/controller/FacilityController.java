package com.myself.controller;

import com.myself.model.Facility;
import com.myself.service.IFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/furama")
public class FacilityController {
    @Autowired
    private IFacilityService iFacilityService;

    @GetMapping("")
    public String home(){
        return "/index";
    }
    @GetMapping("/service")
    public String showServiceList(@PageableDefault(value = 5) Pageable pageable,
                                  @RequestParam Optional<String> searchName, Model model){
        String searchNameKey = searchName.orElse("");
        model.addAttribute("serviceList",this.iFacilityService.findAllFacility(pageable,searchNameKey));
        model.addAttribute("searchName",searchNameKey);
        model.addAttribute("view","service");
        return "service/list";
    }
    @GetMapping("/service/delete/{id}")
    public String removeFacility(@PathVariable Integer id, RedirectAttributes redirectAttributes){
        this.iFacilityService.removeFacilityById(id);
        redirectAttributes.addFlashAttribute("message","Delete successful!");
        return "redirect:/furama/service";
    }
    @GetMapping("/service/create")
    public String showCreate(Facility facility,Model model){
        model.addAttribute("facility",facility);
//        model.addAttribute("",)
        return "service/create";
    }
}
