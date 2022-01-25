package com.example.naver;

import java.util.Scanner;

/**
 * packageName: com.example.naver
 * fileName   : NaverDemo
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */
public class NaverDemo {
    public static void main(String[] args) {
        System.out.println(NaverApp.web);
        Scanner scanner = new Scanner(System.in);
        NaverApp naverApp = new NaverApp();
        System.out.println("id");
        System.out.println("pw");
        String id = scanner.next();
        String pw = scanner.next();
        String result = naverApp.naver(id,pw);
        System.out.println(result);


    }
}
