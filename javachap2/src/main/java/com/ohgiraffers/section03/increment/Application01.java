package com.ohgiraffers.section03.increment;

public class Application01 {

    public static void main(String[] args) {

        // 수업목표. 증감연산자에 대해 이해하고 활용할 수 있다.
        /* 필기.
                증감연산자
                - 피연산자의 앞 or 뒤에 사용이 가능하다.
                    '++' : 1증가의 의미
                    '--' : 1감소의 의미
         */

        int num = 20;
        System.out.println("num = " + num);

        num++;              // 1증가
        System.out.println("num = " + num);

        ++num;              // 1증가
        System.out.println("num = " + num);

        num--;
        System.out.println("num = " + num);

        --num;
        System.out.println("num = " + num);

        // 목차. 2. 증감연산자를 다른 연산자와 함께 사용
        /* 필기.
                주의사항
                증감연산자는 다른 연산자와 함께 사용할 때 의미가 달라진다!!
                다른 연산자와 함께 사용할 때 증감 연산자의 의미
                '++num' : 피연산자의 값을 먼저 1을 증가시킨 후 다른 연산을 진행함.
                'num++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킨다.
         */

        int firstNum = 20;

        int result1 = firstNum++ * 3;

        System.out.println("result1 = " + result1);    // 우선순위 : 곱셈먼저 진행후 result1 값출력
        System.out.println("firstNum = " + firstNum);  //           이후 firstNum++ 증가 => 뒤에있으니까 나중에증가로 암기

        int secondNum = 20;

        int result2 = ++secondNum * 3;

        System.out.println("result2 = " + result2);     // 우선순위 : secondNum 값 증가 후 곱셈 계산 진행
        System.out.println("secondNum = " + secondNum);

        int num1 = 10;
        int addNum = num1++;            // = 이라는 대입"연산자"를 만났기 때문에 연산을 먼저하고 값이 늘어나는 것

        System.out.println("addNum = " + addNum);

        System.out.println("num1 = " + num1);


    }

}
