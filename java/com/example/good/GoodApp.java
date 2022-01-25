package com.example.good;

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
