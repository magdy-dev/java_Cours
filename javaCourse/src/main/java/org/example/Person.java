package org.example;

public class Person {
    private int id;
    private String name;
    private String last_name;
    private String phone_number;
    private String email;
    private String passport_number;
    private Address address;

    public Person(int id, String name, String last_name, String phone_number, String email, Address address, String passport_number) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.address = address;
        this.passport_number = passport_number;
    }

    public Person() {
    }

    public Person(int id, String name, String last_name, String phone_number, String email, String passport_number) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.email = email;
        this.passport_number = passport_number;
    }

    public Person(int id, String name, String last_name, String phone_number, String email) {

        this.id=id;
        this.name=name;
        this.last_name=last_name;
        this.phone_number=phone_number;
        this.email=email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getPassport_number(){
        return passport_number;
    }
     public void setPassport_number(String passport_number){
        this.passport_number=phone_number;
     }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
