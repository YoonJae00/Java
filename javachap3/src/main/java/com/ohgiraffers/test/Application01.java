package com.ohgiraffers.test;

public class Application01 {

    public static void main(String[] args) {

        // 수업목표. 메소드의 호출 호름을 연습해보자
        System.out.println("main 프로그램이 시작됩니다...");

        // 값 : new Application01()
        // 공간 : app1
        Application01 app1 = new Application01();
        app1.testMethod1();

        app1.testMethod2();

        System.out.println("main 프로그램이 모든 작업을 종류 후 없어집니다...");

    }

    public void testMethod1() {

        System.out.println("testMethod1 출력...");
        testMethod2();
        System.out.println("testMethod2 종료...");
    }

    public void testMethod2() {

        System.out.println("HI 나는 testMethod2 야~");

        System.out.println(testMethod3());  // 값 자체를 출력문에 넣어서 출력을 한 상태
        String hi = testMethod3();
        System.out.println("hi = " + hi);  // 값을 변수 공간에 담아서 출력을 한 상태

        System.out.println("testMethod2 ㅂㅂ2~~~~~~");

    }

    public String testMethod3(){


        return "testMethod3 안녕 불렀니~~~";
    }

}
