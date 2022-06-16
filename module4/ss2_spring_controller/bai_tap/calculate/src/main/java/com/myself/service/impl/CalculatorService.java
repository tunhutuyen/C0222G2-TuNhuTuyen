package com.myself.service.impl;

import com.myself.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService{

    @Override
    public double calculatorAdd(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    @Override
    public double calculatorSub(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    @Override
    public double calculatorMulti(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    @Override
    public double calculatorDivision(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }
}
