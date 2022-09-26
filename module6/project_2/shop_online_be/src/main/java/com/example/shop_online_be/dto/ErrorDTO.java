package com.example.shop_online_be.dto;

import com.example.shop_online_be.model.OrderService;
import lombok.Data;

import java.util.List;

@Data
public class ErrorDTO {
    private String message;
    private List<String> messageList;
    private OrderService orderService;
}
