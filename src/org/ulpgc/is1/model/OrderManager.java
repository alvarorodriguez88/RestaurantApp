package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    public List<Customer> customerList = new ArrayList<>();
    public List<Restaurant> restaurantList = new ArrayList<>();
    public List<Dish> dishList = new ArrayList<>();
    public void addCustomer(String name, String surname){
        Customer customer = new Customer(name, surname);
        customerList.add(customer);
    }
    public void addRestaurant(String name, Phone phone){
        Restaurant restaurant = new Restaurant(name, phone);
        restaurantList.add(restaurant);
    }
    public void addDish(String name, String description, int price){
        Dish dish = new Dish(name, description, price);
        dishList.add(dish);
    }
    /*public Customer getCustomer(String name, String surname){
        return customerList.get();
        // ni idea
    }

     */
}
