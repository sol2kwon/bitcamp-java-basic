package com.example.demo;

import java.util.Scanner;

public class HellowApp {
    String id = "";
    String pw = "";
    String name = "";

    public String hellow(String paramId, String paramPw, String paramName) {
        id = paramId;
        pw = paramPw;
        name = paramName;
        return "ID" +id+ " PW "+pw+ " Name "+name;

    }
}



