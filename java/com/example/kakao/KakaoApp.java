package com.example.kakao;
/**
 * packageName: com.example
 * fileName   : KakaoApp.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       : 전화번호와 메시지를 받아서 전송하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */


public class KakaoApp {
    public static String website = "안녕하세요";
    private String telno1;
    private String message;

    public String kakao(String telno1,String message){
        this.telno1=telno1;
        this.message=message;


        return String.format("%s %s",telno1,message);
    }
}
