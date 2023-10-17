package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public String name;
    public Phone phone;
    public List<Menu> menuList = new ArrayList<>();
    public List<Order> orders = new ArrayList<>();

    public Restaurant(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }
    public void addMenu(String name, MenuType menuType){
        Menu menu = new Menu(name, menuType);
        menuList.add(menu);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone.number;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = new Phone(phone);
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
