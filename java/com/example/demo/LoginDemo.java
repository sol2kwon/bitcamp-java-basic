package com.example.demo;

import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        LoginApp loginApp = new LoginApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println(LoginApp.website);
        System.out.println("Input ID: ");
        System.out.println("Input PW: ");
        System.out.println("Input Name: ");
        String id = scanner.next();
        String pw = scanner.next();
        String name = scanner.next();
        System.out.println("Output: ");
        String result = loginApp.login(id,pw,name);
        System.out.println(result);

    }
}
