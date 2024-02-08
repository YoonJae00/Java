package Practice;

import java.util.Scanner;

public class Money {

    public static void main(String[] args) {
        //문제:
        //어떤 회사의 사원들의 연차가 주어졌을 때, 해당 사원들의 연차에 따라 보너스를 계산하는 프로그램을 작성하세요.
        //1년 미만: 보너스 없음
        //1년 이상 3년 미만: 연봉의 10%
        //3년 이상 5년 미만: 연봉의 15%
        //5년 이상 10년 미만: 연봉의 20%
        //10년 이상: 연봉의 30%
        // 출력예시
        // 연봉을 입력하세요(원)
        // 연차 형식을 선택하세요 (년, 개월) :
        // 연차를 입력하세요(년) : or 연차를 입력하세요(개월) :
        // 당신의 연봉은 ~~ 입니다!
        Scanner sc = new Scanner(System.in);
        System.out.print("연봉을 입력하세요(원) : ");
        int money = sc.nextInt();
        System.out.print("연차 형식을 선택하세요 (년, 개월) : ");
        sc.nextLine();  // 버퍼에서 개행 문자(엔터키)를 소비
        String str = sc.nextLine();
        int year = 0;       // year을 밖으로 뺼수 있다!!!
        int month = 0;      // month을 밖으로 뺼수 있다!!!
        switch (str) {
            case "년":
                System.out.print("연차를 입력하세요(년) : ");
                year = sc.nextInt();
                break;
            case "개월":
                System.out.print("연차를 입력하세요(개월) : ");
                month = sc.nextInt();
                break;
        }
        int finalMonth = 0;
        if (month == 0) {
            finalMonth = year * 12;
        } else {
            finalMonth = month;
        }

        if (finalMonth < 12) {
            System.out.println("당신의 연봉은 " + (int)money + "원 입니다.");
        } else if (finalMonth >= 12 && finalMonth < 36) {
            System.out.println("당신의 연봉은 " + (int)(money * 1.1) + "원 입니다.");
        } else if (finalMonth >= 36 && finalMonth < 60) {
            System.out.println("당신의 연봉은 " + (int)(money * 1.15) + "원 입니다.");
        } else if (finalMonth >= 60 && finalMonth < 120) {
            System.out.println("당신의 연봉은 " + (int)(money * 1.2) + "원 입니다.");
        } else if (finalMonth >= 120) {
            System.out.println("당신의 연봉은 " + (int)(money * 1.5) + "원 입니다.");
        }
    }

}