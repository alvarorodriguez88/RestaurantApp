package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Order {
    private int NEXT_ID = 0;
    public final int id;
    public ArrayList<OrderItem> orderItemArrayList;

    public Order(int NEXT_ID, int id) {
        this.NEXT_ID = NEXT_ID;
        this.id = id;
    }
    //No sé si es así el método price();
    public int price(Dish dish){
        return dish.price;
    }
    //Creo que está bien porque lo hice como en la página 62
    public void addItem(int amount, Dish d){
        OrderItem it = new OrderItem(amount, d);
        orderItemArrayList.add(it);
    }
    public void removeItem(int id){
        orderItemArrayList.remove(id);
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

    //No sé si hacer el setter y el getter del ArrayList
    /*public ArrayList<OrderItem> getOrderItemArrayList() {
        return orderItemArrayList;
    }

    public void setOrderItemArrayList(ArrayList<OrderItem> orderItemArrayList) {
        this.orderItemArrayList = orderItemArrayList;
    }

     */
}
