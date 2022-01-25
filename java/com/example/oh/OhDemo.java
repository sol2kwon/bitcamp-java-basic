package com.example.oh;

import java.util.Scanner;

public class OhDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OpApp opApp = new OpApp();
        System.out.println("숫자");
        int num1 = scanner.nextInt();
        System.out.println("연산자");
        String opcode = scanner.next();
        System.out.println("숫자");
        int num2 = scanner.nextInt();
        String result = opApp.oh(num1,opcode,num2);
        System.out.println(result);


    }
}
