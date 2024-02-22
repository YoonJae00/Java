package com.ohgiraffers.section01.polymorphism;

public class 호랑이 extends 동물 {

    @Override
    public void 먹기() { System.out.println("호랑이가 고기를 뜯어먹습니다..."); }

    @Override
    public void 달리기(){ System.out.println("호랑이가 어슬렁 어슬렁 거립니다."); }

    @Override
    public void 울기() { System.out.println("어흥!!! "); }

    public void 물어뜯기() {
        System.out.println("뜯습니다!!");
    }

}
