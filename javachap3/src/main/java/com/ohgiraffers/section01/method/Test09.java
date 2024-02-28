package com.ohgiraffers.section01.method;


public class Test09 {

    public static void main(String[] args) {
        // 리턴 연습

        int a = 10;
        int b = 20;

        int e = (Test09.methodTest(a, b)) * 8;
        System.out.println("e = " + e);
    }

    public static int methodTest(int a, int b) {


        return a + b;
    }
}
