package org.ulpgc.is1.model;

public class OrderItem {
    private int quantity;
    private Dish dish;
    private Order order;
    public OrderItem(int quantity, Dish dish) {
        this.quantity = quantity;
        this.dish = dish;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDishName() {
        return dish.getName();
    }
    public int getDishPrice(){
        return dish.getPrice();
    }
}
