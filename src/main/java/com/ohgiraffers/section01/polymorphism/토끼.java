package com.ohgiraffers.section01.polymorphism;

public class 토끼 extends 동물 {

    @Override
    public void 먹기(){ System.out.println("토끼가 풀을 먹습니다..."); }

    @Override
    public void 달리기(){ System.out.println("토끼가 깡총깡총 뜁니다!!"); }

    @Override
    public void 울기() { System.out.println("토끼가 삐약삐약 웁니다"); }

    public void 점프() { System.out.println("토끼가 점프합니다!!!!"); }
}
