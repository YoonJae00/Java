package com.ohgiraffers.section05.logical;

public class Test05 {

    public static void main(String[] args) {

        int num = 1;
        int result =(false && ++num>0) ? num : num;
        System.out.println("result = " + result);
    }
}
