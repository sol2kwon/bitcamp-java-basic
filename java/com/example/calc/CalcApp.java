package com.example.calc;
/**
 * 숫자 2개와 연산자 1개를 받아서 계산하는 계산을 코딩하시오
 * int/String
 */

public class CalcApp {
    public static String CALCCC_APP = "계산기";
    private int num1;
    private String opcode;
    private int num2;

    public String calccc(int num1,String opcode,int num2){
       this.num1 = num1;
       this.opcode = opcode;
       this.num2 = num2;
       int result = num1+num2;
       return String.format("%d %s %d = %d " , this.num1, this.opcode, this.num2,result);


    }

}
