package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public String name;
    public ArrayList<Dish> dishArrayList;

    public Menu(String name) {
        this.name = name;
        dishArrayList = new ArrayList<>();
    }
    public void addDish(Dish dish){
        dishArrayList.add(dish);
    }
}
