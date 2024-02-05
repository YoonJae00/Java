package com.ohgiraffers.section05.logical;

public class Test03 {

    public static void main(String[] args) {

        //영문자인지 확인하기

        char answer = '1';
        boolean a = answer >= 'a' && answer <= 'z';
        String result = (answer >= 'a' && answer <= 'z')? "맞습니다 !" : (answer >= 'A' && answer <= 'Z') ? "맞습니다 !" :  "땡!!!!";

        System.out.println("result = " + result);
    }
}
