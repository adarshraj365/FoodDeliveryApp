package com.adarshkm.fooddeliveryservice.dto;

import com.adarshkm.fooddeliveryservice.enums.OrderStatus;
import com.adarshkm.fooddeliveryservice.enums.PaymentStatus;

import java.util.List;
import java.util.UUID;

public class Order {
    private String id;
    private Customer customer;
    private Restaurant restaurant;
    private List<OrderItem> orderItemList;
    private OrderStatus status;
    private PaymentStatus paymentStatus;

    public Order(Customer customer, Restaurant restaurant, List<OrderItem> orderItemList) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.orderItemList = orderItemList;
        this.id = UUID.randomUUID().toString();
        this.status = OrderStatus.CONFIRMED;
        this.paymentStatus = PaymentStatus.PRE_PAID;
    }
}
