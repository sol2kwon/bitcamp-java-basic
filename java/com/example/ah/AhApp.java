package com.example.ah;

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