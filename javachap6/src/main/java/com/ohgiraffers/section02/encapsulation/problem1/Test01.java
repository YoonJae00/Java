package com.ohgiraffers.section02.encapsulation.problem1;

import java.util.Scanner;

public class Test01 {

    public static void main(String[] args) {

        TestMonster monster1 = new TestMonster();

        monster1.name = "헐크";
        monster1.hp = 1000;
        monster1.mp = 20000;
//        System.out.println(monster1.hp);
        monster1.plusHp(monster1.hp , monster1.mp);
//        System.out.println(monster1.hp);

        Scanner sc = new Scanner(System.in);
        System.out.print("사람 수 입력");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
        }

    }
}
