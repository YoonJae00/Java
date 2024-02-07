package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 정수형 입력받기
        int result1 = sc.nextInt();
        System.out.println("result1 = " + (int)result1);

        // 실수형 입력받기
        double result2 = sc.nextDouble();
        System.out.println("result2 = " + result2);

        // 문자열 입력받기
        String result3 = sc.nextLine();
        System.out.println("result3 = " + result3);
        String result4 = sc.next();
        System.out.println("result4 = " + result4);
        // 문자 입력받기
        char result5 = sc.next().charAt(2);
        System.out.println("result5 = " + result5);

        // 형변환 해보기
        int result6 = sc.nextInt();
        System.out.println("result1 = " + (char)result6);

    }


}
