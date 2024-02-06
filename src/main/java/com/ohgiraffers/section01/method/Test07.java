package com.ohgiraffers.section01.method;

public class Test07 {

    //1000원 이하의 금액이 주어졌을때 그 금액의 최소 동전의 개수를 출력하는 메소드를 구현해라.

    public static void main(String[] args) {

        Test07 app = new Test07();
        app.method(800);
    }

    public void method(int total) {
        //(개수) a : 500 b : 100 c : 50 d : 10
        int a = total / 500;
        int a1 = total % 500;
        int b = a1 / 100;
        int b1 = a1 % 100;
        int c = b1 / 50;
        int c1 = b1 % 50;
        int d = c1 / 10;

        System.out.println("a개수: " + a + "개 b개수 :" + b + "개 c개수 :" + c + "개 d개수 :" + d + "개");
        System.out.println(a + b + c + d);

    }
}
