package com.example.Google;

import java.util.Scanner;

/**
 * packageName: com.example.Google
 * fileName   : GoogleDemo
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */
public class GoogleDemo {
    public static void main(String[] args) {
        System.out.println(GoogleApp.web);
        Scanner scanner = new Scanner(System.in);
        GoogleApp googleApp = new GoogleApp();
        System.out.println("Google 검색 또는 URl 입력");
        String message = scanner.next();
        String result = googleApp.goo(message);
        System.out.println(result);

    }
}
