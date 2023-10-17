package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String name;
    public String surname;
    public Address address;
    public ArrayList<Order> orderList;
    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String street, int number, int postalCode, String city) {
        this.address = new Address(street, number, postalCode, city);
    }

    public ArrayList<Order> getCustomerOrderList() {
        return orderList;
    }
    public void addCustomerOrder(Order order){
        orderList.add(order);
    }
    public void removeCustomerOrder(int index){
        orderList.remove(index);
    }

}
