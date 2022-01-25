package com.example.login;

import java.util.Scanner;

public class LoginnnDemo {
    public static void main(String[] args) {
        System.out.println(LoginnnApp.website);
        Scanner scanner = new Scanner(System.in);
        LoginnnApp loginnnApp  = new LoginnnApp();
        System.out.println("ID:  ");
        String id = scanner.next();
        System.out.println("PW:  ");
        String pw = scanner.next();
        System.out.println("Name");
        String name = scanner.next();
        String result = loginnnApp.login(id,pw,name);
        System.out.println(result);
    }
}
