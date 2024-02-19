package com.ohgiraffers.section02.encapsulation.problem4;

public class Test01 {

    public static void main(String[] args) {

        TestMonster monster1 = new TestMonster();

        monster1.setAge(100);       // private 은 다른 클래스에서 읽기도 불가능 걍 불러올 수 없는 파일.

        monster1.setName("안녕몬");
        monster1.setHp(300);

    }
}
