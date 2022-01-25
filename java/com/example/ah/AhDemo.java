package com.example.ah;

import java.util.Scanner;

public class AhDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AhApp ahApp = new AhApp();
        System.out.println("아이디");
        String id = scanner.next();
        System.out.println("비번");
        String pw = scanner.next();
        System.out.println("이름");
        String name=scanner.next();
        String result = ahApp.ahh(id,pw,name);
        System.out.println(result);
    }
}
