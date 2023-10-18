package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    public List<Customer> customerList;
    public List<Restaurant> restaurantList;
    public List<Dish> dishList;
    public List<Order> orderList;

    public OrderManager() {
        customerList = new ArrayList<>();
        restaurantList = new ArrayList<>();
        dishList = new ArrayList<>();
        orderList = new ArrayList<>();
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
    public void addOrder(Order order){ orderList.add(order);}
    public Customer getCustomer(int index){
        return customerList.get(index);
    }
    public Restaurant getRestaurant(int index){
        return restaurantList.get(index);
    }
    public Dish getDish(int index){
        return dishList.get(index);
    }
    public Order getOrder(int index){
        return orderList.get(index);
    }
    public void order(Customer customer, Restaurant restaurant, ArrayList<Integer> dishesId, ArrayList<Integer> quantity){
        Order order = new Order(customer, restaurant);
        for (int i = 0; i < dishesId.size(); i++){
            Dish dish = dishList.get(i);
            order.addItem(quantity.get(i), dish);
        }
        addOrder(order);
    }
    public void removeCustomer(int index){
        customerList.remove(index);
    }
    public int customersCount(){
        return customerList.size();
    }
    public int dishesCount(){
        return dishList.size();
    }
    public int restaurantsCount(){
        return restaurantList.size();
    }
}
