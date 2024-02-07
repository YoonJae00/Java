package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;




public class ImportTest02 {

    public static void main(String[] args) {

        Calculator app2 = new Calculator();
        int result1 = app2.minNumberOf(100,40);
        System.out.println("result1 = " + result1);

        int result2 = Calculator.maxNumberOf(500,20);
        System.out.println("result2 = " + result2);


    }

}
