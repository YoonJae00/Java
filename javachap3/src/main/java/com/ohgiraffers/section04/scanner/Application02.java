package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {

        // 수업목표. Scanner의 nextLine() 과 next() 에 대해 구분하여 사용할 수 있다.
        /* 필기.
                nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행문자 전 까지 읽어서 문자열로 반환한다.(공백문자 포함)
                next() : 공백문자나 개행문자 전 까지 읽어서 문자열로 반환한다. (공백문자 포함하지 않음)
         */

        // 목차. 1. Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 목차. 2. 문자열 입력
        // 목차. 2-1. nextLine()
        System.out.print("인사말을 입력해주세요 : \n");
        String greeting = sc.nextLine();
        System.out.println(greeting);

        // 목차. 2-2. next()
        System.out.println("인사말을 입력해주세요2 : ");
        String greeting2 = sc.next();       // 공백문자를 기준으로 따로 나눠서 관리 한다.
        System.out.println(greeting2);



    }
}
