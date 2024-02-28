package com.ohgiraffers.section01.method;

public class Application04 {

    public static void main(String[] args) {

        // 수업목표. 여러 개의 전달 인자를 이용한 메소드를 호출할 수 있다.
        /* 필기.
                여러 개의 전달인자를 이용한 메소드 호출 테스트
         */
        int a = 22;
        Application04 app4 = new Application04();
        app4.testMethod("김윤재",a,'남',65.5);
    }

    public void testMethod(String name, int age, final char gender, double weight) {

        /* 필기.
                매개변수도 일종의 지역변수로 분류된다.
                매개변수 역시 final 키워드를 사용할 수 있다.
                지역변수에 final 키워드를 붙여 상수를 만드는 것과 동일하다.
         */

        System.out.print("나의 이름은 " + name + "입니다. ");
        System.out.print("나이는 " + age + "세 이며, ");
        System.out.print("성별은 " + gender + "입니다. ");
        System.out.println("몸무게는 " + weight + "입니다.");

    }
}
