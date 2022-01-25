package com.example.calc;
/**
 * packageName: com.example
 * fileName   : CalcDemo.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       : 계산기를 실행하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {
        System.out.println(CalcApp.CALCCC_APP);
        CalcApp calcApp = new CalcApp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자1:  ");
        int num1 = scanner.nextInt();
        System.out.println("연산기호 + - * /:");
        String opcode = scanner.next();
        System.out.println("숫자2:  ");
        int num2 = scanner.nextInt();
        String result = calcApp.calccc(num1,opcode,num2);
        System.out.println(result);




    }
}
