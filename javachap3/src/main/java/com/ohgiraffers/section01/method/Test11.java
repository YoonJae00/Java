package com.ohgiraffers.section01.method;

public class Test11 {

    public static void main(String[] args) {

        // Calculator 클래스 에 있는 계산기를 가져올거임
        // minNumberOf

        Calculator app11 = new Calculator();
        int result1 = app11.minNumberOf(20,30);           // non-static
        System.out.println("result1 = " + result1);
        int result2 = Calculator.maxNumberOf(40,60);                    // static
        System.out.println("result2 = " + result2);
    }
}


