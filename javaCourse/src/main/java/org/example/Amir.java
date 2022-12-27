package org.example;

public class Amir {

    int id;
    private String name;
    private String last_name;


    public Amir() {
    }

    public Amir(String name, String last_name) {
        this.name = name;
        this.last_name = last_name;
    }

    public String getName() {
        return name;
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
}
