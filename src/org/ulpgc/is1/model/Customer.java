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

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

}
