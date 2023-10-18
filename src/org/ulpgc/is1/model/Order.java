package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int NEXT_ID = 0;
    private final int id;
    private Customer customer;
    private Restaurant restaurant;
    public ArrayList<OrderItem> orderItems;
    public Order(Customer customer, Restaurant restaurant) {
        this.id = NEXT_ID++;
        orderItems = new ArrayList<>();
        this.customer = customer;
        this.restaurant = restaurant;
    }
    public int price(Dish dish, OrderItem orderItem){
        return dish.price * orderItem.getQuantity();
    }
    public void addItem(int amount, Dish d){
        OrderItem it = new OrderItem(amount, d);
        orderItems.add(it);
    }
    public void removeItem(int id){
        orderItems.remove(id);
    }
    public int getNEXT_ID() {
        return NEXT_ID;
    }
    public void setNEXT_ID(int NEXT_ID) {
        this.NEXT_ID = NEXT_ID;
    }
    public int getId() {
        return id;
    }
    public String getOrderItemArrayList() {
        StringBuilder plateNames = new StringBuilder();
        for (OrderItem items : orderItems){
            plateNames.append(items);
            plateNames.append(", ");
        }
        return plateNames.toString();
    }
}
