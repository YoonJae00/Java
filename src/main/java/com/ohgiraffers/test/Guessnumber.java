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

        System.out.println("1 ~ 100 까지의 숫자중 추측해 보세요 : ");
        int player1 = sc.nextInt();
        int a = (player1 < result) ? app.guessUp() : (player1 > result) ? app.guessDown() : app.guessCorrect();


        System.out.println("1 ~ 100 까지의 숫자중 추측해 보세요 : ");
        int player2 = sc.nextInt();
        int b = (player2 < result) ? app.guessUp() : (player2 > result) ? app.guessDown() : app.guessCorrect();
        int guessReturn2 = (app.guessUp() == 1 && app.guessDown() == 1) ? app.fail() : app.guessCorrect();

        System.out.println("1 ~ 100 까지의 숫자중 추측해 보세요 : ");
        int player3 = sc.nextInt();
        int c = (player3 < result) ? app.guessUp() : (player3 > result) ? app.guessDown() : app.guessCorrect();
        int guessReturn3 = (app.guessUp() == 1 && app.guessDown() == 1) ? app.fail(): app.guessCorrect();

        System.out.println("1 ~ 100 까지의 숫자중 추측해 보세요 : ");
        int player4 = sc.nextInt();
        int guessReturn5 = (app.guessUp() == 1 && app.guessDown() == 1) ? app.fail() : app.guessCorrect();
        int d = (player4 < result) ? app.guessUp() : (player4 > result) ? app.guessDown() : app.guessCorrect();


        System.out.println("1 ~ 100 까지의 숫자중 추측해 보세요 : ");
        int player5 = sc.nextInt();
        int guessReturn7 = (app.guessUp() == 1 && app.guessDown() == 1) ? app.fail() : app.guessCorrect();
        int e = (player5 < result) ? app.guessUp() : (player5 > result) ? app.guessDown() : app.guessCorrect();


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
