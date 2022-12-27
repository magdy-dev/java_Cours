package org.example;

public class Person_cleaner extends Person{

    public Person_cleaner(int id, String name, String last_name, String phone_number, String email, Address address) {
        super(id, name, last_name, phone_number, email, address);
    }

    public Person_cleaner() {
    }

    public Person_cleaner(int id, String name, String last_name, String phone_number, String email) {
        super(id, name, last_name, phone_number, email);
    }
}
