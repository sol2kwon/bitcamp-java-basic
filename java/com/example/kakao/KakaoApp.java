package com.example.kakao;

/***
 * 전화번호와 메시지를 받아서 전송하는 어플
 * String telno, String message
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
