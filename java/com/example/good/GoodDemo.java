package com.example.good;
/**
 * packageName: com.example
 * fileName   : GoodDemo.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       : 이름과 나이를 실행하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */

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
