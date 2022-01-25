package com.example.naver;

/**
 * packageName: com.example.naver
 * fileName   : NaverApp
 * author     : kwonsolyi
 * date       : 2022-01-25
 * desc       :
 * * 클래스변수   : NaverApp
 *  * 인스턴스변수 : id,pw
 *  * 로컬변수    : result
 *  * 파라미터    : id,pw
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25       kwonsolyi       최초 생성
 */
public class NaverApp {
    public static String web = "Naver";
    private String id;
    private String pw;


    public String naver(String id,String pw){
        this.id = id;
        this.pw = pw;
        String result = String.format("ID %s 로그인 성공",this.id);
        return result;

    }
}
