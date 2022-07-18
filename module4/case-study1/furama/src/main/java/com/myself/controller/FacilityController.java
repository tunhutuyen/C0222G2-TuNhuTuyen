package com.myself.controller;

import com.myself.model.Facility;
import com.myself.model.FacilityType;
import com.myself.model.RentType;
import com.myself.service.IFacilityService;
import com.myself.service.IFacilityTypeService;
import com.myself.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/furama")
public class FacilityController {
    @Autowired
    private IFacilityService iFacilityService;
    @Autowired
    private IFacilityTypeService iFacilityTypeService;
    @Autowired
    private IRentTypeService iRentTypeService;

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
    public String showCreate(Model model){
        List<RentType> rentTypeList = this.iRentTypeService.findAllRentType();
        List<FacilityType> facilityTypeList = this.iFacilityTypeService.findAllFacilityType();
        model.addAttribute("rentTypeList",rentTypeList);
        model.addAttribute("facilityTypeList",facilityTypeList);
        model.addAttribute("facility",new Facility());
        return "service/create";
    }
    @GetMapping("/service/edit/{id}")
    public String showEdit(@PathVariable Integer id,Model model){
        Facility facility = this.iFacilityService.findById(id);
        model.addAttribute("facility",facility);
        model.addAttribute("facilityTypeList",this.iFacilityTypeService.findAllFacilityType());
        model.addAttribute("rentTypeList",this.iRentTypeService.findAllRentType());
        return "service/edit";
    }
    @PostMapping("/service/create")
    public String createService(@ModelAttribute Facility facility,Model model){
        iFacilityService.createService(facility);
        model.addAttribute("facility",new Facility());
        model.addAttribute("message","Create new facility successful!!!");
        return "service/create";
    }
    @PostMapping("/service/save")
    public String editFacility(@ModelAttribute Facility facility,RedirectAttributes redirectAttributes){
        System.out.println(facility);
        iFacilityService.save(facility);
        redirectAttributes.addFlashAttribute("message","Edit successful!!!");
        return "redirect:/furama/service";
    }
}
