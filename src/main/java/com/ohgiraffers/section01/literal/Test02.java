package com.ohgiraffers.section01.literal;

//160.05
public class Test02 {


    public static void main(String[] args) {

        int k2 = 964000;
        double a = 5 * (0.8 * k2);
        double b = 2 * (0.9 * k2);
        System.out.println("총액은 " + (a + b) + "원 입니다");;
        System.out.println("K2 5자루 가격은 " + a + "이고 " + "2자루 가격은 " + b + "원 입니다");
        System.out.println("K2 5자루 - K2 2자루의 값은 " + (a - b) + " 원 입니다.");

  /* 필기 K2소총 가격은 964000원이다
            int K2 =964000;
            K2 소총을 7자루를 사고 5자루는 20프로 2자루는 10프로를 할인 받았을때 총액입니다 (문자열)붙이기
            (예시) 00000000 입니다
            문제 2 : K2 5자루 가격 000000"이고" > 2자루 가격 000000"입니다". */


    }
}
