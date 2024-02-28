package com.ohgiraffers.section04.constructor;

public class Test01 {
    private int age;

    public Test01(){}
    public Test01(int age){
        this.age= age;
    }

    public void show(){
        System.out.println(age);
    }
}
