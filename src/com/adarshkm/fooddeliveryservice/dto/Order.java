package com.adarshkm.fooddeliveryservice.dto;

import com.adarshkm.fooddeliveryservice.enums.OrderStatus;
import com.adarshkm.fooddeliveryservice.enums.PaymentStatus;

import java.util.List;

public class Order {
    private String id;
    private Customer customer;
    private Restaurant restaurant;
    private List<OrderItem> orderItemList;
    private OrderStatus status;
    private PaymentStatus paymentStatus;
}
