package com.example.hello;

import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        System.out.println(HelloApp.HELLO_KKK);
        HelloApp helloApp = new HelloApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID:  ");
        String id = scanner.next();
        System.out.println("PW:  ");
        String pw = scanner.next();
        System.out.println("Name:  ");
        String name = scanner.next();
        String result = helloApp.hello(id,pw,name);
        System.out.println(result);



    }
}
