package com.ohgiraffers.section01.conditional;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class D_switch {

    public void testSimpleSwitchStatement() {

        // 수업목표. switch 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
        /* 필기.
            [switch 문 표현식]
            switch(비교할 변수){
                case 비교값1 : 비교값1 과 일치하는 경우 실행할 구문; break;
                case 비교값2 : 비교값2 과 일치하는 경우 실행할 구문; break;
                default : case 에 모두 해당하지 않는 경우 실행할 구문; break;
         */

        /* 필기.
            여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은
            if - else - if 와 유사하다.
            따라서 일부 호한이 가능하다.
            하지만, switch 문으로 비교 가능한 값은 정수,문자,문자열의 형태이다.
            실수와 논리는 비교할 수 없다.
            또한 정확하게 일치하는 경우만 비교할 수 있으며, 대소비교를 할 수 없다는게
            차이점이다.
         */

        /* 필기.
            정수 두 개와 연산 기호 문자를 입력 받아서
            두 숫자의 연산 결과를 출력해보는 간단한 계산기를 만들어보자.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수를 입력해주세요 : ");
        int second = sc.nextInt();
        System.out.println("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0);

        // 연산의 결과를 저장할 변수 생성
        int result = 0;

        // 입력한 연산기호 문자에 따라 연산의 결과가 달라짐
        switch (op) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            case '%':
                result = first % second;
                break;
        }
        System.out.println(first + " " + op + " " + second + " = " + result);

        System.out.println("========= 하이미디어 자판기 =========");
        System.out.println("사이다 콜라 환타 바카스 핫식스");
        System.out.println("========= 하이미디어 자판기 =========");
        System.out.print("음료를 선택해주세요 : ");
        String selectedDrink = sc.next();
        int price = 0;
        switch (selectedDrink) {
            case "사이다":
                System.out.println("사이다를 선택하셨습니다.");
                price = 500;
                break;
            case "콜라":
                System.out.println("콜라를 선택하셨습니다.");
                price = 600;
                break;
            case "환타":
                System.out.println("환타를 선택하셨습니다.");
                price = 700;
                break;
            case "바카스":
                System.out.println("바카스를 선택하셨습니다.");
                price = 2000;
                break;
            case "핫식스":
                System.out.println("핫식스를 선택하셨습니다.");
                price = 10000;
                break;
        }
        if (price == 0) {
            System.out.println("ERROR");
        } else {
            System.out.println(price + "원을 투입해주세요!");

        }

    }
}

