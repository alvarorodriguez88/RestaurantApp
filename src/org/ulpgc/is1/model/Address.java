package org.ulpgc.is1.model;

public class Address {
    private String street;
    private int number;
    private int postalCode;
    private String city;
    private Customer customer;

    public Address(String street, int number, int postalCode, String city) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }
}
