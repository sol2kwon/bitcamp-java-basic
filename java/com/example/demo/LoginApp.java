package com.example.demo;

import java.util.Scanner;

public class LoginApp {
    public static String website = "Naver";
    private String id;
    private String pw;
    private String name;


    public String login(String paramId, String paramPw, String paramName){
            id = paramId;
            pw = paramPw;
            name = paramName;
            return "ID" + id + " PW " + pw + " Name " + name;
        }
}
