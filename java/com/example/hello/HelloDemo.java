package com.example.hello;

import java.util.Scanner;
/**
 * packageName: com.example
 * fileName   : HelloDemo.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       : id,pw,name을 실행하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */


public class HelloDemo {
    public static void main(String[] args) {
        System.out.println(HelloApp.HELLO_KKK);
        HelloApp helloApp = new HelloApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID:  ");
        String id = scanner.next();
        System.out.println("PW:  ");
        String pw = scanner.next();
        System.out.println("Name:  ");
        String name = scanner.next();
        String result = helloApp.hello(id,pw,name);
        System.out.println(result);



    }
}
