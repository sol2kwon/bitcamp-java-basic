package com.example.good;
/**
 * packageName: com.example
 * fileName   : GoodApp.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       : 이름과 나이를 받아서 결과를 리턴하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */

public class GoodApp {
    public static String website = "이름과 나이를 말씀해주세요";
    private String name;
    private int age;

    public String good(String name, int age){
        this.name = name;
        this.age = age;

        return String.format("%s %d", this.name,this.age);
    }
}
