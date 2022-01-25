package com.example.kakao;
/**
 * packageName: com.example
 * fileName   : KakaoDemo.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       : 전화번호와 메시지를 실행하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */

import java.util.Scanner;

public class KakaoDemo {
    public static void main(String[] args) {
        System.out.println(KakaoApp.website);
        KakaoApp kakaoApp  = new KakaoApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("전화번호:  ");
        String telno1 = scanner.next();
        System.out.println("메시지:  ");
        String message = scanner.next();
        System.out.println("결과:  ");
        String result = kakaoApp.kakao(telno1,message);
        System.out.println(result);

    }
}
