package com.ohgiraffers.test;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {


        System.out.println("main 메소드 동작 실행함....");


        Application02 app2 = new Application02();
        app2.testMethod1(100);
        app2.testMethod2(200);
        System.out.println(app2.testMethod2(200));
        app2.testMethod3("김윤재", 22, '남');
        System.out.println("main 메소드 동작 종료함....");


    }

    public void testMethod1(int num) {
        System.out.println(++num);

    }

    public int testMethod2(int num) {
        System.out.println(++num);

        return num;
    }


    public void testMethod3(String name, int age, char gender) {

        System.out.println("이름 : " + name + "나이 : " + age + "성별 : " + gender);
    }
}
