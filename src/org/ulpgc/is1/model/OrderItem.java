package org.ulpgc.is1.model;

public class OrderItem {
    public int quantity;
    public Dish dish;
    public OrderItem(int quantity, Dish dish) {
        this.quantity = quantity;
        this.dish = dish;
    }

}
