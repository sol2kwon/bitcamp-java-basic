package com.example.login;
/**
 * packageName: com.example
 * fileName   : LoginnnApp.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       :  id,pw,name을 받아서 리턴하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */

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
