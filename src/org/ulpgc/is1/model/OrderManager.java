package org.ulpgc.is1.model;

import java.util.ArrayList;

public class OrderManager {
    public ArrayList<Customer> customerList;
    public ArrayList<Restaurant> restaurantList;
    public ArrayList<Dish> dishList;
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
    //No sé si será el getCustomer con un indice, creo que si
    //Le puse que devuelva la frase esa con el nombre y el apellido.
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
}
