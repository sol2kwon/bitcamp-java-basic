package com.example.demo;

public class LogingApp {
    public static String website = "=====Naver=====";
    private String id;
    private String pw;
    private String name;

    public String loging(String parId, String parPw, String parName){
    id = parId;
    pw = parPw;
    name = parName;
    return "아이디 "+ id +" 비밀번호 "+ pw +" 이름 "+name;

    }
}
