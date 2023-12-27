package org.ulpgc.is.model;

public class Dish {
    private final String name;
    private final String description;
    private final int price;
    ///socorroo
    public Dish(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}