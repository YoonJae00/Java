package com.ohgiraffers.section04.uses;

public class RacingCar extends Car implements Soundable{

    @Override
    public void go() {
        System.out.println("레이싱카가 출발합니다...");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다...");
    }

    @Override
    public void horn() {
        System.out.println("레이싱카 소리~~~");
    }
}
