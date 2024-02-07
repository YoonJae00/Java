package com.ohgiraffers.section03.math;

import java.util.Random;

public class Test02 {

    public static void main(String[] args) {


        // 20~ 40 까지의 랜덤값

        int result = (int) (Math.random() * 21) + 20;

        System.out.println("result = " + result);
        // java.lang패키지는 import 하지 않고 사용할 수 있도록 해 놓았다.

        java.util.Random random = new Random();

        int result1 = random.nextInt(21) + 20;

        System.out.println("result1 = " + result1);

    }
}
