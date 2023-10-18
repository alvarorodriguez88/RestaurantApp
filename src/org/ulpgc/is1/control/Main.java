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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void init(OrderManager restaurant){
        //i
        Address address1 = new Address("Triana", 2, 35300, "Las Palmas");
        Address address2 = new Address("La Retama", 1, 35330, "Las Palmas");

        Customer customer1 = new Customer("Álvaro", "Rodríguez", address1);
        Customer customer2 = new Customer("Jose", "Mataix", address2);
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

        restaurant.addDish(dish3);
    }

    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        init(orderManager);
        //iv
        Restaurant restaurant1 = orderManager.getRestaurant(0);
        System.out.println("El primer restaurante es " + restaurant1.getName() + " y su número de teléfono es " + restaurant1.getPhone());
        //v
        Customer customer2 = orderManager.getCustomer(1);
        System.out.println("El segundo cliente es " + customer2.getName() + " " + customer2.getSurname() + " y su dirección es la calle " + customer2.getAddress().getStreet() + " nº " + customer2.getAddress().getNumber() + " con código postal " + customer2.getAddress().getPostalCode() + " ubicado en " + customer2.getAddress().getCity());
        //vi
        Dish dish3 = orderManager.getDish(2);
        System.out.println("El tercer plato es " + dish3.getName() + " que es " + dish3.getDescription() + ", y su precio total son " + dish3.getPrice() + " euros.");
        //vii
        ArrayList<Integer> plates = new ArrayList<>(Arrays.asList(1, 2));
        ArrayList<Integer> quantities = new ArrayList<>(Arrays.asList(2, 2));

        orderManager.order(orderManager.getCustomer(0), orderManager.getRestaurant(0), plates, quantities);
        //viii
        orderManager.removeCustomer(1);
        //ix
        System.out.println("Número de clientes: " + orderManager.customersCount());
        //x
        String listOfNames = orderManager.getOrder(0).getOrderItemArrayList();
        System.out.println(listOfNames);
    }
}