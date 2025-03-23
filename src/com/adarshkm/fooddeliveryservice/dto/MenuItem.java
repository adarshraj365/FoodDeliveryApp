package com.adarshkm.fooddeliveryservice.dto;

import com.adarshkm.fooddeliveryservice.enums.MenuItemStatus;

import java.util.UUID;

public class MenuItem {
    private String id;
    private String name;
    private String description;
    private Integer price;
    private MenuItemStatus menuItemStatus;

    public MenuItem(String name, String description, Integer price) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.price= price;
        this.menuItemStatus = MenuItemStatus.AVAILABLE;
    }
}
