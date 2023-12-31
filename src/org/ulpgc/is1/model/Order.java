package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int NEXT_ID = 0;
    private final int id;
    private Customer customer;
    private Restaurant restaurant;
    private List<OrderItem> orderItems;
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
