package com.myself.controller;

import com.myself.service.ICalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @Autowired
    private ICalculatorService iCalculatorService;

    @GetMapping(value = "/")
    public String viewForm() {
        return "result";
    }

    @RequestMapping(value = "/calculator")
    public String goCalculator(@RequestParam double numberOne, @RequestParam double numberTwo,
                               @RequestParam String math, Model model) {
        double result = 0;
        switch (math) {
            case "add":
                result = this.iCalculatorService.calculatorAdd(numberOne,numberTwo);
                break;
            case "sub":
                result = this.iCalculatorService.calculatorSub(numberOne,numberTwo);
                break;
            case "multi":
                result = this.iCalculatorService.calculatorMulti(numberOne,numberTwo);
                break;
            case "division":
                result = this.iCalculatorService.calculatorDivision(numberOne,numberTwo);
                break;
        }
        model.addAttribute("result", result);
        model.addAttribute("numberOne", numberOne);
        model.addAttribute("numberTwo", numberTwo);
        return "result";
    }
}




