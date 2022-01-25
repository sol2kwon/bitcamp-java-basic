package com.example.good;

import java.util.Scanner;

public class GoodDemo {
    public static void main(String[] args) {
        System.out.println(GoodApp.website);
        Scanner scanner = new Scanner(System.in);
        GoodApp goodApp = new GoodApp();
        System.out.println("이름");
        String name = scanner.next();
        System.out.println("나이");
        int age = scanner.nextInt();
        String result = goodApp.good(name,age);
        System.out.println(result);


    }
}
