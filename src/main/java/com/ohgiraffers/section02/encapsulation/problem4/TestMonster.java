package com.ohgiraffers.section02.encapsulation.problem4;

public class TestMonster {

    private String name;

    private int age;

    private int hp;

    public void setName(String name) {

        this.name = name;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public void setHp(int hp) {

        if (hp > 0) {
            this.hp = hp;
        } else if (hp <= 0) {
            System.out.println("사망하셨습니다.");
            this.hp = 0;
        }

    }
}
