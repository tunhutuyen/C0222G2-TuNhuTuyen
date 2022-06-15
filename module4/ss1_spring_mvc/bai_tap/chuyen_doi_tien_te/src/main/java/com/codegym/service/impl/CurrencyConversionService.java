package com.codegym.service.impl;

import com.codegym.service.ICurrencyConversionService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyConversionService implements ICurrencyConversionService {

    @Override
    public double currencyConversion(double amount) {
        return amount * 23000;
    }
}
