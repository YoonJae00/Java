package com.ohgiraffers.section02.encapsulation.problem3;

public class Application01 {

    public static void main(String[] args) {

        // 수업목표. 필드에 직접 접근 시 발생하는 문제를 해결하는 방법(3)

        Monster monster1 = new Monster();
        monster1.setName("드라큘라");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setName("프랑켄슈타인");
        monster2.setHp(200);

        Monster monster3 = new Monster();
        monster3.setName("미라");
        monster3.setHp(300);

    }
}
