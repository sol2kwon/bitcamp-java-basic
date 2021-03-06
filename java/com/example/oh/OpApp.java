package com.example.oh;
/**
 * packageName: com.example
 * fileName   : OpApp.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       : 숫자2개와 연산자를 받아서 결과를 리턴하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */

public class OpApp {
    public static String website = "계산기 어플";
    private int num1;
    private String opcode;
    private int num2;

    public String oh(int num1, String opcode, int num2){
        this.num1 = num1;
        this.opcode=opcode;
        this.num2=num2;
        int result = num1+num2;

        return String.format("%d %s %d = %d",this.num1,this.opcode,this.num2,result);



    }

}
