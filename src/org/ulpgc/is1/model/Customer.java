package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String surname;
    private Address address;
    private ArrayList<Order> orderList;
    public Customer(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Address getAddress() {
        return address;
    }
    public void addCustomerOrder(Order order){
        orderList.add(order);
    }
}
