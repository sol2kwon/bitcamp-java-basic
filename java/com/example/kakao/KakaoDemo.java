package com.example.kakao;

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
