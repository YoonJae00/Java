//package com.ohgiraffers.section01.method;
//
//public class Test05 {
//    public static void main(String[] args) {
//        Test05 app4 = new Test05();
//        app4.sortNumbers(78, 23, 56);
//    }
//
//    public void sortNumbers(int number1, int number2, int number3) {
//        int min = number1 < number2 ? (number1 < number3 ? number1 : number3) : (number2 < number3 ? number2 : number3);
//        int max = number1 > number2 ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
//        int mid = (number1 != min && number1 != max) ? number1 : (number2 != min && number2 != max) ? number2 : number3;
//        System.out.println(min + "," + mid + "," + max);
//    }
