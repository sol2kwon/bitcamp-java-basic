package com.example.hello;
/**
 * packageName: com.example
 * fileName   : HelloApp.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       : id,pw,name을 받아서 리턴하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */


public class HelloApp {
    public static String HELLO_KKK = "헬로";
    private String id;
    private String pw;
    private String name;

    public String hello(String id,String pw,String name){
        this.id = id;
        this.pw = pw;
        this.name = name;

        return String.format("%s %s %s" , this.id, this.pw, this.name);



    }



}
