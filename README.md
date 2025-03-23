# Designing an Online Food Delivery Service Like Swiggy

Building a food delivery system like Swiggy. 

### Requirement
1. System to allow customers to browse restaurants, view menus and place orders.
2. Restaurants should be able to manage their menu ( add/delete/modify)
3. Delivery agents should be able to accept for any order delivery and deliver that order.
4. System should allow payment methods.
5. System should be able to handle concurrent orders.
6. System should provide real time notifications to the customers, restaurants and delivery agents.


``It's an HLD in itself, But will try to do a do a LLD for it.``

### BrainStorm : 
* We can have one entity Customer which will represents customer with attributes like : id, customerName, email, address.
* Restaurant entity would represent a restaurant. Attributes :- id, restaurantName, menuItems (list of menu)
* MenuItem - name, id, description, price, availability
* Order - id, customer, restaurant, OrderedItemList, status (PREPARING, IN_TRANSIT, DELIVERED, FAILED), totalPrice, paymentStatus.
* OrderedItem - MenuItem, quantity
* DeliveryAgent - id, name, status (Occupied, available), phone number.
* FoodDeliverService : This will be the main class (starting point for our application). we will be following 
  Singleton pattern, so that only one instance of the app get's created
