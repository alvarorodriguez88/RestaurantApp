package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public String name;
    public Phone phone;
    public List<Menu> menuList = new ArrayList<>();
    public ArrayList<Order> orders;

    public Restaurant(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }
    public void addMenu(String name){
        Menu menu = new Menu(name);
        menuList.add(menu);
    }

    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }
}
