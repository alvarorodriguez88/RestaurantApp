package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    public List<Customer> customerList;
    public List<Restaurant> restaurantList;
    public List<Dish> dishList;

    public OrderManager() {
        customerList = new ArrayList<>();
        restaurantList = new ArrayList<>();
        dishList = new ArrayList<>();
    }

    public void addCustomer(String name, String surname, Address address){
        Customer customer = new Customer(name, surname, address);
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
    public void getCustomer(int index){
        Customer customer = customerList.get(index);
        System.out.println("El cliente es " + customer.getName() + " " + customer.getSurname());
    }
    public void getRestaurant(int index){
        Restaurant restaurant = restaurantList.get(index);
        System.out.println("El restaurante es " + restaurant.getName());
    }
    public void getDish(int index){
        Dish dish = dishList.get(index);
        System.out.println("El plato es un/a " + dish.getName());
    }
    public void order(){

    }
}
