package org.example;


import javax.management.remote.rmi.RMIServerImpl_Stub;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setId(1);
        address.setCity("grman");
        address.setStreet("grman");
        address.setFlatNumber("garman");


        Address address_sudent = new Address();
        address_sudent.setId(1);
        address_sudent.setCity("minsk");
        address_sudent.setStreet("misnk");
        address_sudent.setFlatNumber("belusrs");


        List<Student> list = new ArrayList<>();
        list.add(
                new Student(1, "name", "lastName", "+262727", "magdy@gamil.com", address)


        );
        list.add( new Student(2,"","name_1","last_name_1","mail@.come",address_sudent));


        Methos methos = new Methos();
        System.out.println(methos.add(3, 3));
        System.out.println(methos.add(4, 5, 6));

        Child child = new Child();
        child.add(2, 2);


    }


}
