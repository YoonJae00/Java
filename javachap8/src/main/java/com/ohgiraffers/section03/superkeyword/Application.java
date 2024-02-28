package com.ohgiraffers.section03.superkeyword;

import java.util.Date;

public class Application {

    public static void main(String[] args) {

        // 수업목표. super 와 super() 에 대해 이해할 수 있다.
        /* 필기.
            super : 자식클래스를 이용해서 객체를 생성할 때 부모 생성자를 호출해서
                    부모 클래스의 인스턴스도 함께 생성하게 된다.
                    이 때 부모의 인스턴스 주소를 보관하는 레퍼런스변수로
                    자식 클래스 내의 모든 생성자와 메소드 내에서 선언하지 않고도
                    사용할 수 있는 레퍼런스 변수이다.
            super() : 부모 생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가 일치하는
                      부모의 생성자를 호출하게 된다. this()가 해당 클래스 내의 다른 생성자를 호출하는
                      구문이라면, super()는 부모 클래스가 가지는 private 생성자를 제외한 나머지 생성자를 호출할 수 있다.
         */
        Product product1 = new Product();
        product1.getInfo();

        Product product2 = new Product("A3210", "삼성", "갤럭시", 2000000, new Date());
        System.out.println(product2.getInfo());

        // Computer 기본 생성자
        Computer computer1 = new Computer();
        System.out.println(computer1.getInfo());

        // Computer 모든 필드 초기화 하는 생성자
        Computer computer2 = new Computer("i9",512,16,"Window11");
        System.out.println(computer2.getInfo());

        Computer computer3 = new Computer("A1234","아이폰","애플",2000000,new Date(),"i9",1024,32,"MacOS");
        System.out.println(computer3.getInfo());
    }
}