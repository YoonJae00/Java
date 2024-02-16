package com.ohgiraffers.section02.encapsulation.problem1;

public class TestMonster {


    String name;
    int hp;
    int mp;

    public void plusHp(int hp,int mp) {

        this.hp = hp * 2;
        this.mp = mp * 2;
    }

}
