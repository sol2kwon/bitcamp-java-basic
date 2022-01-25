package com.example.bmi;

import java.util.Scanner;

/**
 * packageName: com.example.bmi
 * fileName   : BmiDemo
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */
public class BmiDemo {
    public static void main(String[] args) {
        System.out.println(BmiApp.web);
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();
        System.out.println("이름");
        String name = scanner.next();
        System.out.println("키");
        int ki = scanner.nextInt();
        System.out.println("몸무게");
        int mom = scanner.nextInt();
        String result = bmiApp.bmii(name,ki,mom);
        System.out.println(result);
    }
}
