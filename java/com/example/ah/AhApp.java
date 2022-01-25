package com.example.ah;
/**
 * packageName: com.example
 * fileName   : AhApp.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       : 이름과 나이를 입력받아서, 인사말을 리턴하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */

public class AhApp {
    public static String website = "하이이이이이";
    private String id;
    private String pw;
    private String name;

    public String ahh(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;

        return String.format("%s %s %s",this.id, this.pw,this.name);

    }

}