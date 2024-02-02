package com.ohgiraffers.section05.typecasting;

public class Test {

    public static void main(String[] args) {

        int x = 7;
        int y = 1;

        y += 10 - x++;

        // x = 8
        //  y = y + 2

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
