package Practice;

import java.util.Scanner;

public class GuessNumber {


    public static void main(String[] args) {
        // 1 ~ 100 까지의 숫자중 원하는 값 찾기 (업 앤 다운) 기회 5번

        Scanner sc = new Scanner(System.in);
        int result = (int) (Math.random() * 100) + 1;
        System.out.println("result = " + result);

        System.out.print("1~100 까지 숫자중 추측해 보세요 ! : ");
        int player1 = sc.nextInt();
        if (result < player1) {
            System.out.println("추측하신 값보다 작습니다.");
        } else if (result > player1) {
            System.out.println("추측하신 값보다 큽니다.");
        } else {
            System.out.println("정답!!!");
            GuessNumber.guessCorrect();
            return;
        }

        System.out.print("1~100 까지 숫자중 추측해 보세요 ! : ");
        int player2 = sc.nextInt();


        if (result < player2) {
            System.out.println("추측하신 값보다 작습니다.");
        } else if (result > player2) {
            System.out.println("추측하신 값보다 큽니다.");
        } else {
            System.out.println("정답 !!");
            GuessNumber.guessCorrect();
            return;
        }


        System.out.print("1~100 까지 숫자중 추측해 보세요 ! : ");
        int player3 = sc.nextInt();

        if (result < player3) {
            System.out.println("추측하신 값보다 작습니다.");
        } else if (result > player3) {
            System.out.println("추측하신 값보다 큽니다.");
        } else {
            System.out.println("정답 !!");
            GuessNumber.guessCorrect();
            return;
        }


        System.out.print("1~100 까지 숫자중 추측해 보세요 ! : ");
        int player4 = sc.nextInt();

        if (result < player4) {
            System.out.println("추측하신 값보다 작습니다.");
        } else if (result > player4) {
            System.out.println("추측하신 값보다 큽니다.");
        } else {
            System.out.println("정답 !!");
            GuessNumber.guessCorrect();
            return;
        }


        System.out.print("1~100 까지 숫자중 추측해 보세요 ! : ");
        int player5 = sc.nextInt();

        if (result < player5) {
            System.out.println("추측하신 값보다 작습니다.");
        } else if (result > player5) {
            System.out.println("추측하신 값보다 큽니다.");
        } else {
            System.out.println("정답 !!");
            GuessNumber.guessCorrect();
            return;
        }


    }

    public static int guessCorrect() {

        System.out.println("수고하셨습니다~~");

        return 1;
    }


}