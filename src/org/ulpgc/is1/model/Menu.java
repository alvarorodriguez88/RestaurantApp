package org.ulpgc.is1.model;

import java.util.ArrayList;

public class Menu {
    private String name;
    private ArrayList<Dish> dishArrayList;
    private MenuType menuType;


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
