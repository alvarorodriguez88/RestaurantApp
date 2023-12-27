package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<Dish> dishArrayList;
    private MenuType menuType;


    public Menu(String name, MenuType menuType) {
        this.name = name;
        this.dishArrayList = new ArrayList<>();
        this.menuType = menuType;
    }
    public void addDish(Dish dish){
        dishArrayList.add(dish);
    }

    public String getName() {
        return name;
    }

}
