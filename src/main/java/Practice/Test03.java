package Practice;

import java.util.Scanner;

public class Test03 {
    // 정답을 저장할 변수
    private static int result;

    public static void main(String[] args) {
        // 1 ~ 100 까지의 숫자 중 원하는 값 찾기 (업 앤 다운) 기회 5번
        result = (int) (Math.random() * 100) + 1; // 난수 생성 부분 수정

        Scanner sc = new Scanner(System.in);
        System.out.println("result = " + result);

        // 첫 번째 시도
        System.out.print("1~100 까지 숫자중 추측해 보세요 ! : ");
        int guess1 = sc.nextInt();
        if (result < guess1) {
            System.out.println("추측하신 값보다 작습니다.");
        } else if (result > guess1) {
            System.out.println("추측하신 값보다 큽니다.");
        } else {
            System.out.println("정답 !!!");
            guessCorrect();
            return;
        }

        // 두 번째 시도
        System.out.print("1~100 까지 숫자중 추측해 보세요 ! : ");
        int guess2 = sc.nextInt();
        if (result < guess2) {
            System.out.println("추측하신 값보다 작습니다.");
        } else if (result > guess2) {
            System.out.println("추측하신 값보다 큽니다.");
        } else {
            System.out.println("정답 !!!");
            guessCorrect();
            return;
        }

        // 세 번째 시도
        System.out.print("1~100 까지 숫자중 추측해 보세요 ! : ");
        int guess3 = sc.nextInt();
        if (result < guess3) {
            System.out.println("추측하신 값보다 작습니다.");
        } else if (result > guess3) {
            System.out.println("추측하신 값보다 큽니다.");
        } else {
            System.out.println("정답 !!!");
            guessCorrect();
            return;
        }

        // 네 번째 시도
        System.out.print("1~100 까지 숫자중 추측해 보세요 ! : ");
        int guess4 = sc.nextInt();
        if (result < guess4) {
            System.out.println("추측하신 값보다 작습니다.");
        } else if (result > guess4) {
            System.out.println("추측하신 값보다 큽니다.");
        } else {
            System.out.println("정답 !!!");
            guessCorrect();
            return;
        }

        // 다섯 번째 시도
        System.out.print("1~100 까지 숫자중 추측해 보세요 ! : ");
        int guess5 = sc.nextInt();
        if (result < guess5) {
            System.out.println("추측하신 값보다 작습니다.");
        } else if (result > guess5) {
            System.out.println("추측하신 값보다 큽니다.");
        } else {
            System.out.println("정답 !!!");
            guessCorrect();
            return;
        }
    }

    // 정답 맞추었을 때 호출되는 메소드
    public static void guessCorrect() {
        System.out.println("축하합니다! 정답을 맞추셨습니다.");
    }
}
