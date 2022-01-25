package com.example.Google;

/**
 * packageName: com.example.Google
 * fileName   : GoogleApp
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       :
 * 클래스변수   : GooleApp
 * 인스턴스변수 : message
 * 로컬변수    : result
 * 파라미터    : message
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */
public class GoogleApp {
    public static String web = "Google";
    private String message;

    public String goo(String message){
        this.message = message;
        String result = "%s을(를) 검색한 결과입니다.";
        return String.format(result,this.message);


    }
}
