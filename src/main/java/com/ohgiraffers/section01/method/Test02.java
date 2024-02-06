package com.ohgiraffers.section01.method;

public class Test02 {

    public static void main(String[] args) {


        int a = 54321;
        int q = a / 10000; // 1
        int w = (a % 10000) / 1000; // 2
        int e = (a % 1000) / 100; // 3
        int r = (a % 100) / 10; // 4
        int t = a % 10; // 5

        System.out.println(q);
        System.out.println(q+w+e+r+t);
    }
}
