package org.example;

public class MG extends Person{
    private int salary;


    public MG(int id, String name, String last_name, String phone_number, String email, Address address, int salary) {
        super(id, name, last_name, phone_number, email, address);
        this.salary = salary;
    }

    public MG(int salary) {
        this.salary = salary;
    }

    public MG(int id, String name, String last_name, String phone_number, String email, int salary) {
        super(id, name, last_name, phone_number, email);
        this.salary = salary;
    }
}
