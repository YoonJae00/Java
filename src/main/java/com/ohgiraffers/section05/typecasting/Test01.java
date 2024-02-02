package com.ohgiraffers.section05.typecasting;

public class Test01 {

    public static void main(String[] args) {

        int var1 = 'a';
        short var2 = 30;
        short result = (short)var1 + var2;          //???? 왜 빨간줄

        System.out.println("result = " + result);



        byte var3 = 3;
        short var4 = 40;
        short result5 = (short)(var3 + var4);

        System.out.println("result5 = " + result5);
    }

}
