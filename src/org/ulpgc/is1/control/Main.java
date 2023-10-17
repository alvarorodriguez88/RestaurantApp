package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Address;
import org.ulpgc.is1.model.Customer;
import org.ulpgc.is1.model.Dish;
import org.ulpgc.is1.model.Menu;
import org.ulpgc.is1.model.MenuType;
import org.ulpgc.is1.model.Order;
import org.ulpgc.is1.model.OrderItem;
import org.ulpgc.is1.model.OrderManager;
import org.ulpgc.is1.model.Phone;
import org.ulpgc.is1.model.Restaurant;

public class Main {
    public static void init(OrderManager restaurant){
        //i
        Customer customer1 = new Customer("Álvaro", "Rodríguez");
        Customer customer2 = new Customer("Jose", "Mataix");
        //ii
        Phone phone1 = new Phone("123456890");
        Phone phone2 = new Phone("928789875");
        Restaurant restaurant1 = new Restaurant("Venecia 1", phone1);
        Restaurant restaurant2 = new Restaurant("La Panacota", phone2);
        //iii
        Dish dish1 = new Dish("Tagliatelle a la Carbonara", "Pasta Tagliatelle, Huevo, Queso Pecorino Romano," +
                "Guanciale, Pimienta Negra", 14);
        Dish dish2 = new Dish("Tortellini Bolognesa", "Tortellini, Salsa Bolonegsa(Vacuno Picado, Cebolla, " +
                "Zanahoria, Salsa de tomate, Vino Blanco, Leche, Aceite de oliva, Sal y Pimienta)", 15);
        Dish dish3 = new Dish("Pizza Margarita", "Masa Casera, Salsa de tomate, Queso Mozzarella fresco," +
                "Hojas de Albahaca, Aceite de oliva, Sal y Pimienta", 9);

        restaurant.addCustomer(customer1);
        restaurant.addRestaurant(restaurant1);
        restaurant.addDish(dish1);

        restaurant.addCustomer(customer2);
        restaurant.addRestaurant(restaurant2);
        restaurant.addDish(dish2);

        restaurant.addDish(dish2);
    }

    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        init(orderManager);
        //iv
        orderManager.getRestaurant(0);
        //v
        orderManager.getCustomer(1);
        //vi
        orderManager.getDish(2);
        //vii
        //viii
        orderManager.removeCustomer(1);
        //ix
        orderManager.customersCount();
        //x
    }
}