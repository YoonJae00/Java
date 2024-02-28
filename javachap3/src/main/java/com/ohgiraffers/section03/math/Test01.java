package com.ohgiraffers.section03.math;

import java.util.Random;

public class Test01 {

    public static void main(String[] args) {

       // 절댓값 출력
        int a = -200;
        int result = java.lang.Math.abs(a);

        System.out.println("result = " + result);

        // 절댓값 출력뒤 루트값 출력
        int b = -400;
        double c = Math.sqrt(Math.abs(b));
        System.out.println("c = " + c);
    }
}
