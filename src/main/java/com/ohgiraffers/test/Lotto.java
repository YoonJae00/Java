package com.ohgiraffers.test;

import java.util.Random;

public class Lotto {

    public static void main(String[] args) {
        // 1~45 번까지의 로또 번호 뽑기
        Random ran = new Random();
        int result1 = ran.nextInt(45) - 1;
        System.out.println("1st : " + result1);
        int result2a = ran.nextInt(45) - 1;
        int result2 = (result2a == result1) ? ran.nextInt(45) - 1 : result2a;
        System.out.println("2nd : " + result2);
        int result3a = ran.nextInt(45) - 1;
        int result3 = (result3a == result1) ? ran.nextInt(45) - 1 : result3a==result2 ? ran.nextInt(45) - 1 : result3a;
        System.out.println("3rd : " + result3);
    }

}
