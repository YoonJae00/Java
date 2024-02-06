package com.ohgiraffers.section01.method;

public class Application08 {

    public static void main(String[] args) {

        // 수업목표. static 메소드를 호출할 수 있다.
        /* 필기.
                static 메소드 호출
         */

        /* 필기.
                static 메소드 호출하는 방법 ( main 메소드 돌기전 static 미리 만들어놓음 )
                클래스명.메소드명(); <<<< 이런 방식으로 호출. ( 바로 사용 가능??)
         */

        System.out.println("10과 20의 합 : " + Application08.sumTwoNumbers(10, 20));
        /* 필기. 동일한 클래스 내에 작성된 static 메소드는 클래스명이 생략 가능하다. */
        System.out.println("20과 30의 합 : " + sumTwoNumbers(10, 30));      // static 안쓰면 sum~메소드를 못 읽기 떄문에 오류
                                                                           // static 는 main 메소드전 미리 만들어놓음
    }



    public static int sumTwoNumbers(int first, int second) {

        return (first + second);
    }

}
