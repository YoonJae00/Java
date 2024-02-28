package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine() {

        // 수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다.(1)

        // 필기. for문 안에서 for문을 이용할 수 있다.

//        for (int i = 2; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + ("*") + j + ("=") + (i * j));
//            }
//        }

        for (int dan = 2; dan < 10; dan++) {
            System.out.println();
            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        }

    }

    public void printUpgradeGugudan() {

        for (int dan = 2; dan < 10; dan++) {
            prinrGugudanOf(dan);
            System.out.println();
        }

    }

    public void prinrGugudanOf(int dan) {

        for (int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }

    }

    public void printStarInputRowTimes() {

        /* 필기.
            키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 행에 "*" 를 5개씩 출력하세요.
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int a = 0;
        for (int i = 0; i < num; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print('*');
                a++;
            }
        }
        System.out.println("\n * 출력개수 = " + a);


    }

    public void star() {
        Scanner sc = new Scanner(System.in);



    }
}
