package com.adarshkm.fooddeliveryservice;

import com.adarshkm.fooddeliveryservice.dto.*;
import com.adarshkm.fooddeliveryservice.enums.DeliveryAgentStatus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Food Delivery Service Handler.
 */
public class FoodDeliveryService {
    private List<Customer> customers;
    private List<Restaurant> restaurants;
    private List<Order> orders;
    private List<DeliveryAgent> deliveryAgents;

    public FoodDeliveryService() {
        customers = new ArrayList<>();
        restaurants = new ArrayList<>();
        orders = new ArrayList<>();
        deliveryAgents = new ArrayList<>();
    }

    public Customer addCustomer(String name, String location) {
        Customer newCustomer = new Customer(name, location);
        customers.add(newCustomer);
        return newCustomer;
    }

    public void deActivateCustomerAccount(String id) {
        customers.removeIf(customer -> customer.getId().equals(id));
    }

    public Restaurant addRestaurant(String restaurantName, String location, String description) {
        Restaurant newRestaurant = new Restaurant(restaurantName, location, description);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public DeliveryAgent addDeliveryAgent(String name, Double rating) {
        DeliveryAgent newDeliveryAgent = new DeliveryAgent(name, rating);
        deliveryAgents.add(newDeliveryAgent);
        return newDeliveryAgent;
    }

    /*
    This method will add a new menu for the restaurant.
    Will maintain this menu globally, can be used by other restaurant as well.
     */
    public void addNewMenu(Restaurant restaurant, String dishName, String description, Integer price) {
        MenuItem menuItem = new MenuItem(dishName, description, price);
        restaurants.stream().filter(res -> res.getId().equals(restaurant.getId()))
                .findFirst()
                .ifPresent(res -> res.getMenuList().add(menuItem));
    }

    /*
    List all the menu of an restaurant.
     */
    public List<MenuItem> getAllMenuItemsForRestaurant(Restaurant restaurant) {
        return restaurant.getMenuList();
    }


    /*
    Create Order :
    Customer, Restaurant, MenuItem, Quantity
     */
    public Order createOrder(Customer customer, Restaurant restaurant, List<MenuItem> menuItems, Integer qty) {
        List<OrderItem> orderItemList = menuItems.stream().map(menuItem -> new OrderItem(menuItem, qty)).toList();
        Order order = new Order(customer, restaurant, orderItemList);
        return order;
    }

    /*
    Get All available delivery agents.
     */
    public List<DeliveryAgent> getAllAvailableDeliveryAgents() {
        return deliveryAgents.stream().filter(deliveryAgent ->
                deliveryAgent.getStatus().equals(DeliveryAgentStatus.AVAILABLE))
                .collect(Collectors.toList());
    }
}
