package org.example;

public class Address {

    private int id;
    private String city;
    private String street;
    private String flatNumber;

    public Address() {
    }

    public Address(int id, String city, String street, String flatNumber) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.flatNumber = flatNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }
}
