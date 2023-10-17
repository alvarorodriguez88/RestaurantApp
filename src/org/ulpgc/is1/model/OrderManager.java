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

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }
    public void addRestaurant(Restaurant restaurant){
        restaurantList.add(restaurant);
    }
    public void addDish(Dish dish){
        dishList.add(dish);
    }
    public void getCustomer(int index){
        Customer customer = customerList.get(index);
        System.out.println("El cliente es " + customer.getName() + " " + customer.getSurname());
    }
    public void getRestaurant(int index){
        Restaurant restaurant = restaurantList.get(index);
        System.out.println("El restaurante es " + restaurant.getName() + " y su teléfono es " + restaurant.getPhone());
    }
    public void getDish(int index){
        Dish dish = dishList.get(index);
        System.out.println("El plato es un/a " + dish.getName() + " y su precio es de " + dish.getPrice() + " euros.");
    }
    public void order(){

    }
    public void removeCustomer(int index){
        customerList.remove(index);
    }
    public void customersCount(){
        System.out.println(customerList.size());
    }
    public void dishesCount(){
        System.out.println(dishList.size());
    }
    public void restaurantsCount(){
        System.out.println(restaurantList.size());
    }
}
