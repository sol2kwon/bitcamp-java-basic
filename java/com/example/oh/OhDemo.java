package com.example.oh;
/**
 * packageName: com.example
 * fileName   : OhDemo.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       : 계산기를 실행하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */

import java.util.Scanner;

public class OhDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OpApp opApp = new OpApp();
        System.out.println("숫자");
        int num1 = scanner.nextInt();
        System.out.println("연산자");
        String opcode = scanner.next();
        System.out.println("숫자");
        int num2 = scanner.nextInt();
        String result = opApp.oh(num1,opcode,num2);
        System.out.println(result);


    }
}
