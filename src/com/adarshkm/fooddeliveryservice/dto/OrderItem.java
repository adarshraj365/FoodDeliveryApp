package com.adarshkm.fooddeliveryservice.dto;

public class OrderItem {
    private MenuItem item;
    private int quantity;

    public OrderItem(MenuItem item, int qty) {
        this.item = item;
        this.quantity = qty;
    }
}
