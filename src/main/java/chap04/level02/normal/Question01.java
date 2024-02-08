package chap04.level02.normal;

import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) {
        /* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
         * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
         * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("1~10 사이의 정수를 입력하세요 : ");
        int result = sc.nextInt();
        if (result < 1 || result > 10) {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        } else if (result % 2 == 0) {
            System.out.println("짝수다.");
        } else {
            System.out.println("홀수다.");
        }

        System.out.print("1~10 사이의 정수를 입력하세요 : ");
        int result1 = sc.nextInt();
        if (result1 < 1 || result1 > 10) {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        } else if (result1 % 2 == 0) {
            System.out.println("짝수다.");
        } else {
            System.out.println("홀수다.");
        }

    }
}
