package com.ohgiraffers.section01.literal;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 문자열 합치기 결과를 예측하고 사용할 수 있다.*/
        /* 목차. 1. 두 개의 문자열 합치기 */
        System.out.println("================ 두 개의 문자열 합치기 ================");
        System.out.println(9 + 9);      //값 = 9
        System.out.println("9" + 9);    //값 = 99
        System.out.println(9 + "9");    //값 = 99
        System.out.println("9" + "9");  //값 = 99

        /* 목차. 2. 세 개의 문자열 합치기 */
        System.out.println("================ 두 개의 문자열 합치기 ================");
        System.out.println(9 + 9 + "9");    // 일반적인 연산 방향 ======>
        System.out.println(9 + "9" + 9);
        System.out.println("9" + 9 + 9);    // 연산 방향 대로 가면 문자열로 합쳐진다.
        /* System.out.println("9" + 9 + 9);    // Q. 이 결과를 918 로 만들고 싶다.*/
        System.out.println("9" + (9 + 9));

        System.out.println("============ 10과 20의 사칙연산 결과 보기 좋게 출력하기 ============");
        System.out.println("10과 20의 합 : " + (10 + 20));     /* 괄호를 묶지 안으면 문자열 합치기가
                                                                 일어나서 결과가 1020이 된다.*/
        System.out.println("10과 20의 합 : " + 10 + 20);       // why? 문자열이 연산방향 때문에 붙어진다.

        //수정 확인용




    }
}
