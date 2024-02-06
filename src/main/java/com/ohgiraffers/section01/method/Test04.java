package com.ohgiraffers.section01.method;

public class Test04 {

    public static void main(String[] args) {
        // 1부터 n까지의 숫자 중에서 마지막 짝수와 짝수의 개수를 메소드를 이용하여 출력하시오
        Test04 app1 = new Test04();
        int n = 17;
        int result = (n/2 == 0)? n/2-1 : n/2;
//        System.out.println(result);
        app1.num(result);

    }

    public void num(int result){
        // n번 반복
        int as = result * 2;
        System.out.println("마지막 짝수는 : " + result * 2);
        System.out.println("짝수의 개수는 : " + result);

    }
}
