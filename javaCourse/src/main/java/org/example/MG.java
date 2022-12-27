package org.example;

public class MG extends Person{


    public MG(int id, String name, String last_name, String phone_number, String email, Address address) {
        super(id, name, last_name, phone_number, email, address);
    }

    public MG() {
    }

    public MG(int id, String name, String last_name, String phone_number, String email) {
        super(id, name, last_name, phone_number, email);
    }
}
