package com.myself.controller;

import com.myself.dto.ContractDto;
import com.myself.model.Contract;
import com.myself.model.ContractDetail;
import com.myself.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.Optional;

@Controller
@RequestMapping("/furama")
public class ContractController {
    @Autowired
    private IContractService iContractService;

    @Autowired
    private IContractDetailService iContractDetailService;

    @Autowired
    private IAttachFacilityService iAttachFacilityService;

    @Autowired
    private IEmployeeService iEmployeeService;
    @Autowired
    private ICustomerService iCustomerService;
    @Autowired
    private IFacilityService iFacilityService;

    @GetMapping("/contract")
    public String home(@PageableDefault(value = 5) Pageable pageable, @RequestParam Optional<String> searchName , Model model){
        String searchNameKey = searchName.orElse("");
        Page<ContractDto> contractDtoPage= this.iContractService.findAllContract(pageable,searchNameKey);
        model.addAttribute("searchName",searchNameKey);
        model.addAttribute("contractDetailObj",new ContractDetail());
        model.addAttribute("contractList",contractDtoPage);
        model.addAttribute("attachFacilityList",this.iAttachFacilityService.findAll());
        model.addAttribute("contractDetailList",this.iContractDetailService.findAll());
        model.addAttribute("view","contract");
        if (contractDtoPage.isEmpty()){
            model.addAttribute("pageEmpty","No result find!!!");
        }
        return "contract/list";
    }

    @GetMapping("/contract/create")
    public String showCreate(Model model){
        model.addAttribute("contractNew",new Contract());
        model.addAttribute("employeeList",this.iEmployeeService.findAll());
        model.addAttribute("customerList",this.iCustomerService.findAll());
        model.addAttribute("facilityList",this.iFacilityService.findAll());
        return "contract/create-contract";
    }
    @GetMapping("/customer/contract-facility")
    public String showCustomerUsingService(Model model,@PageableDefault(value = 5)Pageable pageable){
        model.addAttribute("customerUsingServiceList",iContractService.findAllCustomerUsingService(pageable));
        return "customer/customer-use-facility";
    }

    @PostMapping("/contract/createDetailContract")
    public String createDetailContract(@ModelAttribute("contractDetailObj") ContractDetail contractDetail,
                                       RedirectAttributes redirectAttributes){
        this.iContractDetailService.save(contractDetail);
        return "redirect:/furama/contract";
    }
    @PostMapping("/contract/save")
    public String saveContract(@ModelAttribute("contractNew") Contract contract,Model model){
        this.iContractService.save(contract);
        model.addAttribute("message","create successful");
        model.addAttribute("contractNew",new Contract());
        return "contract/create-contract";
    }
}
