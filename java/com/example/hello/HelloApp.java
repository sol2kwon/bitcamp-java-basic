package com.example.hello;

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
