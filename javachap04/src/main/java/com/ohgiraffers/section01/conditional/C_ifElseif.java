package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {

    public void testSimpleIfElseIfStatement() {

        // 수업목표. if-else-if문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
        /* 필기.
            [if - else - if 문 표현식]
            if(조건식1){
                조건식1 이 true 일 때 실행할 명령문;
            } else if(조건식2){
                조건식1 이 false 이고, 조건식2 가 true 일 때 실행할 명령문;
            } else{
                위의 조건 2개가 모두 거짓인 경우 실행할 명령문;
            }
         */

        /* 필기.
            if-else-if 문은 조건식 1의 결과 값이 참(true) 이면 if { } 안에 있는 코드 실행.
            조건식 1이 false 이면 조건식 2를 확인하여 참(true) 이면 else if { } 안에 있는
            코드를 실행한다.
            조건식1 과 조건식2 의 결과 값이 모두 거짓(false) 이면 else{ } 안에 있는 코드 실행.
         */
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");
        System.out.print("어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼) : ");
        Scanner sc = new Scanner(System.in);
        int dok2 = sc.nextInt();
        System.out.println("\n==========================================================================");
        if (dok2 == 1) {
            System.out.println("이런 거짓말 쟁이!! 너에게는 아무런 도끼도 줄 수 없구나!! 이 욕심쟁이야!!");
        } else if (dok2 == 2) {
            System.out.println("욕심이 과하지는 않지만 그래도 넌 거짓말을 하고 있구나!! 어서 썩 사라지거라!!");
        } else {
            System.out.println("오호~ 정직하구나~ 여기 있는 금도끼, 은도끼, 쇠도끼를 다 가져가거라!!");
        }
        System.out.println("그렇게 산신령은 다시 연못 속으로 사라지고 말았다...");
    }

}



