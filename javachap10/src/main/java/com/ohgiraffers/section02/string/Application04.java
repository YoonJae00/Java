package com.ohgiraffers.section02.string;


public class Application04 {

    public static void main(String[] args) {

        // 수업목표. 이스케이프(escape) 문자에 대해 이해하고 적용할 수 있다.
        /* 필기.
            문자열 내에서 사용하는 문자 중 특수문자를 표현하거나 특수기능을 사용할 때 사용.
            \n : 개행
            \t : 탭
            \' : 작은 따옴표
            \" : 큰 따옴표
            \\ : 역슬래쉬 표시
         */
        // 개행
        System.out.println("안녕하세요. \n저는 홍길동입니다");
        // 탭
        System.out.println("안녕하세요. \t저는 홍길동입니다");
        // 홀 따옴표
        System.out.println("안녕하세요. \'저는 홍길동입니다\'");
//        System.out.println('''); // 홀따옴표 문자와 문자 리터럴 기호가 중복됨.
        System.out.println('\'');
        // 큰 따옴표
        System.out.println("안녕하세요. 저는 \"홍길동\"입니다");
        System.out.println('\"');
        // 역슬래쉬
        System.out.println("안녕하세요. \\저는 홍길동입니다\\");

    }
}
