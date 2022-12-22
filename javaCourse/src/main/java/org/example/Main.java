package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        FileOutputStream fileOutputStream =new FileOutputStream("file.txt");
        fileOutputStream.write("my name is marko".getBytes());

        FileInputStream fileInputStream = new FileInputStream("file.txt");
        int data;

        while ((data=fileInputStream.read())!=-1){
            System.out.println(data);
        }



    }
}