package com.ohgiraffers.section01.object.run;

import com.ohgiraffers.section01.object.book.Book;

public class Application02 {

    public static void main(String[] args) {

        // 수업목표. Object 클래스의 equals() 메소드 오버라이딩 목적을 이해하고, 할용할 수 있다.
        /* 필기.
            equals() 메소드 오버라이딩
            equals() ㅁ[소드는 매개변수로 전달받은 인스턴스와 == 연산하여 true of false 로 반환한다.
            즉, 동일한 인스턴스인 지 비교하는 역할을 한다.

           필기.
            동일객체와 동등객체
            동일객체 : 주소가 동일한 인스턴스를 동일객체라고한다.
            동등객체 : 주소가 다르더라도 필드값이 동일한 객체를 동등객체라고 한다.
         */

        Book book1 = new Book(1, "홍길동전", "허균", 100000);
        Book book2 = new Book(1, "홍길동전", "허균", 100000);

        /* 필기.
            equals() 메소드의 기본 기능은 동일객체를 판달한 수 있다.
            경우에 따라서 동등객체(값이 같은 지)를 동일 객체로 취급해서 비교하고 싶은 경우가 생길 수 있다.
            그러한 경우에 equals() 메소드를 오버라이딩 하여, 각각의 필드가 동일한 값을 가지는 지 확인하고
            모든 필드 값이 같은 경우 true, 아닌 경우 false 를 반환한다.
         */

        System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));
        System.out.println("두 인스턴스의 equals() 연산 비교 : " + book1.equals(book2));


    }
}
