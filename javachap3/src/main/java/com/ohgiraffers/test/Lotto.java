package com.ohgiraffers.test;

import java.util.Random;

public class Lotto {

    public static void main(String[] args) {
        // 1~45 번까지의 로또 번호 뽑기
        Random ran = new Random();
        int result1 = ran.nextInt(45) + 1;
        System.out.println("1st : " + result1);
        int result2a = ran.nextInt(45) + 1;
        int result2 = ran.nextInt(45) + 1;
        if (result2a == result1) {
            System.out.println("2nd : " + result2);
        } else {
            System.out.println("2nd : " + result2a);
        }
        int result3a = ran.nextInt(45) + 1;
        int result3 = ran.nextInt(45) + 1;
        if (result3a == result1 && result3a == result2) {
            System.out.println("3rd : " + result3);
        } else {
            System.out.println("3rd : " + result3a);
        }
        int result4a = ran.nextInt(45) + 1;
        int result4 = ran.nextInt(45) + 1;
        if (result4a == result1 && result4a == result2 && result4a == result3) {
            System.out.println("3rd : " + result4);
        } else {
            System.out.println("3rd : " + result4a);
        }
        int result5a = ran.nextInt(45) + 1;
        int result5 = ran.nextInt(45) + 1;
        if (result5a == result1 && result5a == result2 && result5a == result3 && result5a == result4) {
            System.out.println("4th : " + result5);
        } else {
            System.out.println("4th : " + result5a);
        }

    }
}
