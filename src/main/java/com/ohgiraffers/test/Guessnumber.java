package com.ohgiraffers.test;

import java.util.Scanner;

public class Guessnumber {

    public static void main(String[] args) {
        // 1 ~ 100 까지의 숫자중 원하는 값 찾기 (업 앤 다운) 기회 5번
        Guessnumber app = new Guessnumber();

        Scanner sc = new Scanner(System.in);
        // 1 ~ 100
        int result = (int) (Math.random() * 100) + 1;
        System.out.println("result = " + result);
        int cnt = 0;
        System.out.print("1 ~ 100 까지의 숫자중 추측해 보세요 : ");
        int player1 = sc.nextInt();
        if (player1 < result){
            System.out.println("추측한 값보다 큽니다");
        } else if (player1 > result) {
            System.out.println("추측한 값보다 작습니다");
        } else {
            System.out.println("정답!!");
        }

        System.out.print("1 ~ 100 까지의 숫자중 추측해 보세요 : ");
        int player2 = sc.nextInt();
        if (player2 < result){
            System.out.println("추측한 값보다 큽니다");
        } else if (player2 > result) {
            System.out.println("추측한 값보다 작습니다");
        } else {
            System.out.println("정답!!");
        }


        System.out.print("1 ~ 100 까지의 숫자중 추측해 보세요 : ");
        int player3 = sc.nextInt();
        if (player3 < result){
            System.out.println("추측한 값보다 큽니다");
        } else if (player3 > result) {
            System.out.println("추측한 값보다 작습니다");
        } else {
            System.out.println("정답!!");
        }


        System.out.print("1 ~ 100 까지의 숫자중 추측해 보세요 : ");
        int player4 = sc.nextInt();
        if (player4 < result){
            System.out.println("추측한 값보다 큽니다");
        } else if (player4 > result) {
            System.out.println("추측한 값보다 작습니다");
        } else {
            System.out.println("정답!!");
        }



        System.out.print("1 ~ 100 까지의 숫자중 추측해 보세요 : ");
        int player5 = sc.nextInt();
        if (player5 < result){
            System.out.println("추측한 값보다 큽니다");
        } else if (player5 > result) {
            System.out.println("추측한 값보다 작습니다");
        } else {
            System.out.println("정답!!");
        }



    }

    public int guessUp() {

        System.out.println("추측한 값보다 큽니다");
        return 1;
    }

    public int guessDown() {

        System.out.println("추측한 값보다 작습니다");
        return 1;
    }

    public int guessCorrect() {

        System.out.println("정답!!");
        return 0;
    }

    public int fail(){

        System.out.println("메롱");

        return 0;
    }
}
