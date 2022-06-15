package com.codegym.controller;

import com.codegym.service.ICurrencyConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConversionController {

    @Autowired
    private ICurrencyConversionService iCurrencyConversionService;

    @GetMapping(value = "")
    public String currencyConversionList(){
        return "index";
    }

    @GetMapping(value = "/convertor")
    public String currencyConversion(@RequestParam double amount, Model model){
        double result = this.iCurrencyConversionService.currencyConversion(amount);
        model.addAttribute("result",result);
        model.addAttribute("amount",amount);
        return "index";
    }

}
