package com.example.oh;

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
