package com.example.demo;

import java.util.Scanner;

public class CalcApp {
    public static String website = "=== Calc.com ===";
    private int num1;
    private int num2;
    private String opcode;


    public String calc(int n1, String op, int n2){
        num1 = n1;
        opcode = op;
        num2 = n2;
        int result = num1+num2;

        return num1 + " " + opcode + " " + num2 + " = "+result;
    }
}








