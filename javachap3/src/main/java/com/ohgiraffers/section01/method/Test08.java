package com.ohgiraffers.section01.method;

public class Test08 {

    //x 초가 주어졌을때 (x 는 항상 3600보다 크다.
    // a 시간 b 분 c 초 형식으로 변환하여 출력하는 메소드를 구현해라.


    //입력: x = 3690
    //출력: 1시간 1분 30초
    public static void main(String[] args) {

        Test08 app = new Test08();
        app.method(3690);

    }

    public static void method(int second) {
        // 여기에 코드를 구현해라.
        int second1 = second % 60;
        int minutea = second / 60;
        int minute = (minutea) % 60;
        int hour = minutea / 60;
        System.out.println(hour + "시간 " + minute + "분 " + second1 + "초");


    }
}
