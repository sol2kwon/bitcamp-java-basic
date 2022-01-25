package com.example.demo;

import java.util.Scanner;

public class CalccDemo {
    public static void main(String[] args) {
        System.out.println(CalccApp.website);
        Scanner scanner = new Scanner(System.in);
        CalccApp calccApp = new CalccApp();
        System.out.println("숫자1: ");
        System.out.println("연산기호: ");
        System.out.println("숫자2: ");
        int num1 = scanner.nextInt();
        String opcode = scanner.next();
        int num2 = scanner.nextInt();
        System.out.println("결과: ");
        String result = calccApp.calcc(num1,opcode,num2);
        System.out.println(result);


    }
}
