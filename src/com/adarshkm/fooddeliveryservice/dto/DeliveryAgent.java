package com.adarshkm.fooddeliveryservice.dto;

import com.adarshkm.fooddeliveryservice.enums.DeliveryAgentStatus;

import java.util.UUID;

public class DeliveryAgent {
    private String id;
    private String name;
    private DeliveryAgentStatus status;
    private double rating ;

    public DeliveryAgent(String name, Double rating) {
        this.id = UUID.randomUUID().toString();
        this.status  = DeliveryAgentStatus.AVAILABLE;
        this.name = name;
        this.rating = rating;
    }

    public DeliveryAgentStatus getStatus() {
        return this.status;
    }
}
