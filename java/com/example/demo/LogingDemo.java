package com.example.demo;

import java.util.Scanner;

public class LogingDemo {
    public static void main(String[] args) {
        System.out.println(LogingApp.website);
        Scanner scanner = new Scanner(System.in);
        LogingApp logingApp = new LogingApp();
        System.out.println("아이디:  ");
        System.out.println("비밀번호:  ");
        System.out.println("이름:  ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        System.out.println("결과:  ");
        String result =logingApp.loging(id,pw,name);
        System.out.println(result);
    }
}
