package org.ulpgc.is1.model;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    public String name;
    public ArrayList<Dish> dishArrayList;
    public MenuType menuType;


    public Menu(String name, MenuType menuType) {
        this.name = name;
        dishArrayList = new ArrayList<>();
        this.menuType = menuType;
    }
    public void addDish(Dish dish){
        dishArrayList.add(dish);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Dish> getDishArrayList() {
        return dishArrayList;
    }
    public ArrayList<String> getDish(){
        ArrayList<String> dishString = new ArrayList<>();
        for (Dish dish : dishArrayList){
            String dishName = dish.getName();
            dishString.add(dishName);
        }
        return dishString;
    }
    public String getMenuType(){
        return menuType.toString();
    }
}
