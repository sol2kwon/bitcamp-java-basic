package com.example.login;

public class LoginnnApp {
    public static String website = "어서오세요";
    String id = "";
    String pw = "";
    String name = "";

    public String login(String id, String pw,String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        return String.format("ID : %s, PW:%s, Name:%s", this.id, this.pw, this.name);




    }



}
