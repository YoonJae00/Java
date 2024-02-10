package Practice;

import java.util.Scanner;

public class Laddergame {

    public static void main(String[] args) {
        // 사다리게임

        Scanner sc = new Scanner(System.in);
        System.out.print("사용자의 수를 입력하세요 : ");
        int num = sc.nextInt();
        sc.nextLine();
        if (num == 2) {
            System.out.print("사용자1 입력 : ");
            String user1 = sc.nextLine();
            System.out.print("사용자2 입력 : ");
            String user2 = sc.nextLine();
            System.out.print("당첨항목1 입력 : ");
            String result1 = sc.nextLine();
            System.out.print("당첨항목2 입력 : ");
            String result2 = sc.nextLine();
            int r1 = (int) (Math.random() * 2) + 1;
            int r2a = (int) (Math.random() * 2) + 1;
            if (r1 == r2a) {
                int r2 = (int) (Math.random() * 2) + 1;
                System.out.println(user1 + "님은(1) " + result1 + " 입니다");
                System.out.println(user2 + "님은(1) " + result2 + " 입니다");
            } else {
                int r2 = (int) (Math.random() * 2) + 1;
                System.out.println(user1 + "님은(2) " + result2 + " 입니다");
                System.out.println(user2 + "님은(2) " + result1 + " 입니다");
            }
        } else if (num == 3) {
            System.out.print("사용자1 입력 : ");
            String user1 = sc.nextLine();
            System.out.print("사용자2 입력 : ");
            String user2 = sc.nextLine();
            System.out.print("사용자3 입력 : ");
            String user3 = sc.nextLine();
            System.out.print("당첨항목1 입력 : ");
            String result1 = sc.nextLine();
            System.out.print("당첨항목2 입력 : ");
            String result2 = sc.nextLine();
            System.out.print("당첨항목3 입력 : ");
            String result3 = sc.nextLine();
        } else if (num == 4) {
            System.out.print("사용자1 입력 : ");
            String user1 = sc.nextLine();
            System.out.print("사용자2 입력 : ");
            String user2 = sc.nextLine();
            System.out.print("사용자3 입력 : ");
            String user3 = sc.nextLine();
            System.out.print("사용자4 입력 : ");
            String user4 = sc.nextLine();
            System.out.print("당첨항목1 입력 : ");
            String result1 = sc.nextLine();
            System.out.print("당첨항목2 입력 : ");
            String result2 = sc.nextLine();
            System.out.print("당첨항목3 입력 : ");
            String result3 = sc.nextLine();
            System.out.print("당첨항목4 입력 : ");
            String result4 = sc.nextLine();
        }


    }
}
