package com.example.demo;

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        CalcApp calcApp = new CalcApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println(CalcApp.website);
        System.out.println("숫자1: ");
        System.out.println("연산기호: ");
        System.out.println("숫자2: ");
        int num1 = scanner.nextInt();
        String opcode = scanner.next();
        int num2 = scanner.nextInt();
        System.out.println("Output: ");
        String result = calcApp.calc(num1,opcode,num2);
        System.out.println(result);
    }
}
