package com.adarshkm.fooddeliveryservice.dto;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Restaurant {
    private String id;
    private String name;
    private String location;
    private String description;
    private List<MenuItem> menuList;

    public Restaurant(String name, String location, String description) {
        id = UUID.randomUUID().toString();
        this.location = location;
        this.name =name;
        this.description =description;
        this.menuList = new ArrayList<>();
    }

    public String getId() {
        return this.id;
    }

    public List<MenuItem> getMenuList() {
        return this.menuList;
    }
}
