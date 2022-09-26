package com.example.shop_online_be.dto;

import com.example.shop_online_be.model.Bill;
import com.example.shop_online_be.model.Customer;
import com.example.shop_online_be.model.OrderService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class PaymentDto {
    private List<OrderService> productOrderList;
    private Customer customer;
    private Bill bill;
}
