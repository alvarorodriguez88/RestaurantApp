package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int NEXT_ID = 0;
    public final int id;
    public ArrayList<OrderItem> orders;
    public Restaurant restaurant;

    public Order(int id, Restaurant restaurant) {
        this.id = NEXT_ID++;
        this.restaurant = restaurant;
        orders = new ArrayList<>();
    }
    public int price(Dish dish){
        return dish.price;
    }
    public void addItem(int amount, Dish d){
        OrderItem it = new OrderItem(amount, d);
        orders.add(it);
    }
    public void removeItem(int id){
        orders.remove(id);
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


    public ArrayList<OrderItem> getOrderItemArrayList() {
        return orders;
    }
}
