package com.ohgiraffers.test;

public class Test01 {

    public static void main(String[] args) {

        int a = 2;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("result = " + result);
        } catch (ArithmeticException e){
            System.out.print("오류 발생!! 오류 원인 : ");
            System.out.print(e.getMessage());
        }

    }
}
