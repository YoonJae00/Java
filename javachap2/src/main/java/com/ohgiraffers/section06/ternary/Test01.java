package com.ohgiraffers.section06.ternary;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {

        Scanner yjm = new Scanner(System.in);

        String loginId = "YJM1234";
        String pw = "1q2w3e4r!";
        System.out.println("ID를 입력하세요 : ");
        String inputString = yjm.next();
        String result = ( inputString == loginId) ? "로그인 성공" : "로그인 실패";
        System.out.println("로그인 결과 : " + result);
        System.out.println("PW를 입력하세요 : ");
        String inputString1 = yjm.next();
        String pwResult = (inputString1 == pw ) ? "PW 성공" : "PW 실패";
        System.out.println("PW 결과 : " + pwResult);



    }

}
