package org.example;


import javax.management.remote.rmi.RMIServerImpl_Stub;

public class Main {
    public static void main(String[] args) {


        Methos methos= new Methos();
        System.out.println(methos.add(3,3));
        System.out.println( methos.add(4,5,6));

        Child child=new Child();
        child.add(2,2);



    }


}
