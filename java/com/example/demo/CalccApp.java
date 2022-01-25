package com.example.demo;

public class CalccApp {
    public static String website = "====ccc====";
    private int num1;
    private int num2;
    private String opcode;

    public String calcc(int pn1,String pop, int pn2){
        num1 = pn1;
        opcode = pop;
        num2 = pn2;
        int result = num1 + num2;

        return num1+"  "+opcode+"  "+num2 +" = "+result;



    }


}
