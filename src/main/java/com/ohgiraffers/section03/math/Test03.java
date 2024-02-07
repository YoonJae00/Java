package com.ohgiraffers.section03.math;

import java.util.Random;

public class Test03 {

    public static void main(String[] args) {

        java.util.Random app3 = new Random();


        //0 ~ 19
        int result1 = (int)(Math.random()*20);
        int resulta = (int)(java.lang.Math.random()*20);
        int result2 = app3.nextInt(20);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("resulta = " + resulta);
        //1 ~ 5
        int result3 = (int)(Math.random()*5)+1;
        int result4 = app3.nextInt(5)+1;
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        //3 ~ 12
        int result5 = (int)(Math.random()*10)+3;
        int result6 = app3.nextInt(10)+3;
        System.out.println("result5 = " + result5);
        System.out.println("result6 = " + result6);
        //8 ~ 23
        int result7 = (int)(Math.random()*16)+8;
        int result8 = (int)(app3.nextInt(16))+3;
        System.out.println("result7 = " + result7);
        System.out.println("result8 = " + result8);

    }

}
