package com.example.calc;
/**
 * packageName: com.example
 * fileName   : Test
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       : 숫자 2개와 연산자 1개를 받아서 계산하는 계산하는앱
 *  * 클래스변수   : CalcApp
 *  * 인스턴스변수 : num1,opcode,num2
 *  * 로컬변수    : result
 *  * 파라미터    : num1,opcode,num2
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
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
       int result = 0;
       if(opcode. equals("+")){
           result=num1+num2;
       }else if(opcode. equals("-")){
           result=num1-num2;
       }else if(opcode. equals("*")){
           result=num1*num2;
       }else if(opcode. equals("/")){
           result=num1/num2;
       }

       return String.format("%d %s %d = %d " , this.num1, this.opcode, this.num2,result);


    }

}
