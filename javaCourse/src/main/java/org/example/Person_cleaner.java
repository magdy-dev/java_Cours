package org.example;

public class Person_cleaner extends Person{
    private int id;
    private double salary;


    public Person_cleaner(int id, String name, String last_name, String phone_number, String email, Address address, int id1, double salary) {
        super(id, name, last_name, phone_number, email, String.valueOf(address));
        this.id = id1;
        this.salary = salary;
    }

    public Person_cleaner(int id, double salary) {
        this.id = id;
        this.salary = salary;
    }

    public Person_cleaner(int id, String name, String last_name, String phone_number, String email, int id1, double salary) {
        super(id, name, last_name, phone_number, email );
        this.id = id1;
        this.salary = salary;
    }
}
