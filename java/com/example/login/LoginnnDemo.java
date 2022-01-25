package com.example.login;
/**
 * packageName: com.example
 * fileName   :  LoginnnDemo.Java
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       :  id,pw,name을 실행하는 앱
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */

import java.util.Scanner;

public class LoginnnDemo {
    public static void main(String[] args) {
        System.out.println(LoginnnApp.website);
        Scanner scanner = new Scanner(System.in);
        LoginnnApp loginnnApp  = new LoginnnApp();
        System.out.println("ID:  ");
        String id = scanner.next();
        System.out.println("PW:  ");
        String pw = scanner.next();
        System.out.println("Name");
        String name = scanner.next();
        String result = loginnnApp.login(id,pw,name);
        System.out.println(result);
    }
}
