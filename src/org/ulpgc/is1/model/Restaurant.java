package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private Phone phone;
    private Menu menu;
    private List<Menu> menuList = new ArrayList<>();
    private List<Order> orders = new ArrayList<>();

    public Restaurant(String name, Phone phone, Menu menu) {
        this.name = name;
        this.phone = phone;
        this.menu = menu;
    }
    public void addMenu(Menu menu){
        menuList.add(menu);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone.getNumber();
    }

    public List<Menu> getMenuList() {
        return menuList;
    }
    public void addRestaurantOrder(Order order){
        orders.add(order);
    }
    public void removeRestaurantOrder(int index){
        orders.remove(index);
    }
}
