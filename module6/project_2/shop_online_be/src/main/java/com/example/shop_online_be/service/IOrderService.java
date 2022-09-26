package com.example.shop_online_be.service;

import com.example.shop_online_be.dto.ErrorDTO;
import com.example.shop_online_be.dto.PaymentDto;
import com.example.shop_online_be.model.Customer;
import com.example.shop_online_be.model.OrderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IOrderService {
    ErrorDTO saveOrder(OrderService productOrder);

    List<OrderService> getProductInCardByCustomer(Customer customer);

    Boolean minusQuantity(OrderService orderService);

    Boolean plusQuantity(OrderService orderService);

    Boolean findProductOrder(OrderService orderService);

    PaymentDto goPayment(Customer customer);

    Page<OrderService> findAll(Pageable pageable);

    Page<OrderService> getListOrderYesterday(Pageable pageable);

    Page<OrderService> getOrderInCustomer(Pageable pageable, Customer customer);

}
