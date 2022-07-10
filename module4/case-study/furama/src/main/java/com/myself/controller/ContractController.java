package com.myself.controller;

import com.myself.model.Contract;
import com.myself.model.ContractDetail;
import com.myself.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping("/furama")
public class ContractController {
    @Autowired
    private IContractService iContractService;
    @Autowired
    private IFacilityService iFacilityService;
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private IEmployeeService iEmployeeService;
    @Autowired
    private IContractDetailService iContractDetailService;
    @Autowired
    private IAttachFacilityService iAttachFacilityService;

    @GetMapping("/contract")
    public String home(@PageableDefault(value = 5) Pageable pageable, @RequestParam Optional<String> searchName , Model model){
        String searchNameKey = searchName.orElse("");
        Page<Contract> contractPage = this.iContractService.findAllContract(pageable,searchNameKey);
        model.addAttribute("contractObj",new Contract());
        model.addAttribute("contractDetailObj",new ContractDetail());
        model.addAttribute("contractList",contractPage);
        model.addAttribute("facilityList",this.iFacilityService.findAll());
        model.addAttribute("searchName",searchNameKey);
        model.addAttribute("customerList",this.iCustomerService.findAll());
        model.addAttribute("attachFacilityList",this.iAttachFacilityService.findAll());
        model.addAttribute("employeeList",this.iEmployeeService.findAll());
        if (contractPage.isEmpty()){
            model.addAttribute("pageEmpty","No result find!!!");
        }
        return "contract/list";
    }
}
