package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    public String name;
    public String surname;
    public Address address;
    public List<Order> orderList = new ArrayList<>();

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}
