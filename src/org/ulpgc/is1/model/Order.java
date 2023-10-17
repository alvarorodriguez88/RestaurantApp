package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int NEXT_ID = 0;
    public final int id;
    public ArrayList<OrderItem> orderItems;
    public Order(int id) {
        this.id = NEXT_ID++;
        orderItems = new ArrayList<>();
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


    public ArrayList<OrderItem> getOrderItemArrayList() {
        return orderItems;
    }
}
