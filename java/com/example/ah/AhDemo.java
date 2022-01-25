package com.example.ah;

import java.util.Scanner;
/**
 * packageName: com.example
 * fileName   : AhDemo.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       : 인사말을 실행하는 컨트롤러
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */

public class AhDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AhApp ahApp = new AhApp();
        System.out.println("아이디");
        String id = scanner.next();
        System.out.println("비번");
        String pw = scanner.next();
        System.out.println("이름");
        String name=scanner.next();
        String result = ahApp.ahh(id,pw,name);
        System.out.println(result);
    }
}
