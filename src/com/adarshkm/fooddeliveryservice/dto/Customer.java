package com.adarshkm.fooddeliveryservice.dto;

import java.util.UUID;

public class Customer {
    private final String id;
    private final String name;
    private final String address;

    public Customer(String name, String address) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.address  = address;
    }

    public String getId() {
        return this.id;
    }

    public String  getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
}
