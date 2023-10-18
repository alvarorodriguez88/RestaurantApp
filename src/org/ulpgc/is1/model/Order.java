package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int NEXT_ID = 0;
    public final int id;
    public Customer customer;
    public Restaurant restaurant;
    public ArrayList<OrderItem> orderItems;
    public Order(Customer customer, Restaurant restaurant) {
        this.id = NEXT_ID++;
        orderItems = new ArrayList<>();
        this.customer = customer;
        this.restaurant = restaurant;
    }
    public int price(){
        int total = 0;
        for (int i = 0; i < orderItems.size(); i++){
            total += orderItems.get(i).getDishPrice() * orderItems.get(i).getQuantity();
        }
        return total;
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
    public ArrayList<String> getOrderItemArrayList() {
        ArrayList<String> orderItemList = new ArrayList<>();
        for (OrderItem item : orderItems){
            String orderItemString = item.getDishName() + " -> " + item.getQuantity() + " pieza/s";
            orderItemList.add(orderItemString);
        }
        return orderItemList;
    }
}
