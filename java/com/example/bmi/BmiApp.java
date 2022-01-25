package com.example.bmi;

/**
 * packageName: com.example.bmi
 * fileName   : BmiApp
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       :
 * 클래스변수   : BmiApp
 * 인스턴스변수 : name,ki,mom
 * 로컬변수    : result
 * 파라미터    : name,ki,mom
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */
public class BmiApp {
    public static String web = "BMI 공개";
    private String name;
    private int ki;
    private int mom;

    public String bmii(String name, int ki, int mom){
        this.name = name;
        this.ki = ki;
        this.mom = mom;
        String result = String.format("%s님의 키는 %dcm,몸무게는 %dkg입니다.",this.name,this.ki,this.mom);
        return result;
    }
}
